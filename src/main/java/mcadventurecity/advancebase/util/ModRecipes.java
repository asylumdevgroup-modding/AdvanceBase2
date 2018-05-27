package mcadventurecity.advancebase.util;

import mcadventurecity.advancebase.blocks.ModBlocks;
import mcadventurecity.advancebase.items.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init(){
		GameRegistry.addSmelting(ModBlocks.advanciumOre, new ItemStack(ModItems.advanciumIngot), 0.7f);
		GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot), 0.7f);
		GameRegistry.addSmelting(ModBlocks.tinOre, new ItemStack(ModItems.tinIngot), 0.5f);
		GameRegistry.addSmelting(ModBlocks.aluminumOre, new ItemStack(ModItems.aluminumIngot), 0.8f);
		GameRegistry.addSmelting(ModBlocks.leadOre, new ItemStack(ModItems.leadIngot), 1.0f);
		GameRegistry.addSmelting(ModBlocks.silverOre, new ItemStack(ModItems.silverIngot), 1.0f);
		
	}
}
