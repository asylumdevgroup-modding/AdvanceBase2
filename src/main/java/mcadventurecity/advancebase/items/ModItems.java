package mcadventurecity.advancebase.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by Jarod Reichel on 7/16/2017.
 */
public class ModItems {

    public static ItemOre advanciumIngot = new ItemOre("advancium_ingot", "ingotAdvancium");
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
    public static ItemOre aluminumGear = new ItemOre("aluminum_gear", "gearAluminum");
    public static ItemOre leadGear = new ItemOre("lead_gear", "gearLead");
    public static ItemOre silverGear = new ItemOre("silver_gear", "gearSilver");
    public static ItemOre bronzeGear = new ItemOre("bronze_gear", "gearBronze");

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
                tinGear,
                aluminumGear,
                leadGear,
                silverGear,
                bronzeGear
        );
    }
    public static void registerOres() {
    	advanciumIngot.initOreDict();
    	copperIngot.initOreDict();
    	tinIngot.initOreDict();
    	aluminumIngot.initOreDict();
    	leadIngot.initOreDict();
    	silverIngot.initOreDict();
    	bronzeIngot.initOreDict();
    	silicon.initOreDict();
    	sulfurDust.initOreDict();
    	copperGear.initOreDict();
    	tinGear.initOreDict();
    	aluminumGear.initOreDict();
    	leadGear.initOreDict();
    	silverGear.initOreDict();
    	bronzeGear.initOreDict();
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
        aluminumGear.registerItemModel();
        leadGear.registerItemModel();
        silverGear.registerItemModel();
        bronzeGear.registerItemModel();
    }
}
