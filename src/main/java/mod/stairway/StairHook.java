package mod.stairway;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class StairHook {
	
	@SubscribeEvent
	public void harvestBlock(HarvestDropsEvent event){
		if(StairKeeper.config_extended_granite){
			if(event.getState() == Blocks.STONE.getStateFromMeta(1)){
				event.getDrops().clear();
				event.getDrops().add(new ItemStack(StairKeeper.BLOCK_GRANITE_COBBLE));
				return;
			}	
		}
		
		if(StairKeeper.config_extended_diorite){
			if(event.getState() == Blocks.STONE.getStateFromMeta(3)){
				event.getDrops().clear();
				event.getDrops().add(new ItemStack(StairKeeper.BLOCK_DIORITE_COBBLE));
			}	
		}
		
		if(StairKeeper.config_extended_andesite){
			if(event.getState() == Blocks.STONE.getStateFromMeta(5)){
				event.getDrops().clear();
				event.getDrops().add(new ItemStack(StairKeeper.BLOCK_ANDESITE_COBBLE));
			}	
		}
		
		if(StairKeeper.config_extended_end){
			if(event.getState().getBlock() == Blocks.END_STONE){
				event.getDrops().clear();
				event.getDrops().add(new ItemStack(StairKeeper.BLOCK_END_COBBLE));
			}	
		}
	}
	
}
