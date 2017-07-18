package mcadventurecity.advancebase;

import mcadventurecity.advancebase.util.AdvanceBaseTab;
import mcadventurecity.advancebase.util.CommonProxy;
import mcadventurecity.advancebase.items.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import mcadventurecity.advancebase.util.Constants;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class AdvanceBase {
    @SidedProxy(serverSide = "mcadventurecity.advancebase.util.CommonProxy", clientSide = "mcadventurecity.advancebase.util.ClientProxy")
    public static CommonProxy proxy;
    public static final AdvanceBaseTab advanceBaseTab = new AdvanceBaseTab();
    @Mod.Instance(Constants.MODID)
    public static AdvanceBase instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
    @Mod.EventBusSubscriber
    public static class RegistrationHandler{
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event){
            ModItems.register(event.getRegistry());

        }
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event){

            ModItems.registerModels();
        }

    }
}
