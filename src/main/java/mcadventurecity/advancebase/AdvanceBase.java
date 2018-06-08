package mcadventurecity.advancebase;

import mcadventurecity.advancebase.util.AdvanceBaseTab;
import mcadventurecity.advancebase.blocks.AdvanceBaseBlocks;
import mcadventurecity.advancebase.items.AdvanceBaseItems;
import mcadventurecity.advancebase.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import mcadventurecity.advancebase.util.Constants;
import mcadventurecity.advancebase.util.AdvanceBaseRecipes;
import mcadventurecity.advancebase.world.ModWorldGen;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION/*, dependencies="required-after:forge@[2703,)"*/)
public class AdvanceBase {
    @SidedProxy(serverSide = "mcadventurecity.advancebase.proxy.CommonProxy", clientSide = "mcadventurecity.advancebase.proxy.ClientProxy")
    public static CommonProxy proxy;
    public static final AdvanceBaseTab advanceBaseTab = new AdvanceBaseTab();
    @Mod.Instance(Constants.MODID)
    public static AdvanceBase instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
    	AdvanceBaseRecipes.init();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	AdvanceBaseBlocks.registerOres();
    	AdvanceBaseItems.registerOres();
    }
    @Mod.EventBusSubscriber
    public static class RegistrationHandler{
    	 @SubscribeEvent
         public static void registerBlocks(RegistryEvent.Register<Block> event){
             AdvanceBaseBlocks.register(event.getRegistry());

         }
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event){
            AdvanceBaseItems.register(event.getRegistry());
            AdvanceBaseBlocks.registerItemBlocks(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event){
        	AdvanceBaseBlocks.registerModels();
            AdvanceBaseItems.registerModels();
        }

    }
}
