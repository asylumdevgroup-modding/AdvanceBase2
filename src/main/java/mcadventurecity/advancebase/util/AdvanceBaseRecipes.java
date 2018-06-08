package mcadventurecity.advancebase.util;

import mcadventurecity.advancebase.blocks.AdvanceBaseBlocks;
import mcadventurecity.advancebase.items.AdvanceBaseItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdvanceBaseRecipes {
	public static void init(){
		GameRegistry.addSmelting(AdvanceBaseBlocks.advanciumOre, new ItemStack(AdvanceBaseItems.advanciumIngot), 0.7f);
		GameRegistry.addSmelting(AdvanceBaseBlocks.copperOre, new ItemStack(AdvanceBaseItems.copperIngot), 0.7f);
		GameRegistry.addSmelting(AdvanceBaseBlocks.tinOre, new ItemStack(AdvanceBaseItems.tinIngot), 0.5f);
		GameRegistry.addSmelting(AdvanceBaseBlocks.aluminumOre, new ItemStack(AdvanceBaseItems.aluminumIngot), 0.8f);
		GameRegistry.addSmelting(AdvanceBaseBlocks.leadOre, new ItemStack(AdvanceBaseItems.leadIngot), 1.0f);
		GameRegistry.addSmelting(AdvanceBaseBlocks.silverOre, new ItemStack(AdvanceBaseItems.silverIngot), 1.0f);
		
	}
}
