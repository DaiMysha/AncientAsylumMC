
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientasylum.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.ancientasylum.item.RubberItem;
import net.mcreator.ancientasylum.AncientAsylumMod;

public class AncientAsylumModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AncientAsylumMod.MODID);
	public static final DeferredItem<Item> RUBBER = REGISTRY.register("rubber", RubberItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
