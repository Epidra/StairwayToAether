package net.stairway.mod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class StairHook {
	
	@SubscribeEvent
	public void harvestBlock(HarvestDropsEvent event){
		if(StairKeeper.configExtendedGranite){
			if(event.state == Blocks.stone.getStateFromMeta(1)){
				event.drops.clear();
				event.drops.add(new ItemStack(StairKeeper.blockGraniteCobble));
				return;
			}	
		}
		
		if(StairKeeper.configExtendedDiorite){
			if(event.state == Blocks.stone.getStateFromMeta(3)){
				event.drops.clear();
				event.drops.add(new ItemStack(StairKeeper.blockDioriteCobble));
			}	
		}
		
		if(StairKeeper.configExtendedAndesite){
			if(event.state == Blocks.stone.getStateFromMeta(5)){
				event.drops.clear();
				event.drops.add(new ItemStack(StairKeeper.blockAndesiteCobble));
			}	
		}
		
	}
	
}
