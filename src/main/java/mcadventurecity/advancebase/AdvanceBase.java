package mcadventurecity.advancebase;

import mcadventurecity.advancebase.util.AdvanceBaseTab;
import mcadventurecity.advancebase.util.CommonProxy;
import mcadventurecity.advancebase.blocks.ModBlocks;
import mcadventurecity.advancebase.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import mcadventurecity.advancebase.util.Constants;
import mcadventurecity.advancebase.util.ModRecipes;
import mcadventurecity.advancebase.world.ModWorldGen;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class AdvanceBase {
    @SidedProxy(serverSide = "mcadventurecity.advancebase.util.CommonProxy", clientSide = "mcadventurecity.advancebase.util.ClientProxy")
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
    	ModRecipes.init();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
    @Mod.EventBusSubscriber
    public static class RegistrationHandler{
    	 @SubscribeEvent
         public static void registerBlocks(RegistryEvent.Register<Block> event){
             ModBlocks.register(event.getRegistry());

         }
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event){
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event){
        	ModBlocks.registerModels();
            ModItems.registerModels();
        }

    }
}
