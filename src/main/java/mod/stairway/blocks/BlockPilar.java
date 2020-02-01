package mod.stairway.blocks;

import mod.shared.blocks.BlockBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockPilar extends BlockBlock implements IWaterLoggable {

    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
    public static final BooleanProperty UP = BooleanProperty.create("up");
    public static final BooleanProperty DOWN = BooleanProperty.create("down");
    public static final IntegerProperty CONNECTION = BlockStateProperties.AGE_0_5;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public static final VoxelShape AABB_X0 = Block.makeCuboidShape(0, 2, 2, 16, 14, 14);

    public static final VoxelShape AABB_X1 = Block.makeCuboidShape(0, 2, 0, 16, 16, 14);
    public static final VoxelShape AABB_X2 = Block.makeCuboidShape(0, 2, 2, 16, 16, 16);
    public static final VoxelShape AABB_X3 = Block.makeCuboidShape(0, 0, 2, 16, 14, 16);
    public static final VoxelShape AABB_X4 = Block.makeCuboidShape(0, 0, 0, 16, 14, 14);

    public static final VoxelShape AABB_Y0 = Block.makeCuboidShape(2, 0, 2, 14, 16, 14);

    public static final VoxelShape AABB_Y1 = Block.makeCuboidShape(0, 0, 0, 14, 16, 14);
    public static final VoxelShape AABB_Y2 = Block.makeCuboidShape(0, 0, 2, 14, 16, 16);
    public static final VoxelShape AABB_Y3 = Block.makeCuboidShape(2, 0, 2, 16, 16, 16);
    public static final VoxelShape AABB_Y4 = Block.makeCuboidShape(2, 0, 0, 16, 16, 14);

    public static final VoxelShape AABB_Z0 = Block.makeCuboidShape(2, 2, 0, 14, 14, 16);

    public static final VoxelShape AABB_Z1 = Block.makeCuboidShape(0, 0, 0, 14, 14, 16);
    public static final VoxelShape AABB_Z2 = Block.makeCuboidShape(0, 2, 0, 14, 16, 16);
    public static final VoxelShape AABB_Z3 = Block.makeCuboidShape(2, 2, 0, 16, 16, 16);
    public static final VoxelShape AABB_Z4 = Block.makeCuboidShape(2, 0, 0, 16, 14, 16);



    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public BlockPilar(String modid, String name, Block block) {
        super(modid, name, block);
        this.setDefaultState(this.stateContainer.getBaseState()
                .with(AXIS, Direction.Axis.Y)
                .with(UP, Boolean.valueOf(false))
                .with(DOWN, Boolean.valueOf(false))
                .with(CONNECTION, Integer.valueOf(0))
                .with(WATERLOGGED, Boolean.valueOf(false))
        );
    }



    //----------------------------------------RENDER----------------------------------------//

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Deprecated
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction.Axis enumfacing = state.get(AXIS);
        int connection = state.get(CONNECTION);
        switch(enumfacing) {
            case X:
                return connection == 4 ? AABB_X4 : connection == 3 ? AABB_X3 : connection == 2 ? AABB_X2 : connection == 1 ? AABB_X1 : AABB_X0;
            case Y:
                return connection == 4 ? AABB_Y4 : connection == 3 ? AABB_Y3 : connection == 2 ? AABB_Y2 : connection == 1 ? AABB_Y1 : AABB_Y0;
            case Z:
                return connection == 4 ? AABB_Z4 : connection == 3 ? AABB_Z3 : connection == 2 ? AABB_Z2 : connection == 1 ? AABB_Z1 : AABB_Z0;
            default:
                return VoxelShapes.fullCube();
        }
    }



    //----------------------------------------SUPPORT----------------------------------------//

    public BlockState rotate(BlockState state, Rotation rot) {
        switch(rot) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch(state.get(AXIS)) {
                    case X:
                        return state.with(AXIS, Direction.Axis.Z);
                    case Z:
                        return state.with(AXIS, Direction.Axis.X);
                    default:
                        return state;
                }
            default:
                return state;
        }
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AXIS, UP, DOWN, CONNECTION, WATERLOGGED);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction.Axis axis = context.getFace().getAxis();
        int connection = SearchNeighbour(context.getWorld(), context.getPos(), axis);
        if(axis == Direction.Axis.X){
            return this.getDefaultState().with(AXIS, context.getFace().getAxis()).with(UP, hasPilar(context.getWorld(), context.getPos().east(), axis, connection)).with(DOWN, hasPilar(context.getWorld(), context.getPos().west(), axis, connection)).with(CONNECTION, connection);
        } else if(axis == Direction.Axis.Z){
            return this.getDefaultState().with(AXIS, context.getFace().getAxis()).with(UP, hasPilar(context.getWorld(), context.getPos().north(), axis, connection)).with(DOWN, hasPilar(context.getWorld(), context.getPos().south(), axis, connection)).with(CONNECTION, connection);
        } else {
            return this.getDefaultState().with(AXIS, context.getFace().getAxis()).with(UP, hasPilar(context.getWorld(), context.getPos().up(), axis, connection)).with(DOWN, hasPilar(context.getWorld(), context.getPos().down(), axis, connection)).with(CONNECTION, connection);
        }
    }

    /** Called by ItemBlocks after a block is set in the world, to allow post-place logic */
    public void onBlockPlacedBy(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        Direction.Axis axis = state.get(AXIS);
        int connection = SearchNeighbour(world, pos, axis);
        if(axis == Direction.Axis.X){
            world.setBlockState(pos, state.with(UP, hasPilar(world, pos.east(), axis, connection)).with(DOWN, hasPilar(world, pos.west(), axis, connection)).with(CONNECTION, connection), 2);
        } else if(axis == Direction.Axis.Z){
            world.setBlockState(pos, state.with(UP, hasPilar(world, pos.north(), axis, connection)).with(DOWN, hasPilar(world, pos.south(), axis, connection)).with(CONNECTION, connection), 2);
        } else {
            world.setBlockState(pos, state.with(UP, hasPilar(world, pos.up(), axis, connection)).with(DOWN, hasPilar(world, pos.down(), axis, connection)).with(CONNECTION, connection), 2);
        }
        UpdateNeighbours(world, pos);
    }

    private void UpdatePlacement(World world, BlockPos pos){
        Direction.Axis axis = world.getBlockState(pos).get(AXIS);
        int connection = SearchNeighbour(world, pos, axis);
        if(axis == Direction.Axis.X){
            world.setBlockState(pos, world.getBlockState(pos).with(UP, hasPilar(world, pos.east(), axis, connection)).with(DOWN, hasPilar(world, pos.west(), axis, connection)).with(CONNECTION, connection), 2);
        } else if(axis == Direction.Axis.Z){
            world.setBlockState(pos, world.getBlockState(pos).with(UP, hasPilar(world, pos.north(), axis, connection)).with(DOWN, hasPilar(world, pos.south(), axis, connection)).with(CONNECTION, connection), 2);
        } else {
            world.setBlockState(pos, world.getBlockState(pos).with(UP, hasPilar(world, pos.up(), axis, connection)).with(DOWN, hasPilar(world, pos.down(), axis, connection)).with(CONNECTION, connection), 2);
        }
    }

    @Deprecated
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        Direction.Axis axis = state.get(AXIS);
        int connection = SearchNeighbour(world, pos, axis);
        if(axis == Direction.Axis.X){
            world.setBlockState(pos, state.with(UP, hasPilar(world, pos.east(), axis, connection)).with(DOWN, hasPilar(world, pos.west(), axis, connection)).with(CONNECTION, connection), 2);
        } else if(axis == Direction.Axis.Z){
            world.setBlockState(pos, state.with(UP, hasPilar(world, pos.north(), axis, connection)).with(DOWN, hasPilar(world, pos.south(), axis, connection)).with(CONNECTION, connection), 2);
        } else {
            world.setBlockState(pos, state.with(UP, hasPilar(world, pos.up(), axis, connection)).with(DOWN, hasPilar(world, pos.down(), axis, connection)).with(CONNECTION, connection), 2);
        }
        UpdateNeighbours(world, pos);
    }

    private boolean hasPilar(World world, BlockPos pos, Direction.Axis axis, int connection){
        Block pilar = world.getBlockState(pos).getBlock();
        if(pilar instanceof BlockPilar){
            if(world.getBlockState(pos).get(AXIS) == axis && connection == world.getBlockState(pos).get(CONNECTION)){
                return true;
            }
        }
        return false;
    }

    public boolean ValidNeighbour(Direction.Axis axis, World world, BlockPos pos){
        return world.getBlockState(pos).getBlock() instanceof BlockPilar && world.getBlockState(pos).get(AXIS) == axis;
    }

    public int SearchNeighbour(World world, BlockPos pos, Direction.Axis axis){
        boolean nn = ValidNeighbour(axis, world, axis == Direction.Axis.Y ? pos.north()        : axis == Direction.Axis.X ? pos.north()        : pos.down()       );
        boolean ne = ValidNeighbour(axis, world, axis == Direction.Axis.Y ? pos.north().east() : axis == Direction.Axis.X ? pos.north().down() : pos.down().east());
        boolean ee = ValidNeighbour(axis, world, axis == Direction.Axis.Y ? pos.east()         : axis == Direction.Axis.X ? pos.down()         : pos.east()        );
        boolean se = ValidNeighbour(axis, world, axis == Direction.Axis.Y ? pos.south().east() : axis == Direction.Axis.X ? pos.south().down() : pos.up().east());
        boolean ss = ValidNeighbour(axis, world, axis == Direction.Axis.Y ? pos.south()        : axis == Direction.Axis.X ? pos.south()        : pos.up()       );
        boolean sw = ValidNeighbour(axis, world, axis == Direction.Axis.Y ? pos.south().west() : axis == Direction.Axis.X ? pos.south().up()   : pos.up().west());
        boolean ww = ValidNeighbour(axis, world, axis == Direction.Axis.Y ? pos.west()         : axis == Direction.Axis.X ? pos.up()           : pos.west()        );
        boolean nw = ValidNeighbour(axis, world, axis == Direction.Axis.Y ? pos.north().west() : axis == Direction.Axis.X ? pos.north().up()   : pos.down().west());

        if(nn && nw && ww) return 1;
        if(ww && sw && ss) return 2;
        if(ss && se && ee) return 3;
        if(ee && ne && nn) return 4;

        return 0;
    }

    private void UpdateNeighbours(World world, BlockPos pos){
        for(int x = -1; x <= 1; x++){
            for(int y = -1; y <= 1; y++) {
                for (int z = -1; z <= 1; z++) {
                    if (world.getBlockState(pos.add(x, y, z)).getBlock() instanceof BlockPilar)
                        UpdatePlacement(world, pos.add(x, y, z));
                }
            }
        }
        //for(int x = -1; x <= 1; x++){
        //    for(int z = -1; z <= 1; z++){
        //        if(world.getBlockState(pos.add(x, 0, z)).getBlock() instanceof  BlockPilar) UpdatePlacement(world, pos.add(x, 0, z));
        //    }
        //}
        //for(int x = -1; x <= 1; x++){
        //    for(int z = -1; z <= 1; z++){
        //        if(world.getBlockState(pos.add(x, -1, z)).getBlock() instanceof  BlockPilar) UpdatePlacement(world, pos.add(x, -1, z));
        //    }
        //}
        //for(int x = -1; x <= 1; x++){
        //    for(int z = -1; z <= 1; z++){
        //        if(world.getBlockState(pos.add(x, +1, z)).getBlock() instanceof  BlockPilar) UpdatePlacement(world, pos.add(x, +1, z));
        //    }
        //}
    }

    //--------------------------------

    public IFluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    public boolean receiveFluid(IWorld worldIn, BlockPos pos, BlockState state, IFluidState fluidStateIn) {
        return IWaterLoggable.super.receiveFluid(worldIn, pos, state, fluidStateIn);
    }

    public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, BlockState state, Fluid fluidIn) {
        return IWaterLoggable.super.canContainFluid(worldIn, pos, state, fluidIn);
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(WATERLOGGED)) {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }

        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        switch(type) {
            case LAND:
                return false;
            case WATER:
                return worldIn.getFluidState(pos).isTagged(FluidTags.WATER);
            case AIR:
                return false;
            default:
                return false;
        }
    }

}
