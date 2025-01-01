
package net.mcreator.ancientasylum.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptyTreeCapsuleItem extends Item {
	public EmptyTreeCapsuleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
