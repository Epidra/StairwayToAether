package net.stairway.mod.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;
import net.stairway.mod.blocks.SlabBlock;
import net.stairway.mod.blocks.SlabBlockFull;
import net.stairway.mod.blocks.SlabBlockHalf;

public class ItemSlabBlock extends ItemSlab {
	
    public ItemSlabBlock( Block block, SlabBlock halfSlab, SlabBlock doubleSlab, Boolean stacked) {
        super(block, halfSlab, doubleSlab);
    }
	
    public ItemSlabBlock( Block block, SlabBlockHalf halfSlab, SlabBlockFull doubleSlab, Boolean stacked) {
        super(block, halfSlab, doubleSlab);
    }
    
}
