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
			if(event.getState() == Blocks.STONE.getStateFromMeta(1)){
				event.getDrops().clear();
				event.getDrops().add(new ItemStack(StairKeeper.blockGraniteCobble));
				return;
			}	
		}
		
		if(StairKeeper.configExtendedDiorite){
			if(event.getState() == Blocks.STONE.getStateFromMeta(3)){
				event.getDrops().clear();
				event.getDrops().add(new ItemStack(StairKeeper.blockDioriteCobble));
			}	
		}
		
		if(StairKeeper.configExtendedAndesite){
			if(event.getState() == Blocks.STONE.getStateFromMeta(5)){
				event.getDrops().clear();
				event.getDrops().add(new ItemStack(StairKeeper.blockAndesiteCobble));
			}	
		}
		
		if(StairKeeper.configExtendedEnd){
			if(event.getState().getBlock() == Blocks.END_STONE){
				event.getDrops().clear();
				event.getDrops().add(new ItemStack(StairKeeper.blockEndCobble));
			}	
		}
		
	}
	
}
