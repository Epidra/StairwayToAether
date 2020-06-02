package net.stairway.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

public class StairBlock  extends BlockStairs {
	
	public StairBlock(String name, IBlockState modelState) {
		super(modelState);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(2);
		this.setResistance(3);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 0);
		this.useNeighborBrightness = true;
	}
	
}
