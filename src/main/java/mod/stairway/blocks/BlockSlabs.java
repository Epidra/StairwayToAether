package mod.stairway.blocks;

import mod.shared.blocks.BlockBlock;
import mod.stairway.StairwayConfig;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import javax.annotation.Nullable;

public class BlockSlabs extends BlockBlock implements IWaterLoggable {

    public static final EnumProperty<EnumBlockHalf> TYPE = EnumProperty.create("type", EnumBlockHalf.class);
    public static final net.minecraft.state.BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    
    protected static final VoxelShape AABB_BOTTOM = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 1.0D*16, 0.5D*16, 1.0D*16);
    protected static final VoxelShape AABB_TOP    = Block.makeCuboidShape(0.0D*16, 0.5D*16, 0.0D*16, 1.0D*16, 1.0D*16, 1.0D*16);
    protected static final VoxelShape AABB_EAST   = Block.makeCuboidShape(0.5D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 1.0D*16);
    protected static final VoxelShape AABB_WEST   = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 0.5D*16, 1.0D*16, 1.0D*16);
    protected static final VoxelShape AABB_SOUTH  = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.5D*16, 1.0D*16, 1.0D*16, 1.0D*16);
    protected static final VoxelShape AABB_NORTH  = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 0.5D*16);
    protected static final VoxelShape AABB_FULL   = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 1.0D*16);



    //----------------------------------------

    /** Default Constructor */
    public BlockSlabs(String modid, String name, Block block) {
        super(modid, name, block);
        this.setDefaultState(this.stateContainer.getBaseState().with(TYPE, EnumBlockHalf.BOTTOM).with(WATERLOGGED, Boolean.valueOf(false)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED);
    }

    public boolean func_220074_n(BlockState state) {
        return state.get(TYPE) != EnumBlockHalf.FULL;
    }



    //---------------------------------------

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.SOLID;
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Deprecated
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        if (state.get(TYPE) == EnumBlockHalf.TOP)   { return AABB_TOP; }
        else if (state.get(TYPE) == EnumBlockHalf.BOTTOM){ return AABB_BOTTOM; }
        else if (state.get(TYPE) == EnumBlockHalf.NORTH) { return AABB_NORTH; }
        else if (state.get(TYPE) == EnumBlockHalf.SOUTH) { return AABB_SOUTH; }
        else if (state.get(TYPE) == EnumBlockHalf.WEST)  { return AABB_WEST; }
        else if (state.get(TYPE) == EnumBlockHalf.EAST)  { return AABB_EAST; }
        return AABB_FULL;
    }



    //---------------------------------

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockPos blockpos = context.getPos();
        BlockState blockstate = context.getWorld().getBlockState(blockpos);
        if (blockstate.getBlock() == this) {
            return blockstate.with(TYPE, EnumBlockHalf.FULL).with(WATERLOGGED, Boolean.valueOf(false));
        } else {
            IFluidState ifluidstate = context.getWorld().getFluidState(blockpos);
            BlockState blockstate1 = this.getDefaultState().with(TYPE, EnumBlockHalf.BOTTOM).with(WATERLOGGED, Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));
            Direction direction = context.getFace();

            if(!StairwayConfig.vertical || context.isPlacerSneaking()){
                //BlockState iblockstate = super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
                return direction != Direction.DOWN && (direction == Direction.UP || !(context.getHitVec().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.with(TYPE, EnumBlockHalf.TOP);
            }
            return blockstate1.with(TYPE, EnumBlockHalf.getFacing(context.getPos(), context.getPlayer()));

            //return direction != Direction.DOWN && (direction == Direction.UP || !(context.getHitVec().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.with(TYPE, EnumBlockHalf.TOP);
        }
    }

    public boolean isReplaceable(BlockState state, BlockItemUseContext useContext) {
        ItemStack itemstack = useContext.getItem();
        EnumBlockHalf slabtype = state.get(TYPE);
        if (slabtype != EnumBlockHalf.FULL && itemstack.getItem() == this.asItem()) {
            if (useContext.replacingClickedOnBlock()) {
                boolean flag = useContext.getHitVec().y - (double)useContext.getPos().getY() > 0.5D;
                Direction direction = useContext.getFace();
                if (slabtype == EnumBlockHalf.BOTTOM) {
                    return direction == Direction.UP || flag && direction.getAxis().isHorizontal();
                } else {
                    return direction == Direction.DOWN || !flag && direction.getAxis().isHorizontal();
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }


    //--------------------------------

    public IFluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    public boolean receiveFluid(IWorld worldIn, BlockPos pos, BlockState state, IFluidState fluidStateIn) {
        return state.get(TYPE) != EnumBlockHalf.FULL ? IWaterLoggable.super.receiveFluid(worldIn, pos, state, fluidStateIn) : false;
    }

    public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, BlockState state, Fluid fluidIn) {
        return state.get(TYPE) != EnumBlockHalf.FULL ? IWaterLoggable.super.canContainFluid(worldIn, pos, state, fluidIn) : false;
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











    public enum EnumBlockHalf implements IStringSerializable {
        TOP("top"),
        BOTTOM("bottom"),
        NORTH("north"),
        SOUTH("south"),
        WEST("west"),
        EAST("east"),
        FULL("full");

        private final String name;

        EnumBlockHalf(String name){
            this.name = name;
        }

        public String toString(){
            return this.name;
        }

        public String getName(){
            return this.name;
        }

        public static EnumBlockHalf getFacing(BlockPos pos, LivingEntity placer){
            if (Math.abs(placer.posX - (double)((float)pos.getX() + 0.5F)) < 2.0D && Math.abs(placer.posZ - (double)((float)pos.getZ() + 0.5F)) < 2.0D){
                double d0 = placer.posY + (double)placer.getEyeHeight();
                if (d0 - (double)pos.getY() > 2.0D){
                    return BOTTOM;
                }
                if ((double)pos.getY() - d0 > 0.0D){
                    return TOP;
                }
            }
            if(placer.getHorizontalFacing() == Direction.EAST)  return EAST;
            if(placer.getHorizontalFacing() == Direction.WEST)  return WEST;
            if(placer.getHorizontalFacing() == Direction.NORTH) return NORTH;
            if(placer.getHorizontalFacing() == Direction.SOUTH) return SOUTH;
            return FULL;
        }

    }

}
