package mod.stairway.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import mod.stairway.StairKeeper;

public class BlockSlab extends Block {
	
	public static final PropertyEnum<BlockSlab.EnumBlockHalf> HALF = PropertyEnum.create("half", BlockSlab.EnumBlockHalf.class);
    protected static final AxisAlignedBB AABB_BOTTOM = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
    protected static final AxisAlignedBB AABB_TOP    = new AxisAlignedBB(0.0D, 0.5D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB AABB_EAST   = new AxisAlignedBB(0.5D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB AABB_WEST   = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.5D, 1.0D, 1.0D);
    protected static final AxisAlignedBB AABB_SOUTH  = new AxisAlignedBB(0.0D, 0.0D, 0.5D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB AABB_NORTH  = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.5D);
    
    public BlockSlab(String name) {
		super(Material.ROCK);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(1.5F);
		this.setResistance(10);
		this.setSoundType(SoundType.STONE);
		this.setHarvestLevel("pickaxe", 0);
		this.setDefaultState(this.blockState.getBaseState().withProperty(HALF, EnumBlockHalf.BOTTOM));
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		//blockState = blockState.withProperty(HALF, EnumBlockHalf.BOTTOM);
		//this.useNeighborBrightness = !this.isDouble();
	}
	
    /** ??? */
	public boolean isFullCube(IBlockState state){
        return state.getValue(HALF) == BlockSlab.EnumBlockHalf.FULL;
    }
	
	/** ??? */
	public boolean isOpaqueCube(IBlockState state){
        return state.getValue(HALF) == BlockSlab.EnumBlockHalf.FULL;
    }
	
	/** ??? */
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.SOLID;
    }
    
	/** ??? */
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state){
		if (!worldIn.isRemote){
            EnumBlockHalf enumfacing = state.getValue(HALF);
            worldIn.setBlockState(pos, state.withProperty(HALF, enumfacing), 2);
        }
    }
    
    /** Called by ItemBlocks after a block is set in the world, to allow post-place logic */
    //public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){
    //    worldIn.setBlockState(pos, state.withProperty(FACING, getFacingFromEntity(pos, placer)), 2);
    //}
	
    protected boolean canSilkHarvest(){
        return false;
    }
    
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
             if (state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)   { return AABB_TOP; }
        else if (state.getValue(HALF) == BlockSlab.EnumBlockHalf.BOTTOM){ return AABB_BOTTOM; }
        else if (state.getValue(HALF) == BlockSlab.EnumBlockHalf.NORTH) { return AABB_NORTH; }
        else if (state.getValue(HALF) == BlockSlab.EnumBlockHalf.SOUTH) { return AABB_SOUTH; }
        else if (state.getValue(HALF) == BlockSlab.EnumBlockHalf.WEST)  { return AABB_WEST; }
        else if (state.getValue(HALF) == BlockSlab.EnumBlockHalf.EAST)  { return AABB_EAST; }
        return FULL_BLOCK_AABB;
    }
    
    /** Determines if the block is solid enough on the top side to support other blocks, like redstone components. */
    public boolean isTopSolid(IBlockState state){
        return state.getValue(HALF) == BlockSlab.EnumBlockHalf.FULL || state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP;
    }
    
    /**
     * Get the geometry of the queried face at the given position and state. This is used to decide whether things like
     * buttons are allowed to be placed on the face, or how glass panes connect to the face, among other things.
     * <p>
     * Common values are {@code SOLID}, which is the default, and {@code UNDEFINED}, which represents something that
     * does not fit the other descriptions and will generally cause other things not to connect to the face.
     * 
     * @return an approximation of the form of the given face
     */
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face){
        if (state.getValue(HALF) == BlockSlab.EnumBlockHalf.FULL){
            return BlockFaceShape.SOLID;
        } else if (face == EnumFacing.UP && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP){
            return BlockFaceShape.SOLID;
        } else {
            return face == EnumFacing.DOWN && state.getValue(HALF) == BlockSlab.EnumBlockHalf.BOTTOM ? BlockFaceShape.SOLID : BlockFaceShape.UNDEFINED;
        }
    }
    
    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face){
        if (net.minecraftforge.common.ForgeModContainer.disableStairSlabCulling)
            return super.doesSideBlockRendering(state, world, pos, face);
        if ( state.isOpaqueCube() )
            return true;
        EnumBlockHalf side = state.getValue(HALF);
        return (side == EnumBlockHalf.TOP && face == EnumFacing.UP) || (side == EnumBlockHalf.BOTTOM && face == EnumFacing.DOWN);
    }
    
    /** Called by ItemBlocks just before a block is actually set in the world, to allow for adjustments to the IBlockstate */
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
    	if(!StairKeeper.config_allowed_verticalslab || placer.isSneaking()){
    		IBlockState iblockstate = super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
            return facing != EnumFacing.DOWN && (facing == EnumFacing.UP || (double)hitY <= 0.5D) ? iblockstate : iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.TOP);
    	}
    	return this.getDefaultState().withProperty(HALF, EnumBlockHalf.getFacing(pos, placer));
    }
    
    public int quantityDropped(IBlockState state, int fortune, Random random){
    	return state.getValue(HALF) == BlockSlab.EnumBlockHalf.FULL ? 2 : 1;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side){
        if (blockState.getValue(HALF) == BlockSlab.EnumBlockHalf.FULL){
            return super.shouldSideBeRendered(blockState, blockAccess, pos, side);
        } else if (side != EnumFacing.UP && side != EnumFacing.DOWN && !super.shouldSideBeRendered(blockState, blockAccess, pos, side)){
            return false;
        } else { // Forge: Additional logic breaks doesSideBlockRendering and is no longer useful.
            IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
            boolean flag = isHalfSlab(iblockstate) && iblockstate.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP;
            boolean flag1 = isHalfSlab(blockState) && blockState.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP;
            if (flag1){
                if (side == EnumFacing.DOWN){
                    return true;
                } else if (side == EnumFacing.UP && super.shouldSideBeRendered(blockState, blockAccess, pos, side)){
                    return true;
                } else {
                    return !isHalfSlab(iblockstate) || !flag;
                }
            } else if (side == EnumFacing.UP){
                return true;
            } else if (side == EnumFacing.DOWN && super.shouldSideBeRendered(blockState, blockAccess, pos, side)){
                return true;
            } else {
                return !isHalfSlab(iblockstate) || flag;
            }
        }
        //return super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    }
    
    @SideOnly(Side.CLIENT)
    protected static boolean isHalfSlab(IBlockState state){
        Block block = state.getBlock();
        return block == Blocks.STONE_SLAB || block == Blocks.WOODEN_SLAB || block == Blocks.STONE_SLAB2 || block == Blocks.PURPUR_SLAB;
    }
    
    /** Returns the slab block name with the type associated with it */
    public String getUnlocalizedName(int meta){
    	return this.getUnlocalizedName();
    }
    
    /** ??? */
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, HALF);
    }
    
    /** Convert the given metadata into a BlockState for this Block */
    public IBlockState getStateFromMeta(int meta){
        EnumBlockHalf enumfacing = EnumBlockHalf.byMetadata(meta);
        return this.getDefaultState().withProperty(HALF, enumfacing);
    }
    
    /** Convert the BlockState into the correct metadata value */
    public int getMetaFromState(IBlockState state){
        return state.getValue(HALF).getMetadata();
    }
    
    public IProperty<?> getVariantProperty(){
        return HALF;
    }
    
    public Comparable<?> getTypeForItem(ItemStack stack){
        return BlockStoneSlab.EnumType.byMetadata(stack.getMetadata() & 7);
    }
    
    public enum EnumBlockHalf implements IStringSerializable{
        TOP(0, "top"),
        BOTTOM(1, "bottom"),
        NORTH(2, "north"),
        SOUTH(3, "south"),
        WEST(4, "west"),
        EAST(5, "east"),
        FULL(6, "full");
    	
        private final String name;
        private final int meta;

        EnumBlockHalf(int meta, String name){
        	this.meta = meta;
            this.name = name;
        }
        
        public int getMetadata(){
            return this.meta;
        }
        
        public String toString(){
            return this.name;
        }
        
        public String getName(){
            return this.name;
        }
        
        public static EnumBlockHalf byMetadata(int meta){
        	if(meta == 0) return EnumBlockHalf.TOP;
        	if(meta == 1) return EnumBlockHalf.BOTTOM;
        	if(meta == 2) return EnumBlockHalf.NORTH;
        	if(meta == 3) return EnumBlockHalf.SOUTH;
        	if(meta == 4) return EnumBlockHalf.WEST;
        	if(meta == 5) return EnumBlockHalf.EAST;
        	if(meta == 6) return EnumBlockHalf.FULL;
        	return EnumBlockHalf.FULL;
        }
        
        public static EnumBlockHalf getFacing(BlockPos pos, EntityLivingBase placer){
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
