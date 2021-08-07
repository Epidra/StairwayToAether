package mod.stairway.block;

import mod.lucky77.block.BlockBase;
import mod.lucky77.blockentity.BlockEntityBase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class BlockPilar extends BlockBase implements SimpleWaterloggedBlock {

    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
    public static final BooleanProperty UP = BooleanProperty.create("up");
    public static final BooleanProperty DOWN = BooleanProperty.create("down");
    public static final IntegerProperty CONNECTION = BlockStateProperties.AGE_5;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public static final VoxelShape AABB_X0 = Block.box(0, 2, 2, 16, 14, 14);

    public static final VoxelShape AABB_X1 = Block.box(0, 2, 0, 16, 16, 14);
    public static final VoxelShape AABB_X2 = Block.box(0, 2, 2, 16, 16, 16);
    public static final VoxelShape AABB_X3 = Block.box(0, 0, 2, 16, 14, 16);
    public static final VoxelShape AABB_X4 = Block.box(0, 0, 0, 16, 14, 14);

    public static final VoxelShape AABB_Y0 = Block.box(2, 0, 2, 14, 16, 14);

    public static final VoxelShape AABB_Y1 = Block.box(0, 0, 0, 14, 16, 14);
    public static final VoxelShape AABB_Y2 = Block.box(0, 0, 2, 14, 16, 16);
    public static final VoxelShape AABB_Y3 = Block.box(2, 0, 2, 16, 16, 16);
    public static final VoxelShape AABB_Y4 = Block.box(2, 0, 0, 16, 16, 14);

    public static final VoxelShape AABB_Z0 = Block.box(2, 2, 0, 14, 14, 16);

    public static final VoxelShape AABB_Z1 = Block.box(0, 0, 0, 14, 14, 16);
    public static final VoxelShape AABB_Z2 = Block.box(0, 2, 0, 14, 16, 16);
    public static final VoxelShape AABB_Z3 = Block.box(2, 2, 0, 16, 16, 16);
    public static final VoxelShape AABB_Z4 = Block.box(2, 0, 0, 16, 14, 16);




    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public BlockPilar(Block block) {
        super(block);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(AXIS, Direction.Axis.Y)
                .setValue(UP, false)
                .setValue(DOWN, false)
                .setValue(CONNECTION, 0)
                .setValue(WATERLOGGED, false)
        );
    }




    //----------------------------------------RENDER----------------------------------------//

    //public BlockRenderType getRenderShape(BlockState state) {
    //    return BlockRenderType.MODEL;
    //}

    @Deprecated
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        Direction.Axis enumfacing = state.getValue(AXIS);
        int connection = state.getValue(CONNECTION);
        switch(enumfacing) {
            case X:
                return connection == 4 ? AABB_X4 : connection == 3 ? AABB_X3 : connection == 2 ? AABB_X2 : connection == 1 ? AABB_X1 : AABB_X0;
            case Y:
                return connection == 4 ? AABB_Y4 : connection == 3 ? AABB_Y3 : connection == 2 ? AABB_Y2 : connection == 1 ? AABB_Y1 : AABB_Y0;
            case Z:
                return connection == 4 ? AABB_Z4 : connection == 3 ? AABB_Z3 : connection == 2 ? AABB_Z2 : connection == 1 ? AABB_Z1 : AABB_Z0;
            default:
                return Shapes.block();
        }
    }




    //----------------------------------------PLACEMENT----------------------------------------//

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction.Axis axis = context.getClickedFace().getAxis();
        int connection = searchNeighbour(context.getLevel(), context.getClickedPos(), axis);
        if(axis == Direction.Axis.X){
            return this.defaultBlockState().setValue(AXIS, context.getClickedFace().getAxis()).setValue(UP, hasPilar(context.getLevel(), context.getClickedPos().east(), axis, connection)).setValue(DOWN, hasPilar(context.getLevel(), context.getClickedPos().west(), axis, connection)).setValue(CONNECTION, connection);
        } else if(axis == Direction.Axis.Z){
            return this.defaultBlockState().setValue(AXIS, context.getClickedFace().getAxis()).setValue(UP, hasPilar(context.getLevel(), context.getClickedPos().north(), axis, connection)).setValue(DOWN, hasPilar(context.getLevel(), context.getClickedPos().south(), axis, connection)).setValue(CONNECTION, connection);
        } else {
            return this.defaultBlockState().setValue(AXIS, context.getClickedFace().getAxis()).setValue(UP, hasPilar(context.getLevel(), context.getClickedPos().above(), axis, connection)).setValue(DOWN, hasPilar(context.getLevel(), context.getClickedPos().below(), axis, connection)).setValue(CONNECTION, connection);
        }
    }

    /** Called by ItemBlocks after a block is set in the world, to allow post-place logic */
    public void setPlacedBy(Level world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        Direction.Axis axis = state.getValue(AXIS);
        int connection = searchNeighbour(world, pos, axis);
        if(axis == Direction.Axis.X){
            world.setBlock(pos, state.setValue(UP, hasPilar(world, pos.east(), axis, connection)).setValue(DOWN, hasPilar(world, pos.west(), axis, connection)).setValue(CONNECTION, connection), 2);
        } else if(axis == Direction.Axis.Z){
            world.setBlock(pos, state.setValue(UP, hasPilar(world, pos.north(), axis, connection)).setValue(DOWN, hasPilar(world, pos.south(), axis, connection)).setValue(CONNECTION, connection), 2);
        } else {
            world.setBlock(pos, state.setValue(UP, hasPilar(world, pos.above(), axis, connection)).setValue(DOWN, hasPilar(world, pos.below(), axis, connection)).setValue(CONNECTION, connection), 2);
        }
        updateNeighbours(world, pos);
    }

    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.getLiquidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
        }
        return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }




    //----------------------------------------INTERACTION----------------------------------------//

    @Override
    public void interact(Level world, BlockPos pos, Player player, BlockEntityBase tile) {

    }




    //----------------------------------------UPDATE----------------------------------------//

    @Deprecated
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        Direction.Axis axis = state.getValue(AXIS);
        int connection = searchNeighbour(world, pos, axis);
        if(axis == Direction.Axis.X){
            world.setBlock(pos, state.setValue(UP, hasPilar(world, pos.east(), axis, connection)).setValue(DOWN, hasPilar(world, pos.west(), axis, connection)).setValue(CONNECTION, connection), 2);
        } else if(axis == Direction.Axis.Z){
            world.setBlock(pos, state.setValue(UP, hasPilar(world, pos.north(), axis, connection)).setValue(DOWN, hasPilar(world, pos.south(), axis, connection)).setValue(CONNECTION, connection), 2);
        } else {
            world.setBlock(pos, state.setValue(UP, hasPilar(world, pos.above(), axis, connection)).setValue(DOWN, hasPilar(world, pos.below(), axis, connection)).setValue(CONNECTION, connection), 2);
        }
        updateNeighbours(world, pos);
    }




    //----------------------------------------SUPPORT----------------------------------------//

    public BlockState rotate(BlockState state, Rotation rot) {
        switch(rot) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch(state.getValue(AXIS)) {
                    case X:  return state.setValue(AXIS, Direction.Axis.Z);
                    case Z:  return state.setValue(AXIS, Direction.Axis.X);
                    default: return state;
                }
            default: return state;
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AXIS, UP, DOWN, CONNECTION, WATERLOGGED);
    }

    private void updatePlacement(Level world, BlockPos pos){
        Direction.Axis axis = world.getBlockState(pos).getValue(AXIS);
        int connection = searchNeighbour(world, pos, axis);
        if(axis == Direction.Axis.X){
            world.setBlock(pos, world.getBlockState(pos).setValue(UP, hasPilar(world, pos.east(), axis, connection)).setValue(DOWN, hasPilar(world, pos.west(), axis, connection)).setValue(CONNECTION, connection), 2);
        } else if(axis == Direction.Axis.Z){
            world.setBlock(pos, world.getBlockState(pos).setValue(UP, hasPilar(world, pos.north(), axis, connection)).setValue(DOWN, hasPilar(world, pos.south(), axis, connection)).setValue(CONNECTION, connection), 2);
        } else {
            world.setBlock(pos, world.getBlockState(pos).setValue(UP, hasPilar(world, pos.above(), axis, connection)).setValue(DOWN, hasPilar(world, pos.below(), axis, connection)).setValue(CONNECTION, connection), 2);
        }
    }

    private boolean hasPilar(Level world, BlockPos pos, Direction.Axis axis, int connection){
        Block pilar = world.getBlockState(pos).getBlock();
        if(pilar instanceof BlockPilar){
            if(world.getBlockState(pos).getValue(AXIS) == axis && connection == world.getBlockState(pos).getValue(CONNECTION)){
                return true;
            }
        }
        return false;
    }

    public boolean validNeighbour(Direction.Axis axis, Level world, BlockPos pos){
        return world.getBlockState(pos).getBlock() instanceof BlockPilar && world.getBlockState(pos).getValue(AXIS) == axis;
    }

    public int searchNeighbour(Level world, BlockPos pos, Direction.Axis axis){
        boolean nn = validNeighbour(axis, world, axis == Direction.Axis.Y ? pos.north()        : axis == Direction.Axis.X ? pos.north()         : pos.below()       );
        boolean ne = validNeighbour(axis, world, axis == Direction.Axis.Y ? pos.north().east() : axis == Direction.Axis.X ? pos.north().below() : pos.below().east());
        boolean ee = validNeighbour(axis, world, axis == Direction.Axis.Y ? pos.east()         : axis == Direction.Axis.X ? pos.below()         : pos.east()        );
        boolean se = validNeighbour(axis, world, axis == Direction.Axis.Y ? pos.south().east() : axis == Direction.Axis.X ? pos.south().below() : pos.above().east());
        boolean ss = validNeighbour(axis, world, axis == Direction.Axis.Y ? pos.south()        : axis == Direction.Axis.X ? pos.south()         : pos.above()       );
        boolean sw = validNeighbour(axis, world, axis == Direction.Axis.Y ? pos.south().west() : axis == Direction.Axis.X ? pos.south().above() : pos.above().west());
        boolean ww = validNeighbour(axis, world, axis == Direction.Axis.Y ? pos.west()         : axis == Direction.Axis.X ? pos.above()         : pos.west()        );
        boolean nw = validNeighbour(axis, world, axis == Direction.Axis.Y ? pos.north().west() : axis == Direction.Axis.X ? pos.north().above() : pos.below().west());

        if(nn && nw && ww) return 1;
        if(ww && sw && ss) return 2;
        if(ss && se && ee) return 3;
        if(ee && ne && nn) return 4;

        return 0;
    }

    private void updateNeighbours(Level world, BlockPos pos){
        for(int x = -1; x <= 1; x++){
            for(int y = -1; y <= 1; y++) {
                for (int z = -1; z <= 1; z++) {
                    if (world.getBlockState(pos.offset(x, y, z)).getBlock() instanceof BlockPilar)
                        updatePlacement(world, pos.offset(x, y, z));
                }
            }
        }
    }

    public FluidState getFluidState(BlockState p_204507_1_) {
        return p_204507_1_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_204507_1_);
    }

    public boolean isPathfindable(BlockGetter level, BlockPos pos, PathComputationType type) {
        if (type == PathComputationType.WATER) return level.getFluidState(pos).is(FluidTags.WATER);
        return false;
    }

}
