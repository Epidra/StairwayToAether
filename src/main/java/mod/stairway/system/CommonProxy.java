package mod.stairway.system;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import mod.stairway.StairKeeper;

public class CommonProxy {
	
	public void PreInit(FMLPreInitializationEvent preEvent){
		StairKeeper.init();
		StairKeeper.registerStuff(true);
		StairKeeper.registerRecipes();
	}
	
	public void Init(FMLInitializationEvent event){
		StairKeeper.registerEntities();
	}
	
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
	
}
