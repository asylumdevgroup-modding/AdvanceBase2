package mcadventurecity.advancebase.items;

import mcadventurecity.advancebase.AdvanceBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by Jarod Reichel on 7/16/2017.
 */
public class ModItems {

    public static ItemBase advanciumIngot = new ItemBase("advancium_ingot").setCreativeTab(AdvanceBase.advanceBaseTab);


    public static void register(IForgeRegistry<Item> registry){
        registry.registerAll(
                advanciumIngot
        );
    }
    public static void registerModels(){
        advanciumIngot.registerItemModel();
    }
}
