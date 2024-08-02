
package net.mcreator.dfb.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CocoaPowderItem extends Item {
	public CocoaPowderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
