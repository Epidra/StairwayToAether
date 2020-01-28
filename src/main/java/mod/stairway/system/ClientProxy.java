package mod.stairway.system;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import mod.stairway.StairKeeper;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void PreInit(FMLPreInitializationEvent preEvent){
		StairKeeper.init();
		StairKeeper.registerStuff(true);
		StairKeeper.registerRecipes();
		StairKeeper.registerSounds();
	}
	
	@Override
	public void Init(FMLInitializationEvent event){
		StairKeeper.registerRenders();
		StairKeeper.registerStuff(false);
		StairKeeper.registerEntities();
	}
	
	@Override
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
}
