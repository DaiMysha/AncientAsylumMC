
package net.mcreator.ancientasylum.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RubberItem extends Item {
	public RubberItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
