package mcadventurecity.advancebase.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockOre advanciumOre = new BlockOre("advancium_ore", "oreAdvancium");
	public static BlockOre copperOre = new BlockOre("copper_ore", "oreCopper");
	public static BlockOre tinOre = new BlockOre("tin_ore", "oreTin");
	public static BlockOre aluminumOre = new BlockOre("aluminum_ore", "oreAluminum");
	public static BlockOre leadOre = new BlockOre("lead_ore", "oreLead");
	public static BlockOre silverOre = new BlockOre("silver_ore", "oreSilver");
	public static BlockOre copperBlock = new BlockOre("copper_block", "blockCopper");
	public static BlockOre tinBlock = new BlockOre("tin_block", "blockTin");
	public static BlockOre aluminumBlock = new BlockOre("aluminum_block", "blockAluminum");
	public static BlockOre leadBlock = new BlockOre("lead_block", "blockLead");
	public static BlockOre silverBlock = new BlockOre("silver_block", "blockSilver");
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				advanciumOre,
				copperOre,
				tinOre,
				aluminumOre,
				leadOre,
				silverOre,
				copperBlock,
				tinBlock,
				aluminumBlock,
				leadBlock,
				silverBlock
		);

	}
	public static void registerOres() {
		advanciumOre.initOreDict();
		copperOre.initOreDict();
		tinOre.initOreDict();
		aluminumOre.initOreDict();
		leadOre.initOreDict();
		silverOre.initOreDict();
		copperBlock.initOreDict();
		tinBlock.initOreDict();
		aluminumBlock.initOreDict();
		leadBlock.initOreDict();
		silverBlock.initOreDict();
	}
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				advanciumOre.createItemBlock(),
				copperOre.createItemBlock(),
				tinOre.createItemBlock(),
				aluminumOre.createItemBlock(),
				leadOre.createItemBlock(),
				silverOre.createItemBlock(),
				copperBlock.createItemBlock(),
				tinBlock.createItemBlock(),
				aluminumBlock.createItemBlock(),
				leadBlock.createItemBlock(),
				silverBlock.createItemBlock()
		);
	}

	public static void registerModels() {
		advanciumOre.registerItemModel(Item.getItemFromBlock(advanciumOre));
		copperOre.registerItemModel(Item.getItemFromBlock(copperOre));
		tinOre.registerItemModel(Item.getItemFromBlock(tinOre));
		aluminumOre.registerItemModel(Item.getItemFromBlock(aluminumOre));
		leadOre.registerItemModel(Item.getItemFromBlock(leadOre));
		silverOre.registerItemModel(Item.getItemFromBlock(silverOre));
		copperBlock.registerItemModel(Item.getItemFromBlock(copperBlock));
		tinBlock.registerItemModel(Item.getItemFromBlock(tinBlock));
		aluminumBlock.registerItemModel(Item.getItemFromBlock(aluminumBlock));
		leadBlock.registerItemModel(Item.getItemFromBlock(leadBlock));
		silverBlock.registerItemModel(Item.getItemFromBlock(silverBlock));
	}
}
