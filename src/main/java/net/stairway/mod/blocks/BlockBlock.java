package net.stairway.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBlock extends Block {

	public BlockBlock(String name, float hardness, float resistance) {
		super(Material.rock);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(soundTypeStone);
		this.setLightOpacity(16);
		this.setLightLevel(0);
		this.setHarvestLevel("pickaxe", 0);
		this.setTickRandomly(false);
	}

}
