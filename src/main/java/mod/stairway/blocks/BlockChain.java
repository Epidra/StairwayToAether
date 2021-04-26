package mod.stairway.blocks;

import mod.lucky77.blocks.BlockBase;
import mod.lucky77.tileentities.TileBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
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

public class BlockChain extends BlockBase implements IWaterLoggable {

    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
    public static final BooleanProperty OFFSET = BlockStateProperties.INVERTED;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public static final VoxelShape AABB_X0 = Block.box(0, 3, 6, 16, 13, 10);
    public static final VoxelShape AABB_X1 = Block.box(0, 6, 3, 16, 10, 13);
    public static final VoxelShape AABB_Y0 = Block.box(6, 0, 3, 10, 16, 13);
    public static final VoxelShape AABB_Y1 = Block.box(3, 0, 6, 13, 16, 10);
    public static final VoxelShape AABB_Z0 = Block.box(6, 3, 0, 10, 13, 16);
    public static final VoxelShape AABB_Z1 = Block.box(3, 6, 0, 13, 10, 16);




    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public BlockChain(Block block) {
        super(block);
        this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y).setValue(OFFSET, false).setValue(WATERLOGGED, false));
    }

    @Override
    public void interact(World world, BlockPos pos, PlayerEntity player, TileBase tile) {

    }


    //----------------------------------------PLACEMENT----------------------------------------//

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(AXIS, context.getClickedFace().getAxis()).setValue(OFFSET, isOffset(context.getClickedPos()));
    }

    /** Called by ItemBlocks after a block is set in the world, to allow post-place logic */
    public void setPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        worldIn.setBlock(pos, state.setValue(OFFSET, isOffset(pos)), 2);
    }

    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.getLiquidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
        }
        return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }




    //----------------------------------------RENDER----------------------------------------//

    @Deprecated
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction.Axis enumfacing = state.getValue(AXIS);
        boolean offset = state.getValue(OFFSET);
        switch(enumfacing) {
            case X:  return offset ? AABB_X1 : AABB_X0;
            case Y:  return offset ? AABB_Y1 : AABB_Y0;
            case Z:  return offset ? AABB_Z1 : AABB_Z0;
            default: return VoxelShapes.block();
        }
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

    @Override
    public boolean isLadder(BlockState state, net.minecraft.world.IWorldReader world, BlockPos pos, LivingEntity entity) {
        return true;
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AXIS, OFFSET, WATERLOGGED);
    }

    private boolean isOffset(BlockPos pos) {
        int counter = 0;
        if(Math.abs(pos.getX()) % 2 == 1) counter++;
        if(Math.abs(pos.getY()) % 2 == 1) counter++;
        if(Math.abs(pos.getZ()) % 2 == 1) counter++;
        return counter % 2 == 1;
    }

    public FluidState getFluidState(BlockState p_204507_1_) {
        return p_204507_1_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_204507_1_);
    }

    public boolean isPathfindable(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        if (type == PathType.WATER) return worldIn.getFluidState(pos).is(FluidTags.WATER);
        return false;
    }

}
