package mod.stairway.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;

import javax.annotation.Nullable;

public class BlockChain extends Block {

    public static final EnumProperty<EnumFacing.Axis> AXIS = BlockStateProperties.AXIS;
    public static final BooleanProperty OFFSET = BlockStateProperties.INVERTED;

    public static final VoxelShape AABB   = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 1.0D*16);
    public static final VoxelShape AABB_X = Block.makeCuboidShape(0.0D*16, 0.4D*16, 0.4D*16, 1.0D*16, 0.6D*16, 0.6D*16);
    public static final VoxelShape AABB_Y = Block.makeCuboidShape(0.4D*16, 0.0D*16, 0.4D*16, 0.6D*16, 1.0D*16, 0.6D*16);
    public static final VoxelShape AABB_Z = Block.makeCuboidShape(0.4D*16, 0.4D*16, 0.0D*16, 0.6D*16, 0.6D*16, 1.0D*16);


    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public BlockChain(String modid, String name, Block block) {
        super(Block.Properties.from(block));
        this.setRegistryName(modid, name);
        this.setDefaultState(this.stateContainer.getBaseState().with(AXIS, EnumFacing.Axis.Y).with(OFFSET, Boolean.valueOf(false)));
    }



    //----------------------------------------RENDER----------------------------------------//

    public boolean isFullCube(IBlockState state){
        return false;
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    public VoxelShape getShape(IBlockState state, IBlockReader worldIn, BlockPos pos) {
        EnumFacing.Axis enumfacing = state.get(AXIS);
        switch(enumfacing) {
            case X:
                return AABB_X;
            case Y:
                return AABB_Y;
            case Z:
                return AABB_Z;
            default:
                return AABB;
        }
    }

    @Override
    public boolean isLadder(IBlockState state, net.minecraft.world.IWorldReader world, BlockPos pos, net.minecraft.entity.EntityLivingBase entity) {
        return true;
    }

    //public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn){
    //    addCollisionBoxToList(pos, entityBox, collidingBoxes, getAABB(state));
    //}

    //public AxisAlignedBB getBoundingBox(IBlockState state, IBlock source, BlockPos pos){
    //    return getAABB(state);
    //}

    //private AxisAlignedBB getAABB(IBlockState state){

    //    EnumFacing.Axis axis = state.get(AXIS);
    //    if(axis == EnumFacing.Axis.X) return AABB_X;
    //    if(axis == EnumFacing.Axis.Y) return AABB_Y;
    //    if(axis == EnumFacing.Axis.Z) return AABB_Z;

    //    return AABB;
    //}







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
        builder.add(AXIS, OFFSET);
    }

    //public IBlockState getStateForPlacement(BlockItemUseContext context) {
    //    return this.getDefaultState().with(AXIS, context.getFace().getAxis());
    //}

    protected ItemStack getSilkTouchDrop(IBlockState state) {
        return new ItemStack(this);
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

}
