package mod.stairway;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod("stairway")
public class StairwayToAether {

    /** Log Manager Instance */
    public static final Logger LOGGER = LogManager.getLogger();
    /** The Mod ID */
    public static final String MODID = "stairway";



    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public StairwayToAether() {
        MinecraftForge.EVENT_BUS.register(this);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doServerStuff);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        StairwayConfig.init();
    }



    //----------------------------------------SETUP_EVENTS----------------------------------------//

    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_WHITE,     RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_ORANGE,    RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_MAGENTA,   RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_LIGHTBLUE, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_YELLOW,    RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_LIME,      RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_PINK,      RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_GRAY,      RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_SILVER,    RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_CYAN,      RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_PURPLE,    RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_BLUE,      RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_BROWN,     RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_GREEN,     RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_RED,       RenderType.translucent());
        RenderTypeLookup.setRenderLayer(StairKeeper.BLOCK_LIGHT_BLACK,     RenderType.translucent());
    }

    private void doServerStuff(final FMLCommonSetupEvent event){
        StairwayConfig.load();
    }

    /** Register Event */
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            StairKeeper.registerStuff();
        }
    }
}
