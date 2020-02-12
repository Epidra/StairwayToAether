package mod.stairway;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        StairwayConfig.init();
    }



    //----------------------------------------SETUP_EVENTS----------------------------------------//

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
