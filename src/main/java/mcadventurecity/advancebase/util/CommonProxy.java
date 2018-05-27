package mcadventurecity.advancebase.util;

import net.minecraft.item.Item;
import net.minecraft.util.text.translation.I18n;

/**
 * Created by Jarod Reichel on 7/16/2017.
 */
public class CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id){

    }
    public String localize(String unlocalized, Object... args) {
		return I18n.translateToLocalFormatted(unlocalized, args);
	}
}
