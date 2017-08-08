package mcadventurecity.advancebase.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by Jarod Reichel on 7/16/2017.
 */
public class ModItems {

    public static ItemBase advanciumIngot = new ItemBase("advancium_ingot");
    public static ItemOre copperIngot = new ItemOre("copper_ingot", "ingotCopper");
    public static ItemOre tinIngot = new ItemOre("tin_ingot", "ingotTin");
    public static ItemOre aluminumIngot = new ItemOre("aluminum_ingot", "ingotAluminum");
    public static ItemOre leadIngot = new ItemOre("lead_ingot", "ingotLead");
    public static ItemOre silverIngot = new ItemOre("silver_ingot", "ingotSilver");
    public static ItemOre bronzeIngot = new ItemOre("bronze_ingot", "ingotBronze");
    public static ItemOre silicon = new ItemOre("silicon", "itemSilicon");
    public static ItemOre sulfurDust = new ItemOre("sulfur_dust", "dustSulfur");
    public static ItemBase gearBushing = new ItemBase("gear_bushing");
    public static ItemOre copperGear = new ItemOre("copper_gear", "gearCopper");
    public static ItemOre tinGear = new ItemOre("tin_gear", "gearTin");

    public static void register(IForgeRegistry<Item> registry){
        registry.registerAll(
                advanciumIngot,
                copperIngot,
                tinIngot,
                aluminumIngot,
                leadIngot,
                silverIngot,
                bronzeIngot,
                silicon,
                sulfurDust,
                gearBushing,
                copperGear,
                tinGear
        );
    }
    public static void registerModels(){
        advanciumIngot.registerItemModel();
        copperIngot.registerItemModel();
        tinIngot.registerItemModel();
        aluminumIngot.registerItemModel();
        leadIngot.registerItemModel();
        silverIngot.registerItemModel();
        bronzeIngot.registerItemModel();
        silicon.registerItemModel();
        sulfurDust.registerItemModel();
        gearBushing.registerItemModel();
        copperGear.registerItemModel();
        tinGear.registerItemModel();
    }
}
