package mcadventurecity.advancebase.util;

import mcadventurecity.advancebase.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by Jarod Reichel on 7/17/2017.
 */
public class AdvanceBaseTab extends CreativeTabs{
    public AdvanceBaseTab(){
        super(Constants.MODID);
    }
    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(ModItems.advanciumIngot);
    }
}
