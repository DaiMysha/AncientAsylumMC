
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientasylum.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ancientasylum.item.RubberItem;
import net.mcreator.ancientasylum.AncientAsylumMod;

public class AncientAsylumModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AncientAsylumMod.MODID);
	public static final DeferredItem<Item> RUBBER = REGISTRY.register("rubber", RubberItem::new);
	public static final DeferredItem<Item> RUBBER_BLOCK = block(AncientAsylumModBlocks.RUBBER_BLOCK);
	public static final DeferredItem<Item> SYNTHETIC_LOG = block(AncientAsylumModBlocks.SYNTHETIC_LOG);
	public static final DeferredItem<Item> SYNTHETIC_PLANK = block(AncientAsylumModBlocks.SYNTHETIC_PLANK);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
