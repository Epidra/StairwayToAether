package net.stairway.mod.proxy;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.stairway.mod.StairKeeper;

public class CommonProxy {
	
	public void PreInit(FMLPreInitializationEvent preEvent){
		StairKeeper.removeRecipes();
		StairKeeper.registerBlocks(true);
	}
	
	public void Init(FMLInitializationEvent event){
		//StairKeeper.registerBlocks(false);
	}
	
	public void PostInit(FMLPostInitializationEvent postEvent){
		StairKeeper.registerRecipes();
	}
	
	
	
	public void registerRenderThings(){
		
	}
	
	public void registerTileEntitySpecialRenderer(){
		
	}
	
}
