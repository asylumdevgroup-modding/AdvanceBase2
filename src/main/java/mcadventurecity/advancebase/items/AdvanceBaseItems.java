package mcadventurecity.advancebase.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by Jarod Reichel on 7/16/2017.
 */
public class AdvanceBaseItems {

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
    public static ItemOre copperDust = new ItemOre("copper_dust", "dustCopper");
    public static ItemOre tinDust = new ItemOre("tin_dust", "dustTin");
    public static ItemOre aluminumDust = new ItemOre("aluminum_dust", "dustAluminum");
    public static ItemOre leadDust = new ItemOre("lead_dust", "dustLead");
    public static ItemOre silverDust = new ItemOre("silver_dust", "dustSilver");
    public static ItemOre bronzeDust = new ItemOre("bronze_dust", "dustBronze");
    public static ItemOre copperNugget = new ItemOre("copper_nugget", "nuggetCopper");
    public static ItemOre tinNugget = new ItemOre("tin_nugget", "nuggetTin");
    public static ItemOre aluminumNugget = new ItemOre("aluminum_nugget", "nuggetAluminum");
    public static ItemOre leadNugget = new ItemOre("lead_nugget", "nuggetLead");
    public static ItemOre silverNugget = new ItemOre("silver_nugget", "nuggetSilver");
    public static ItemOre bronzeNugget = new ItemOre("bronze_nugget", "nuggetBronze");
    public static ItemOre copperPlate = new ItemOre("copper_plate", "plateCopper");
    public static ItemOre tinPlate = new ItemOre("tin_plate", "plateTin");
    public static ItemOre aluminumPlate = new ItemOre("aluminum_plate", "plateAluminum");
    public static ItemOre leadPlate = new ItemOre("lead_plate", "plateLead");
    public static ItemOre silverPlate = new ItemOre("silver_plate", "plateSilver");
    public static ItemOre bronzePlate = new ItemOre("bronze_plate", "plateBronze");

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
                bronzeGear,
                copperDust,
                tinDust,
                aluminumDust,
                leadDust,
                silverDust,
                bronzeDust,
                copperNugget,
                tinNugget,
                aluminumNugget,
                leadNugget,
                silverNugget,
                bronzeNugget,
                copperPlate,
                tinPlate,
                aluminumPlate,
                leadPlate,
                silverPlate,
                bronzePlate
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
    	copperDust.initOreDict();
    	tinDust.initOreDict();
    	aluminumDust.initOreDict();
    	leadDust.initOreDict();
    	silverDust.initOreDict();
    	bronzeDust.initOreDict();
    	copperNugget.initOreDict();
    	tinNugget.initOreDict();
    	aluminumNugget.initOreDict();
    	leadNugget.initOreDict();
    	silverNugget.initOreDict();
    	bronzeNugget.initOreDict();
    	copperPlate.initOreDict();
    	tinPlate.initOreDict();
    	aluminumPlate.initOreDict();
    	leadPlate.initOreDict();
    	silverPlate.initOreDict();
    	bronzePlate.initOreDict();
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
        copperDust.registerItemModel();
        tinDust.registerItemModel();
        aluminumDust.registerItemModel();
        leadDust.registerItemModel();
        silverDust.registerItemModel();
        bronzeDust.registerItemModel();
        copperNugget.registerItemModel();
        tinNugget.registerItemModel();
        aluminumNugget.registerItemModel();
        leadNugget.registerItemModel();
        silverNugget.registerItemModel();
        bronzeNugget.registerItemModel();
        copperPlate.registerItemModel();
        tinPlate.registerItemModel();
        aluminumPlate.registerItemModel();
        leadPlate.registerItemModel();
        silverPlate.registerItemModel();
        bronzePlate.registerItemModel();
    }
}
