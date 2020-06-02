package net.stairway.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class SlabBlockHalf extends SlabBlock {
	
	public SlabBlockHalf(String name) {
		super(name);
	}

	@Override
	public final boolean isDouble(){
		return false;
	}
}
