package net.stairway.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class SlabBlockFull extends SlabBlock {
	
	public SlabBlockFull(String name) {
		super(name);
	}

	@Override
	public final boolean isDouble(){
		return true;
	}
	
}
