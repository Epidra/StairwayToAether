package mod.stairway;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("stairway")
public class StairwayToAether {
	
	// Define mod id in a common place for everything to reference
	public static final String MODID = "stairway";
	
	
	
	
	
	// ---------- ---------- ---------- ----------  CONSTRUCTOR  ---------- ---------- ---------- ---------- //
	
	public StairwayToAether() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupCommon);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addCreative);
		
		MinecraftForge.EVENT_BUS.register(this);
		Register.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  SETUP  ---------- ---------- ---------- ---------- //
	
	private void setupCommon(final FMLCommonSetupEvent event) {
		Register.setup(event);
	}
	
	private void setupClient(final FMLClientSetupEvent event) {
		Register.setup(event);
	}
	
	private void addCreative(BuildCreativeModeTabContentsEvent event) {
		Register.registerCreativeTabs(event);
	}
	
	
	
}