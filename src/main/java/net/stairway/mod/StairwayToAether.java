package net.stairway.mod;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.stairway.mod.proxy.CommonProxy;

@Mod(modid = StairwayToAether.modid, version = StairwayToAether.version, name = StairwayToAether.modName, dependencies = StairwayToAether.dependencies)
public class StairwayToAether {
	
	public static final String modid = "stairway";
	public static final String version = "v03";
	public static final String modName = "Stairway to Aether";
	public static final String dependencies = "";
	
	@Instance(modid)
	public static StairwayToAether instance;
	
	
	
	
	
	@SidedProxy(clientSide = "net.stairway.mod.proxy.ClientProxy", serverSide = "net.stairway.mod.proxy.CommonProxy")
	public static CommonProxy stairProxy;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		StairKeeper.loadConfig(preEvent);
		CommonProxy.PreInit(preEvent);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		CommonProxy.Init(event);
		MinecraftForge.EVENT_BUS.register(new StairHook());
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		CommonProxy.PostInit(postEvent);
	}
	
}
