package mcadventurecity.advancebase;

import org.apache.logging.log4j.Level;

import mcadventurecity.advancebase.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;

public class Config {
	private static final String CATEGORY_WORLD = "worldgen";

    // This values below you can access elsewhere in your mod:
    public static boolean copperEnabled = true;
    public static boolean tinEnabled = true;
    public static boolean aluminumEnabled = true;
    public static boolean leadEnabled = true;
    public static boolean silverEnabled = true;

    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initWorldConfig(cfg);
        } catch (Exception e1) {
            AdvanceBase.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initWorldConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_WORLD, "Configure Ore Spawning Status Here. It is recommended to leave this unchanged if playing standalone.");
        // cfg.getBoolean() will get the value in the config if it is already specified there. If not it will create the value.
        copperEnabled = cfg.getBoolean("enableCopper", CATEGORY_WORLD, copperEnabled, "Set to false to disable copper ore generation.");
        tinEnabled = cfg.getBoolean("enableTin", CATEGORY_WORLD, tinEnabled, "Set to false to disable tin ore generation.");
        aluminumEnabled = cfg.getBoolean("enableAluminum", CATEGORY_WORLD, aluminumEnabled, "Set to false to aluminum copper ore generation.");
        leadEnabled = cfg.getBoolean("enableLead", CATEGORY_WORLD, leadEnabled, "Set to false to disable lead ore generation.");
        silverEnabled = cfg.getBoolean("enableSilver", CATEGORY_WORLD, silverEnabled, "Set to false to disable silver ore generation.");
    }

    
}
