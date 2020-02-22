package mod.stairway.blocks;

import mod.shared.blocks.BlockBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ILiquidContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.IFluidState;
import net.minecraft.init.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
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

public class BlockChain extends BlockBlock implements ILiquidContainer {

    public static final EnumProperty<EnumFacing.Axis> AXIS = BlockStateProperties.AXIS;
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
    public BlockChain(String modid, String name, Block block) {
        super(modid, name, block);
        this.setDefaultState(this.stateContainer.getBaseState().with(AXIS, EnumFacing.Axis.Y).with(OFFSET, Boolean.valueOf(false)).with(WATERLOGGED, Boolean.valueOf(false)));
    }



    //----------------------------------------RENDER----------------------------------------//

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    public VoxelShape getShape(IBlockState state, IBlockReader worldIn, BlockPos pos) {
        EnumFacing.Axis enumfacing = state.get(AXIS);
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

    @Deprecated
    public boolean isSolid(IBlockState state) {
        return true;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
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

    public boolean isLadder(IBlockState state, net.minecraft.world.IWorldReader world, BlockPos pos, EntityLiving entity) {
        return true;
    }

    protected void fillStateContainer(StateContainer.Builder<Block, IBlockState> builder) {
        builder.add(AXIS, OFFSET, WATERLOGGED);
    }

    @Nullable
    public IBlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(AXIS, context.getFace().getAxis()).with(OFFSET, isOffset(context.getPos()));
    }

    /** Called by ItemBlocks after a block is set in the world, to allow post-place logic */
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, @Nullable EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.with(OFFSET, isOffset(pos)), 2);
    }

    private boolean isOffset(BlockPos pos) {
        int counter = 0;
        if(Math.abs(pos.getX()) % 2 == 1) counter++;
        if(Math.abs(pos.getY()) % 2 == 1) counter++;
        if(Math.abs(pos.getZ()) % 2 == 1) counter++;
        return counter % 2 == 1;
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
