package mod.stairway.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
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

public class BlockChain extends BlockBlock implements IWaterLoggable {

    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
    public static final BooleanProperty OFFSET = BlockStateProperties.INVERTED;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public static final VoxelShape AABB_X0 = Block.makeCuboidShape(0, 3, 6, 16, 13, 10);
    public static final VoxelShape AABB_X1 = Block.makeCuboidShape(0, 6, 3, 16, 10, 13);
    public static final VoxelShape AABB_Y0 = Block.makeCuboidShape(6, 0, 3, 10, 16, 13);
    public static final VoxelShape AABB_Y1 = Block.makeCuboidShape(3, 0, 6, 13, 16, 10);
    public static final VoxelShape AABB_Z0 = Block.makeCuboidShape(6, 3, 0, 10, 13, 16);
    public static final VoxelShape AABB_Z1 = Block.makeCuboidShape(3, 6, 0, 13, 10, 16);




    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public BlockChain(Block block) {
        super(block);
        this.setDefaultState(this.stateContainer.getBaseState().with(AXIS, Direction.Axis.Y).with(OFFSET, Boolean.valueOf(false)).with(WATERLOGGED, Boolean.valueOf(false)));
    }




    //----------------------------------------PLACEMENT----------------------------------------//

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(AXIS, context.getFace().getAxis()).with(OFFSET, isOffset(context.getPos()));
    }

    /** Called by ItemBlocks after a block is set in the world, to allow post-place logic */
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.with(OFFSET, isOffset(pos)), 2);
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(WATERLOGGED)) {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }
        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }




    //----------------------------------------RENDER----------------------------------------//

    @Deprecated
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction.Axis enumfacing = state.get(AXIS);
        boolean offset = state.get(OFFSET);
        switch(enumfacing) {
            case X:
                return offset ? AABB_X1 : AABB_X0;
            case Y:
                return offset ? AABB_Y1 : AABB_Y0;
            case Z:
                return offset ? AABB_Z1 : AABB_Z0;
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

    @Override
    public boolean isLadder(BlockState state, net.minecraft.world.IWorldReader world, BlockPos pos, LivingEntity entity) {
        return true;
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AXIS, OFFSET, WATERLOGGED);
    }

    private boolean isOffset(BlockPos pos) {
        int counter = 0;
        if(Math.abs(pos.getX()) % 2 == 1) counter++;
        if(Math.abs(pos.getY()) % 2 == 1) counter++;
        if(Math.abs(pos.getZ()) % 2 == 1) counter++;
        return counter % 2 == 1;
    }

    public IFluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    public boolean receiveFluid(IWorld worldIn, BlockPos pos, BlockState state, IFluidState fluidStateIn) {
        return IWaterLoggable.super.receiveFluid(worldIn, pos, state, fluidStateIn);
    }

    public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, BlockState state, Fluid fluidIn) {
        return IWaterLoggable.super.canContainFluid(worldIn, pos, state, fluidIn);
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
