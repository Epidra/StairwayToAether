package mod.stairway;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("stairway")
public class StairwayToAether {

    /** The Mod ID */
    public static final String MODID = "stairway";





    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public StairwayToAether() {
        MinecraftForge.EVENT_BUS.register(this);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupCommon);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient);
        StairKeeper.register();
    }





    //----------------------------------------SETUP----------------------------------------//

    private void setupCommon(final FMLCommonSetupEvent event){
        StairKeeper.setup(event);
    }

    private void setupClient(final FMLClientSetupEvent event) {
        StairKeeper.setup(event);
    }



}
