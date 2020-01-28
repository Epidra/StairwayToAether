package mod.stairway.blocks;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockChain extends Block {
	
	public static final PropertyEnum<EnumFacing.Axis> AXIS = PropertyEnum.create("axis", EnumFacing.Axis.class);
	public static final PropertyBool OFFSET = PropertyBool.create("offset");
	
	public static final AxisAlignedBB AABB_X = new AxisAlignedBB(0.0D, 0.4D, 0.4D, 1.0D, 0.6D, 0.6D);
	public static final AxisAlignedBB AABB_Y = new AxisAlignedBB(0.4D, 0.0D, 0.4D, 0.6D, 1.0D, 0.6D);
	public static final AxisAlignedBB AABB_Z = new AxisAlignedBB(0.4D, 0.4D, 0.0D, 0.6D, 0.6D, 1.0D);
	
	
	//----------------------------------------CONSTRUCTOR----------------------------------------//
	
	/** Default Constructor */
    public BlockChain(String name) {
		super(Material.IRON);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(2.0f);
		this.setResistance(2.0f);
		this.setSoundType(SoundType.METAL);
		this.setLightOpacity(8);
		this.setLightLevel(0);
		this.setHarvestLevel("pickaxe", 1);
		this.setTickRandomly(false);
	}
    
    
    
    
    //----------------------------------------RENDER----------------------------------------//
    
    public boolean isFullCube(IBlockState state){
        return false;
    }
	
	public boolean isOpaqueCube(IBlockState state){
        return false;
    }
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.TRANSLUCENT;
    }
	
	public boolean isLadder(IBlockState state, IBlockAccess world, BlockPos pos, EntityLivingBase entity) {
		return true;
	}
	
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn){
		addCollisionBoxToList(pos, entityBox, collidingBoxes, getAABB(state));
    }   

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
    	return getAABB(state);
    }
    
    private AxisAlignedBB getAABB(IBlockState state){
    	
    	EnumFacing.Axis axis = state.getValue(AXIS);
    	if(axis == EnumFacing.Axis.X) return AABB_X;
    	if(axis == EnumFacing.Axis.Y) return AABB_Y;
    	if(axis == EnumFacing.Axis.Z) return AABB_Z;
    	
    	return FULL_BLOCK_AABB;
    }
    
    
    
    //----------------------------------------PLACEMENT----------------------------------------//
    
    /** Rotates the Block towards its Axis */
    @Override
    public boolean rotateBlock(net.minecraft.world.World world, BlockPos pos, EnumFacing axis){
        net.minecraft.block.state.IBlockState state = world.getBlockState(pos);
        for (net.minecraft.block.properties.IProperty<?> prop : state.getProperties().keySet()){
            if (prop.getName().equals("axis")){
                world.setBlockState(pos, state.cycleProperty(prop));
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
    //----------------------------------------SUPPORT----------------------------------------//
    
    /** Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed blockstate. */
    public IBlockState withRotation(IBlockState state, Rotation rot){
        switch (rot){
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch (state.getValue(AXIS)){
                    case X: return state.withProperty(AXIS, EnumFacing.Axis.Z);
                    case Z: return state.withProperty(AXIS, EnumFacing.Axis.X);
                    default: return state;
                }
            default: return state;
        }
    }
    
    /** Convert the given metadata into a BlockState for this Block */
    public IBlockState getStateFromMeta(int meta){
    	int j = meta % 8;
        EnumFacing.Axis enumfacing$axis = EnumFacing.Axis.Y;
        //int i = meta & 12;
        if (j == 1){
            enumfacing$axis = EnumFacing.Axis.X;
        } else if (j == 2){
            enumfacing$axis = EnumFacing.Axis.Z;
        }
        return this.getDefaultState().withProperty(AXIS, enumfacing$axis).withProperty(OFFSET, Boolean.valueOf((meta / 8) > 0));
        //return this.getDefaultState().withProperty(FACING, enumfacing).withProperty(PRIMARY, Boolean.valueOf((meta / 8) > 0)).withProperty(MODULE, EnumModule.EMPTY);
    }
    
    /** Convert the BlockState into the correct metadata value */
    public int getMetaFromState(IBlockState state){
        int i = 0;
        EnumFacing.Axis enumfacing$axis = state.getValue(AXIS);
        if (enumfacing$axis == EnumFacing.Axis.X){
            i = 1;
        } else if (enumfacing$axis == EnumFacing.Axis.Z){
            i = 2;
        }
        if (state.getValue(OFFSET).booleanValue()){
        	i += 8;
        }
        return i;
    }
    
    /** Creates the Block State Container */
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, AXIS, OFFSET);
    }
    
    /** Returns this Block for Silk Touch Effect */
    protected ItemStack getSilkTouchDrop(IBlockState state){
        return new ItemStack(Item.getItemFromBlock(this));
    }
    
    /** Called by ItemBlocks just before a block is actually set in the world, to allow for adjustments to the IBlockstate */
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand){
        return super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer, hand).withProperty(AXIS, facing.getAxis()).withProperty(OFFSET, isOffset(pos));
    }
    
    /** Called by ItemBlocks after a block is set in the world, to allow post-place logic */
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){
        worldIn.setBlockState(pos, state.withProperty(OFFSET, isOffset(pos)), 2);
    }
    
    private boolean isOffset(BlockPos pos) {
    	int counter = 0;
    	if(Math.abs(pos.getX()) % 2 == 1) counter++;
    	if(Math.abs(pos.getY()) % 2 == 1) counter++;
    	if(Math.abs(pos.getZ()) % 2 == 1) counter++;
    	return counter % 2 == 1;
    }
	
}
