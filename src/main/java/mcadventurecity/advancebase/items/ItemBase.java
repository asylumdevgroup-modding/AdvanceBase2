package mcadventurecity.advancebase.items;

import mcadventurecity.advancebase.AdvanceBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Jarod Reichel on 7/16/2017.
 */
public class ItemBase extends Item {
    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AdvanceBase.advanceBaseTab);
    }
    public void registerItemModel(){

        AdvanceBase.proxy.registerItemRenderer(this, 0, name);
    }
    @Override
    public ItemBase setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }
}
