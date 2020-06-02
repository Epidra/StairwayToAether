package net.stairway.mod.blocks;

import net.minecraft.block.Block;

public class SlabBlockFull extends SlabBlock {
	
	public SlabBlockFull(String name) {
		super(name);
	}

	@Override
	public final boolean isDouble(){
		return true;
	}
	
}
