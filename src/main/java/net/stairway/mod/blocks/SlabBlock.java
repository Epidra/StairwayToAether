package net.stairway.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.stairway.mod.StairKeeper;

public abstract class SlabBlock extends BlockSlab {
	
	private static final PropertyBool VARIANT = PropertyBool.create("variant");
	
	public SlabBlock(String name) {
		super(Material.ROCK);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(1.5F);
		this.setResistance(10);
		this.setSoundType(SoundType.STONE);
		this.setHarvestLevel("pickaxe", 0);
		IBlockState blockState = this.blockState.getBaseState();
        blockState = blockState.withProperty(VARIANT, false);
		if(!this.isDouble()){
			this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
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
	
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player){
        return new ItemStack(getDrop());
    }
	
	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return false;
	}
	
	@Override
    protected final BlockStateContainer createBlockState() {
        if (this.isDouble()) {
            return new BlockStateContainer(this, new IProperty[] {VARIANT});
        } else {
            return new BlockStateContainer(this, new IProperty[] {VARIANT, HALF});
        }
    }
	
	private Block getDrop(){
		if(getRegistryName().getResourcePath().contentEquals("SlabsStoneCobbleMossHalf")) return StairKeeper.slabsStoneCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsStoneCobbleMossFull")) return StairKeeper.slabsStoneCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsStoneSmoothHalf")) return StairKeeper.slabsStoneSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsStoneSmoothFull")) return StairKeeper.slabsStoneSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsStoneBrickMossHalf")) return StairKeeper.slabsStoneBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsStoneBrickMossFull")) return StairKeeper.slabsStoneBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsStoneBrickCrackedHalf")) return StairKeeper.slabsStoneBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsStoneBrickCrackedFull")) return StairKeeper.slabsStoneBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteStoneHalf")) return StairKeeper.slabsDioriteStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteStoneFull")) return StairKeeper.slabsDioriteStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteCobbleHalf")) return StairKeeper.slabsDioriteCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteCobbleFull")) return StairKeeper.slabsDioriteCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteCobbleMossHalf")) return StairKeeper.slabsDioriteCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteCobbleMossFull")) return StairKeeper.slabsDioriteCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteSmoothHalf")) return StairKeeper.slabsDioriteSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteSmoothFull")) return StairKeeper.slabsDioriteSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteBrickHalf")) return StairKeeper.slabsDioriteBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteBrickFull")) return StairKeeper.slabsDioriteBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteBrickMossHalf")) return StairKeeper.slabsDioriteBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteBrickMossFull")) return StairKeeper.slabsDioriteBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteBrickCrackedHalf")) return StairKeeper.slabsDioriteBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsDioriteBrickCrackedFull")) return StairKeeper.slabsDioriteBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteStoneHalf")) return StairKeeper.slabsAndesiteStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteStoneFull")) return StairKeeper.slabsAndesiteStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteCobbleHalf")) return StairKeeper.slabsAndesiteCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteCobbleFull")) return StairKeeper.slabsAndesiteCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteCobbleMossHalf")) return StairKeeper.slabsAndesiteCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteCobbleMossFull")) return StairKeeper.slabsAndesiteCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteSmoothHalf")) return StairKeeper.slabsAndesiteSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteSmoothFull")) return StairKeeper.slabsAndesiteSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteBrickHalf")) return StairKeeper.slabsAndesiteBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteBrickFull")) return StairKeeper.slabsAndesiteBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteBrickMossHalf")) return StairKeeper.slabsAndesiteBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteBrickMossFull")) return StairKeeper.slabsAndesiteBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteBrickCrackedHalf")) return StairKeeper.slabsAndesiteBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsAndesiteBrickCrackedFull")) return StairKeeper.slabsAndesiteBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteStoneHalf")) return StairKeeper.slabsGraniteStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteStoneFull")) return StairKeeper.slabsGraniteStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteCobbleHalf")) return StairKeeper.slabsGraniteCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteCobbleFull")) return StairKeeper.slabsGraniteCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteCobbleMossHalf")) return StairKeeper.slabsGraniteCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteCobbleMossFull")) return StairKeeper.slabsGraniteCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteSmoothHalf")) return StairKeeper.slabsGraniteSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteSmoothFull")) return StairKeeper.slabsGraniteSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteBrickHalf")) return StairKeeper.slabsGraniteBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteBrickFull")) return StairKeeper.slabsGraniteBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteBrickMossHalf")) return StairKeeper.slabsGraniteBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteBrickMossFull")) return StairKeeper.slabsGraniteBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteBrickCrackedHalf")) return StairKeeper.slabsGraniteBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsGraniteBrickCrackedFull")) return StairKeeper.slabsGraniteBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsPrismarineStoneHalf")) return StairKeeper.slabsPrismarineStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsPrismarineStoneFull")) return StairKeeper.slabsPrismarineStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsPrismarineBrickHalf")) return StairKeeper.slabsPrismarineBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsPrismarineBrickFull")) return StairKeeper.slabsPrismarineBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsPrismarineDarkHalf")) return StairKeeper.slabsPrismarineDarkHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsPrismarineDarkFull")) return StairKeeper.slabsPrismarineDarkHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndStoneHalf")) return StairKeeper.slabsEndStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndStoneFull")) return StairKeeper.slabsEndStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndCobbleHalf")) return StairKeeper.slabsEndCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndCobbleFull")) return StairKeeper.slabsEndCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndCobbleMossHalf")) return StairKeeper.slabsEndCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndCobbleMossFull")) return StairKeeper.slabsEndCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndSmoothHalf")) return StairKeeper.slabsEndSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndSmoothFull")) return StairKeeper.slabsEndSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndBrickHalf")) return StairKeeper.slabsEndBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndBrickFull")) return StairKeeper.slabsEndBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndBrickMossHalf")) return StairKeeper.slabsEndBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndBrickMossFull")) return StairKeeper.slabsEndBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndBrickCrackedHalf")) return StairKeeper.slabsEndBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsEndBrickCrackedFull")) return StairKeeper.slabsEndBrickCrackedHalf;
		return StairKeeper.slabsDioriteBrickHalf;
	}
	
}