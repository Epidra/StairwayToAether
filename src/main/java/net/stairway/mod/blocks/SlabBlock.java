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
		if(getRegistryName().getResourcePath().contentEquals("SlabsRedNetherBrickHalf")) return StairKeeper.slabsRedNetherBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsRedNetherBrickFull")) return StairKeeper.slabsRedNetherBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeStoneHalf")) return StairKeeper.slabsLimeStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeStoneFull")) return StairKeeper.slabsLimeStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeCobbleHalf")) return StairKeeper.slabsLimeCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeCobbleFull")) return StairKeeper.slabsLimeCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeCobbleMossHalf")) return StairKeeper.slabsLimeCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeCobbleMossFull")) return StairKeeper.slabsLimeCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeSmoothHalf")) return StairKeeper.slabsLimeSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeSmoothFull")) return StairKeeper.slabsLimeSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeBrickHalf")) return StairKeeper.slabsLimeBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeBrickFull")) return StairKeeper.slabsLimeBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeBrickMossHalf")) return StairKeeper.slabsLimeBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeBrickMossFull")) return StairKeeper.slabsLimeBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeBrickCrackedHalf")) return StairKeeper.slabsLimeBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsLimeBrickCrackedFull")) return StairKeeper.slabsLimeBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltStoneHalf")) return StairKeeper.slabsSiltStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltStoneFull")) return StairKeeper.slabsSiltStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltCobbleHalf")) return StairKeeper.slabsSiltCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltCobbleFull")) return StairKeeper.slabsSiltCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltCobbleMossHalf")) return StairKeeper.slabsSiltCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltCobbleMossFull")) return StairKeeper.slabsSiltCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltSmoothHalf")) return StairKeeper.slabsSiltSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltSmoothFull")) return StairKeeper.slabsSiltSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltBrickHalf")) return StairKeeper.slabsSiltBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltBrickFull")) return StairKeeper.slabsSiltBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltBrickMossHalf")) return StairKeeper.slabsSiltBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltBrickMossFull")) return StairKeeper.slabsSiltBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltBrickCrackedHalf")) return StairKeeper.slabsSiltBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsSiltBrickCrackedFull")) return StairKeeper.slabsSiltBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleStoneHalf")) return StairKeeper.slabsShaleStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleStoneFull")) return StairKeeper.slabsShaleStoneHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleCobbleHalf")) return StairKeeper.slabsShaleCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleCobbleFull")) return StairKeeper.slabsShaleCobbleHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleCobbleMossHalf")) return StairKeeper.slabsShaleCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleCobbleMossFull")) return StairKeeper.slabsShaleCobbleMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleSmoothHalf")) return StairKeeper.slabsShaleSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleSmoothFull")) return StairKeeper.slabsShaleSmoothHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleBrickHalf")) return StairKeeper.slabsShaleBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleBrickFull")) return StairKeeper.slabsShaleBrickHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleBrickMossHalf")) return StairKeeper.slabsShaleBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleBrickMossFull")) return StairKeeper.slabsShaleBrickMossHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleBrickCrackedHalf")) return StairKeeper.slabsShaleBrickCrackedHalf;
		if(getRegistryName().getResourcePath().contentEquals("SlabsShaleBrickCrackedFull")) return StairKeeper.slabsShaleBrickCrackedHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragStoneHalf")) return StairKeeper.slabsCragStoneHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragStoneFull")) return StairKeeper.slabsCragStoneHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragCobbleHalf")) return StairKeeper.slabsCragCobbleHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragCobbleFull")) return StairKeeper.slabsCragCobbleHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragCobbleMossHalf")) return StairKeeper.slabsCragCobbleMossHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragCobbleMossFull")) return StairKeeper.slabsCragCobbleMossHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragSmoothHalf")) return StairKeeper.slabsCragSmoothHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragSmoothFull")) return StairKeeper.slabsCragSmoothHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragBrickHalf")) return StairKeeper.slabsCragBrickHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragBrickFull")) return StairKeeper.slabsCragBrickHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragBrickMossHalf")) return StairKeeper.slabsCragBrickMossHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragBrickMossFull")) return StairKeeper.slabsCragBrickMossHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragBrickCrackedHalf")) return StairKeeper.slabsCragBrickCrackedHalf;
		//if(getRegistryName().getResourcePath().contentEquals("SlabsCragBrickCrackedFull")) return StairKeeper.slabsCragBrickCrackedHalf;
		return StairKeeper.slabsDioriteBrickHalf;
	}
	
}