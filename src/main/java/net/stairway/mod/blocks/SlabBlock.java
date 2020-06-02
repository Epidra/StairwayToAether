package net.stairway.mod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.stairway.mod.StairKeeper;

public abstract class SlabBlock extends BlockSlab {
	
	private static final PropertyBool VARIANT = PropertyBool.create("variant");
	
	public SlabBlock(String name) {
		super(Material.rock);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(2);
		this.setResistance(3);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 0);
		IBlockState blockState = this.blockState.getBaseState();
        blockState = blockState.withProperty(VARIANT, false);
		if(!this.isDouble()){
			this.setCreativeTab(CreativeTabs.tabBlock);
			blockState = blockState.withProperty(HALF, EnumBlockHalf.BOTTOM);
		}
		this.useNeighborBrightness = !this.isDouble();
        setDefaultState(blockState);
	}
	
	@Override
    public final String getUnlocalizedName(final int metadata) {
        return this.getUnlocalizedName();
    }
	
	@Override
    public final IProperty getVariantProperty() {
        return VARIANT;
    }
	
	public Object getVariant(ItemStack stack){
		return false;
	}
	
	@Override
    public final IBlockState getStateFromMeta(final int meta) {
        IBlockState blockState = this.getDefaultState();
        blockState = blockState.withProperty(VARIANT, false);
        if (!this.isDouble()) {
            EnumBlockHalf value = EnumBlockHalf.BOTTOM;
            if ((meta & 8) != 0) {
                value = EnumBlockHalf.TOP;
            }
            blockState = blockState.withProperty(HALF, value);
        }
        return blockState;
    }
	
	@Override
    public final int getMetaFromState(final IBlockState state) {
        if (this.isDouble()) {
           return 0;
        }
        if ((EnumBlockHalf) state.getValue(HALF) == EnumBlockHalf.TOP) {
            return 8;
        } else {
            return 0;
        }
    }
	
	@Override
    public final int damageDropped(final IBlockState state) {
        return 0;
    }
	
	@Override
    public final Item getItemDropped(final IBlockState blockState, final java.util.Random random, final int unused) {
        return Item.getItemFromBlock(getDrop());
    }
	
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos, EntityPlayer player){
        return new ItemStack(getDrop());
    }
	
	@Override
    protected final BlockState createBlockState() {
        if (this.isDouble()) {
            return new BlockState(this, new IProperty[] {VARIANT});
        } else {
            return new BlockState(this, new IProperty[] {VARIANT, HALF});
        }
    }
	
	private Block getDrop(){
		if(getUnlocalizedName().substring(5).compareTo("SlabsStoneCobbleMossHalf")      == 0) return StairKeeper.slabsStoneCobbleMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsStoneCobbleMossFull")      == 0) return StairKeeper.slabsStoneCobbleMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsStoneSmoothHalf")          == 0) return StairKeeper.slabsStoneSmoothHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsStoneSmoothFull")          == 0) return StairKeeper.slabsStoneSmoothHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsStoneBrickMossHalf")       == 0) return StairKeeper.slabsStoneBrickMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsStoneBrickMossFull")       == 0) return StairKeeper.slabsStoneBrickMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsStoneBrickCrackedHalf")    == 0) return StairKeeper.slabsStoneBrickCrackedHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsStoneBrickCrackedFull")    == 0) return StairKeeper.slabsStoneBrickCrackedHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteStoneHalf")         == 0) return StairKeeper.slabsDioriteStoneHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteStoneFull")         == 0) return StairKeeper.slabsDioriteStoneHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteCobbleHalf")        == 0) return StairKeeper.slabsDioriteCobbleHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteCobbleFull")        == 0) return StairKeeper.slabsDioriteCobbleHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteCobbleMossHalf")    == 0) return StairKeeper.slabsDioriteCobbleMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteCobbleMossFull")    == 0) return StairKeeper.slabsDioriteCobbleMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteSmoothHalf")        == 0) return StairKeeper.slabsDioriteSmoothHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteSmoothFull")        == 0) return StairKeeper.slabsDioriteSmoothHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteBrickHalf")         == 0) return StairKeeper.slabsDioriteBrickHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteBrickFull")         == 0) return StairKeeper.slabsDioriteBrickHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteBrickMossHalf")     == 0) return StairKeeper.slabsDioriteBrickMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteBrickMossFull")     == 0) return StairKeeper.slabsDioriteBrickMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteBrickCrackedHalf")  == 0) return StairKeeper.slabsDioriteBrickCrackedHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsDioriteBrickCrackedFull")  == 0) return StairKeeper.slabsDioriteBrickCrackedHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteStoneHalf")        == 0) return StairKeeper.slabsAndesiteStoneHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteStoneFull")        == 0) return StairKeeper.slabsAndesiteStoneHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteCobbleHalf")       == 0) return StairKeeper.slabsAndesiteCobbleHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteCobbleFull")       == 0) return StairKeeper.slabsAndesiteCobbleHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteCobbleMossHalf")   == 0) return StairKeeper.slabsAndesiteCobbleMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteCobbleMossFull")   == 0) return StairKeeper.slabsAndesiteCobbleMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteSmoothHalf")       == 0) return StairKeeper.slabsAndesiteSmoothHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteSmoothFull")       == 0) return StairKeeper.slabsAndesiteSmoothHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteBrickHalf")        == 0) return StairKeeper.slabsAndesiteBrickHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteBrickFull")        == 0) return StairKeeper.slabsAndesiteBrickHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteBrickMossHalf")    == 0) return StairKeeper.slabsAndesiteBrickMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteBrickMossFull")    == 0) return StairKeeper.slabsAndesiteBrickMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteBrickCrackedHalf") == 0) return StairKeeper.slabsAndesiteBrickCrackedHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsAndesiteBrickCrackedFull") == 0) return StairKeeper.slabsAndesiteBrickCrackedHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteStoneHalf")         == 0) return StairKeeper.slabsGraniteStoneHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteStoneFull")         == 0) return StairKeeper.slabsGraniteStoneHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteCobbleHalf")        == 0) return StairKeeper.slabsGraniteCobbleHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteCobbleFull")        == 0) return StairKeeper.slabsGraniteCobbleHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteCobbleMossHalf")    == 0) return StairKeeper.slabsGraniteCobbleMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteCobbleMossFull")    == 0) return StairKeeper.slabsGraniteCobbleMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteSmoothHalf")        == 0) return StairKeeper.slabsGraniteSmoothHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteSmoothFull")        == 0) return StairKeeper.slabsGraniteSmoothHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteBrickHalf")         == 0) return StairKeeper.slabsGraniteBrickHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteBrickFull")         == 0) return StairKeeper.slabsGraniteBrickHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteBrickMossHalf")     == 0) return StairKeeper.slabsGraniteBrickMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteBrickMossFull")     == 0) return StairKeeper.slabsGraniteBrickMossHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteBrickCrackedHalf")  == 0) return StairKeeper.slabsGraniteBrickCrackedHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsGraniteBrickCrackedFull")  == 0) return StairKeeper.slabsGraniteBrickCrackedHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsPrismarineStoneHalf")      == 0) return StairKeeper.slabsPrismarineStoneHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsPrismarineStoneFull")      == 0) return StairKeeper.slabsPrismarineStoneHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsPrismarineBrickHalf")      == 0) return StairKeeper.slabsPrismarineBrickHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsPrismarineBrickFull")      == 0) return StairKeeper.slabsPrismarineBrickHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsPrismarineDarkHalf")       == 0) return StairKeeper.slabsPrismarineDarkHalf;
		if(getUnlocalizedName().substring(5).compareTo("SlabsPrismarineDarkFull")       == 0) return StairKeeper.slabsPrismarineDarkHalf;
		return StairKeeper.slabsDioriteBrickHalf;
	}
	
}