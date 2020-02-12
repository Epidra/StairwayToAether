package mod.stairway;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

public class StairwayConfig {

    private static ForgeConfigSpec.ConfigValue<Boolean> cv_vertical;

    public static boolean vertical = true;

    public static void init() {
        Pair<Loader, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Loader::new);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, specPair.getRight());
    }

    @SuppressWarnings("unchecked")
    public static void load() {
        vertical = cv_vertical.get();
    }

    static class Loader {
        public Loader(ForgeConfigSpec.Builder builder) {
            builder.push("general");
            cv_vertical = builder.define("Vertical Slabs", vertical);
            builder.pop();
        }
    }

}
