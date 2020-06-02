package net.stairway.mod.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;
import net.stairway.mod.blocks.SlabBlock;
import net.stairway.mod.blocks.SlabBlockFull;
import net.stairway.mod.blocks.SlabBlockHalf;

public class ItemSlabBlock extends ItemSlab {
	
    public ItemSlabBlock( final Block block, final SlabBlock halfSlab, final SlabBlock doubleSlab, final Boolean stacked) {
        super(block, halfSlab, doubleSlab);
    }
	
}
