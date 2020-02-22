package mod.stairway.blocks;

import mod.shared.blocks.BlockBlock;
import mod.stairway.StairwayConfig;
import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.IFluidState;
import net.minecraft.init.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockSlabs extends BlockBlock implements ILiquidContainer {

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
    protected void fillStateContainer(StateContainer.Builder<Block, IBlockState> builder) {
        builder.add(TYPE, WATERLOGGED);
    }

    public boolean func_220074_n(IBlockState state) {
        return state.get(TYPE) != EnumBlockHalf.FULL;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }



    //---------------------------------------

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.SOLID;
    }

    public VoxelShape getShape(IBlockState state, IBlockReader worldIn, BlockPos pos) {
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
    public IBlockState getStateForPlacement(BlockItemUseContext context) {
        BlockPos blockpos = context.getPos();
        IBlockState blockstate = context.getWorld().getBlockState(blockpos);
        if (blockstate.getBlock() == this) {
            return blockstate.with(TYPE, EnumBlockHalf.FULL).with(WATERLOGGED, Boolean.valueOf(false));
        } else {
            IFluidState ifluidstate = context.getWorld().getFluidState(blockpos);
            IBlockState blockstate1 = this.getDefaultState().with(TYPE, EnumBlockHalf.BOTTOM).with(WATERLOGGED, Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));
            EnumFacing direction = context.getFace();

            if(!StairwayConfig.vertical || context.isPlacerSneaking()){
                //BlockState iblockstate = super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
                return direction != EnumFacing.DOWN && (direction == EnumFacing.UP || !(context.getHitY() - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.with(TYPE, EnumBlockHalf.TOP);
            }
            return blockstate1.with(TYPE, EnumBlockHalf.getFacing(context.getPos(), context.getPlayer()));

            //return direction != Direction.DOWN && (direction == Direction.UP || !(context.getHitVec().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.with(TYPE, EnumBlockHalf.TOP);
        }
    }

    public boolean isReplaceable(IBlockState state, BlockItemUseContext useContext) {
        ItemStack itemstack = useContext.getItem();
        EnumBlockHalf slabtype = state.get(TYPE);
        if (slabtype != EnumBlockHalf.FULL && itemstack.getItem() == this.asItem()) {
            if (useContext.replacingClickedOnBlock()) {
                boolean flag = useContext.getHitY() - (double)useContext.getPos().getY() > 0.5D;
                EnumFacing direction = useContext.getFace();
                if (slabtype == EnumBlockHalf.BOTTOM) {
                    return direction == EnumFacing.UP || flag && direction.getAxis().isHorizontal();
                } else {
                    return direction == EnumFacing.DOWN || !flag && direction.getAxis().isHorizontal();
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
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

    public int getItemsToDropCount(IBlockState state, int fortune, World worldIn, BlockPos pos, Random random) {
        EnumBlockHalf slabtype = state.get(TYPE);
        if (slabtype == EnumBlockHalf.FULL){
            return 2;
        }
        return 1;
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

        public static EnumBlockHalf getFacing(BlockPos pos, EntityPlayer placer){
            if (Math.abs(placer.posX - (double)((float)pos.getX() + 0.5F)) < 2.0D && Math.abs(placer.posZ - (double)((float)pos.getZ() + 0.5F)) < 2.0D){
                double d0 = placer.posY + (double)placer.getEyeHeight();
                if (d0 - (double)pos.getY() > 2.0D){
                    return BOTTOM;
                }
                if ((double)pos.getY() - d0 > 0.0D){
                    return TOP;
                }
            }
            if(placer.getHorizontalFacing() == EnumFacing.EAST)  return EAST;
            if(placer.getHorizontalFacing() == EnumFacing.WEST)  return WEST;
            if(placer.getHorizontalFacing() == EnumFacing.NORTH) return NORTH;
            if(placer.getHorizontalFacing() == EnumFacing.SOUTH) return SOUTH;
            return FULL;
        }

    }

}
