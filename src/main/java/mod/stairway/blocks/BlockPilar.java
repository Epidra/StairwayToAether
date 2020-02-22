package mod.stairway.blocks;

import mod.shared.blocks.BlockBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ILiquidContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.IFluidState;
import net.minecraft.init.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockPilar extends BlockBlock implements ILiquidContainer {

    public static final EnumProperty<EnumFacing.Axis> AXIS = BlockStateProperties.AXIS;
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
                .with(AXIS, EnumFacing.Axis.Y)
                .with(UP, Boolean.valueOf(false))
                .with(DOWN, Boolean.valueOf(false))
                .with(CONNECTION, Integer.valueOf(0))
                .with(WATERLOGGED, Boolean.valueOf(false))
        );
    }



    //----------------------------------------RENDER----------------------------------------//

    //public BlockRenderType getRenderType(BlockState state) {
    //    return BlockRenderType.MODEL;
    //}

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }

    public VoxelShape getShape(IBlockState state, IBlockReader worldIn, BlockPos pos) {
        EnumFacing.Axis enumfacing = state.get(AXIS);
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

    public IBlockState rotate(IBlockState state, Rotation rot) {
        switch(rot) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch(state.get(AXIS)) {
                    case X:
                        return state.with(AXIS, EnumFacing.Axis.Z);
                    case Z:
                        return state.with(AXIS, EnumFacing.Axis.X);
                    default:
                        return state;
                }
            default:
                return state;
        }
    }

    protected void fillStateContainer(StateContainer.Builder<Block, IBlockState> builder) {
        builder.add(AXIS, UP, DOWN, CONNECTION, WATERLOGGED);
    }

    @Nullable
    public IBlockState getStateForPlacement(BlockItemUseContext context) {
        EnumFacing.Axis axis = context.getFace().getAxis();
        int connection = SearchNeighbour(context.getWorld(), context.getPos(), axis);
        if(axis == EnumFacing.Axis.X){
            return this.getDefaultState().with(AXIS, context.getFace().getAxis()).with(UP, hasPilar(context.getWorld(), context.getPos().east(), axis, connection)).with(DOWN, hasPilar(context.getWorld(), context.getPos().west(), axis, connection)).with(CONNECTION, connection);
        } else if(axis == EnumFacing.Axis.Z){
            return this.getDefaultState().with(AXIS, context.getFace().getAxis()).with(UP, hasPilar(context.getWorld(), context.getPos().north(), axis, connection)).with(DOWN, hasPilar(context.getWorld(), context.getPos().south(), axis, connection)).with(CONNECTION, connection);
        } else {
            return this.getDefaultState().with(AXIS, context.getFace().getAxis()).with(UP, hasPilar(context.getWorld(), context.getPos().up(), axis, connection)).with(DOWN, hasPilar(context.getWorld(), context.getPos().down(), axis, connection)).with(CONNECTION, connection);
        }
    }

    /** Called by ItemBlocks after a block is set in the world, to allow post-place logic */
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, @Nullable EntityLivingBase placer, ItemStack stack) {
        EnumFacing.Axis axis = state.get(AXIS);
        int connection = SearchNeighbour(world, pos, axis);
        if(axis == EnumFacing.Axis.X){
            world.setBlockState(pos, state.with(UP, hasPilar(world, pos.east(), axis, connection)).with(DOWN, hasPilar(world, pos.west(), axis, connection)).with(CONNECTION, connection), 2);
        } else if(axis == EnumFacing.Axis.Z){
            world.setBlockState(pos, state.with(UP, hasPilar(world, pos.north(), axis, connection)).with(DOWN, hasPilar(world, pos.south(), axis, connection)).with(CONNECTION, connection), 2);
        } else {
            world.setBlockState(pos, state.with(UP, hasPilar(world, pos.up(), axis, connection)).with(DOWN, hasPilar(world, pos.down(), axis, connection)).with(CONNECTION, connection), 2);
        }
        UpdateNeighbours(world, pos);
    }

    private void UpdatePlacement(World world, BlockPos pos){
        EnumFacing.Axis axis = world.getBlockState(pos).get(AXIS);
        int connection = SearchNeighbour(world, pos, axis);
        if(axis == EnumFacing.Axis.X){
            world.setBlockState(pos, world.getBlockState(pos).with(UP, hasPilar(world, pos.east(), axis, connection)).with(DOWN, hasPilar(world, pos.west(), axis, connection)).with(CONNECTION, connection), 2);
        } else if(axis == EnumFacing.Axis.Z){
            world.setBlockState(pos, world.getBlockState(pos).with(UP, hasPilar(world, pos.north(), axis, connection)).with(DOWN, hasPilar(world, pos.south(), axis, connection)).with(CONNECTION, connection), 2);
        } else {
            world.setBlockState(pos, world.getBlockState(pos).with(UP, hasPilar(world, pos.up(), axis, connection)).with(DOWN, hasPilar(world, pos.down(), axis, connection)).with(CONNECTION, connection), 2);
        }
    }

    @Deprecated
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos) {
        EnumFacing.Axis axis = state.get(AXIS);
        int connection = SearchNeighbour(world, pos, axis);
        if(axis == EnumFacing.Axis.X){
            world.setBlockState(pos, state.with(UP, hasPilar(world, pos.east(), axis, connection)).with(DOWN, hasPilar(world, pos.west(), axis, connection)).with(CONNECTION, connection), 2);
        } else if(axis == EnumFacing.Axis.Z){
            world.setBlockState(pos, state.with(UP, hasPilar(world, pos.north(), axis, connection)).with(DOWN, hasPilar(world, pos.south(), axis, connection)).with(CONNECTION, connection), 2);
        } else {
            world.setBlockState(pos, state.with(UP, hasPilar(world, pos.up(), axis, connection)).with(DOWN, hasPilar(world, pos.down(), axis, connection)).with(CONNECTION, connection), 2);
        }
        UpdateNeighbours(world, pos);
    }

    private boolean hasPilar(World world, BlockPos pos, EnumFacing.Axis axis, int connection){
        Block pilar = world.getBlockState(pos).getBlock();
        if(pilar instanceof BlockPilar){
            if(world.getBlockState(pos).get(AXIS) == axis && connection == world.getBlockState(pos).get(CONNECTION)){
                return true;
            }
        }
        return false;
    }

    public boolean ValidNeighbour(EnumFacing.Axis axis, World world, BlockPos pos){
        return world.getBlockState(pos).getBlock() instanceof BlockPilar && world.getBlockState(pos).get(AXIS) == axis;
    }

    public int SearchNeighbour(World world, BlockPos pos, EnumFacing.Axis axis){
        boolean nn = ValidNeighbour(axis, world, axis == EnumFacing.Axis.Y ? pos.north()        : axis == EnumFacing.Axis.X ? pos.north()        : pos.down()       );
        boolean ne = ValidNeighbour(axis, world, axis == EnumFacing.Axis.Y ? pos.north().east() : axis == EnumFacing.Axis.X ? pos.north().down() : pos.down().east());
        boolean ee = ValidNeighbour(axis, world, axis == EnumFacing.Axis.Y ? pos.east()         : axis == EnumFacing.Axis.X ? pos.down()         : pos.east()        );
        boolean se = ValidNeighbour(axis, world, axis == EnumFacing.Axis.Y ? pos.south().east() : axis == EnumFacing.Axis.X ? pos.south().down() : pos.up().east());
        boolean ss = ValidNeighbour(axis, world, axis == EnumFacing.Axis.Y ? pos.south()        : axis == EnumFacing.Axis.X ? pos.south()        : pos.up()       );
        boolean sw = ValidNeighbour(axis, world, axis == EnumFacing.Axis.Y ? pos.south().west() : axis == EnumFacing.Axis.X ? pos.south().up()   : pos.up().west());
        boolean ww = ValidNeighbour(axis, world, axis == EnumFacing.Axis.Y ? pos.west()         : axis == EnumFacing.Axis.X ? pos.up()           : pos.west()        );
        boolean nw = ValidNeighbour(axis, world, axis == EnumFacing.Axis.Y ? pos.north().west() : axis == EnumFacing.Axis.X ? pos.north().up()   : pos.down().west());

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

    public IBlockState updatePostPlacement(IBlockState stateIn, EnumFacing facing, IBlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(WATERLOGGED)) {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }
        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public Fluid pickupFluid(IWorld worldIn, BlockPos pos, IBlockState state) {
        if (state.get(WATERLOGGED)) {
            worldIn.setBlockState(pos, state.with(WATERLOGGED, Boolean.valueOf(false)), 3);
            return Fluids.WATER;
        } else {
            return Fluids.EMPTY;
        }
    }

    public IFluidState getFluidState(IBlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, IBlockState state, Fluid fluidIn) {
        return !state.get(WATERLOGGED) && fluidIn == Fluids.WATER;
    }

    public boolean receiveFluid(IWorld worldIn, BlockPos pos, IBlockState state, IFluidState fluidStateIn) {
        if (!state.get(WATERLOGGED) && fluidStateIn.getFluid() == Fluids.WATER) {
            if (!worldIn.isRemote()) {
                worldIn.setBlockState(pos, state.with(WATERLOGGED, Boolean.valueOf(true)), 3);
                worldIn.getPendingFluidTicks().scheduleTick(pos, fluidStateIn.getFluid(), fluidStateIn.getFluid().getTickRate(worldIn));
            }

            return true;
        } else {
            return false;
        }
    }

    public boolean allowsMovement(IBlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return false;
    }

}
