package mod.stairway;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import mod.stairway.system.CommonProxy;

@Mod(modid = StairwayToAether.modid, version = StairwayToAether.version, name = StairwayToAether.modName, dependencies = StairwayToAether.dependencies)
public class StairwayToAether {
	
	public static final String modid        = "stairway";
	public static final String version      = "v09";
	public static final String modName      = "StairwayToAether";
	public static final String dependencies = "";
	
	@Instance(modid)
	public static StairwayToAether instance;
	
	@SidedProxy(clientSide = "mod.stairway.system.ClientProxy", serverSide = "mod.stairway.system.CommonProxy")
	public static CommonProxy aceProxy;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		StairKeeper.loadConfig(preEvent);
		aceProxy.PreInit(preEvent);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		aceProxy.Init(event);
		MinecraftForge.EVENT_BUS.register(new StairHook());
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		aceProxy.PostInit(postEvent);
	}
	
}
