package net.stairway.mod.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class StairBlock  extends BlockStairs {
	
	public StairBlock(String name, IBlockState modelState) {
		super(modelState);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.useNeighborBrightness = true;
	}
	
}
