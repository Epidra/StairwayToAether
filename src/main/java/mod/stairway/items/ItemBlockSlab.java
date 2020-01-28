package mod.stairway.items;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import mod.stairway.blocks.BlockSlab;
import mod.stairway.blocks.BlockSlab.EnumBlockHalf;

public class ItemBlockSlab extends ItemBlock {
	
	private final BlockSlab slab;
    
    public ItemBlockSlab(Block block){
    	super(block);
        this.slab = (BlockSlab)block;
        this.setMaxDamage(0);
        this.setHasSubtypes(false);
    }
    
	/** Converts the given ItemStack damage value into a metadata value to be placed in the world when this Item is placed as a Block (mostly used with ItemBlocks). */
    public int getMetadata(int damage){
        return damage;
    }
    
    /** Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have different names based on their damage or NBT. */
    public String getUnlocalizedName(ItemStack stack){
        return this.slab.getUnlocalizedName(stack.getMetadata());
    }
    
    /** Called when a Block is right-clicked with this Item */
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
        ItemStack itemstack = player.getHeldItem(hand);
        if (!itemstack.isEmpty() && player.canPlayerEdit(pos.offset(facing), facing, itemstack)){
        	Comparable<?> comparable = this.slab.getTypeForItem(itemstack);
            IBlockState stateHand = Block.getBlockFromItem(itemstack.getItem()).getDefaultState();
            IBlockState stateWorld = worldIn.getBlockState(pos);
            if (stateWorld.getBlock() == this.slab){
                BlockSlab.EnumBlockHalf enumWorld = stateWorld.getValue(BlockSlab.HALF);
                if (samedirection(facing, enumWorld)){
                    IBlockState iblockstate1 = this.slab.getDefaultState().withProperty(BlockSlab.HALF, EnumBlockHalf.FULL);
                    AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(worldIn, pos);
                    if (axisalignedbb != Block.NULL_AABB && worldIn.checkNoEntityCollision(axisalignedbb.offset(pos)) && worldIn.setBlockState(pos, iblockstate1, 11)){
                        SoundType soundtype = this.slab.getSoundType(iblockstate1, worldIn, pos, player);
                        worldIn.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                        itemstack.shrink(1);
                        if (player instanceof EntityPlayerMP){
                            CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)player, pos, itemstack);
                        }
                    }
                    return EnumActionResult.SUCCESS;
                }
            }
            return this.tryPlace(player, itemstack, worldIn, pos.offset(facing), comparable) ? EnumActionResult.SUCCESS : super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
        } else {
            return EnumActionResult.FAIL;
        }
    }
    
    private boolean samedirection(EnumFacing facing, EnumBlockHalf half){
    	if(facing == EnumFacing.UP    && half == EnumBlockHalf.BOTTOM) return true;
    	if(facing == EnumFacing.DOWN  && half == EnumBlockHalf.TOP)    return true;
    	if(facing == EnumFacing.SOUTH && half == EnumBlockHalf.NORTH)  return true;
    	if(facing == EnumFacing.NORTH && half == EnumBlockHalf.SOUTH)  return true;
    	if(facing == EnumFacing.EAST  && half == EnumBlockHalf.WEST)   return true;
        return facing == EnumFacing.WEST && half == EnumBlockHalf.EAST;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side, EntityPlayer player, ItemStack stack){
        BlockPos blockpos = pos;
        IProperty<?> iproperty = this.slab.getVariantProperty();
        Comparable<?> comparable = this.slab.getTypeForItem(stack);
        IBlockState iblockstate = worldIn.getBlockState(pos);
        if (iblockstate.getBlock() == this.slab){
            boolean flag = iblockstate.getValue(BlockSlab.HALF) == BlockSlab.EnumBlockHalf.TOP;
            if ((side == EnumFacing.UP && !flag || side == EnumFacing.DOWN && flag) && comparable == iblockstate.getValue(iproperty)){
                return true;
            }
        }
        pos = pos.offset(side);
        IBlockState iblockstate1 = worldIn.getBlockState(pos);
        return iblockstate1.getBlock() == this.slab && comparable == iblockstate1.getValue(iproperty) || super.canPlaceBlockOnSide(worldIn, blockpos, side, player, stack);
    }
    
    private boolean tryPlace(EntityPlayer player, ItemStack stack, World worldIn, BlockPos pos, Object itemSlabType){
        IBlockState iblockstate = worldIn.getBlockState(pos);
        if (iblockstate.getBlock() == this.slab){
            Comparable<?> comparable = iblockstate.getValue(this.slab.getVariantProperty());
            if (comparable == itemSlabType){
                IBlockState iblockstate1 = this.makeState(this.slab.getVariantProperty(), comparable);
                AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(worldIn, pos);
                if (axisalignedbb != Block.NULL_AABB && worldIn.checkNoEntityCollision(axisalignedbb.offset(pos)) && worldIn.setBlockState(pos, iblockstate1, 11)){
                    SoundType soundtype = this.slab.getSoundType(iblockstate1, worldIn, pos, player);
                    worldIn.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                    stack.shrink(1);
                }
                return true;
            }
        }
        return false;
    }
    
    protected <T extends Comparable<T>> IBlockState makeState(IProperty<T> p_185055_1_, Comparable<?> p_185055_2_){
        return this.slab.getDefaultState().withProperty(p_185055_1_, (T)p_185055_2_);
    }
	
}
