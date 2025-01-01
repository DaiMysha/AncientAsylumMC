
package net.mcreator.ancientasylum.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SyntheticSaplingItem extends Item {
	public SyntheticSaplingItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
