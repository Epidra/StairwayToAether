package net.stairway.mod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.stairway.mod.StairKeeper;

public class ClientProxy extends  CommonProxy {
	
	//@Override
	//public void PreInit(FMLPreInitializationEvent preEvent){
		
	//}
	
	@Override
	public void Init(FMLInitializationEvent event){
		StairKeeper.registerBlocks(false);
	}
	
	//@Override
	//public void PostInit(FMLPostInitializationEvent postEvent){
		
	//}
	
	public void registerRenderThings(){
		
	}
	
	public void registerTileEntitySpecialRenderer(){
		
	}
	
}
