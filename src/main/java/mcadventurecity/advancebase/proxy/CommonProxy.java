package mcadventurecity.advancebase.proxy;

import java.io.File;

import mcadventurecity.advancebase.Config;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public static Configuration config;
	public void preInit(FMLPreInitializationEvent e) {
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "adg/advancemods/base.cfg"));
        Config.readConfig();

    }
	public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
    }

    public void registerItemRenderer(Item item, int meta, String id){
    	
    }
    
}
