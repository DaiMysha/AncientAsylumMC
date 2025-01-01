
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

import net.mcreator.ancientasylum.item.SyntheticTreeCapsuleItem;
import net.mcreator.ancientasylum.item.SyntheticSaplingItem;
import net.mcreator.ancientasylum.item.SpruceTreeCapsuleItem;
import net.mcreator.ancientasylum.item.RubberItem;
import net.mcreator.ancientasylum.item.OakTreeCapsuleItem;
import net.mcreator.ancientasylum.item.JungleTreeCapsuleItem;
import net.mcreator.ancientasylum.item.EmptyTreeCapsuleItem;
import net.mcreator.ancientasylum.item.DarkOakTreeCapsuleItem;
import net.mcreator.ancientasylum.item.CherryTreeCapsuleItem;
import net.mcreator.ancientasylum.item.BirchTreeCapsuleItem;
import net.mcreator.ancientasylum.AncientAsylumMod;

public class AncientAsylumModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AncientAsylumMod.MODID);
	public static final DeferredItem<Item> RUBBER = REGISTRY.register("rubber", RubberItem::new);
	public static final DeferredItem<Item> RUBBER_BLOCK = block(AncientAsylumModBlocks.RUBBER_BLOCK);
	public static final DeferredItem<Item> SYNTHETIC_LOG = block(AncientAsylumModBlocks.SYNTHETIC_LOG);
	public static final DeferredItem<Item> SYNTHETIC_PLANK = block(AncientAsylumModBlocks.SYNTHETIC_PLANK);
	public static final DeferredItem<Item> SYNTHETIC_TREE_CAPSULE = REGISTRY.register("synthetic_tree_capsule", SyntheticTreeCapsuleItem::new);
	public static final DeferredItem<Item> OAK_TREE_CAPSULE = REGISTRY.register("oak_tree_capsule", OakTreeCapsuleItem::new);
	public static final DeferredItem<Item> SPRUCE_TREE_CAPSULE = REGISTRY.register("spruce_tree_capsule", SpruceTreeCapsuleItem::new);
	public static final DeferredItem<Item> BIRCH_TREE_CAPSULE = REGISTRY.register("birch_tree_capsule", BirchTreeCapsuleItem::new);
	public static final DeferredItem<Item> JUNGLE_TREE_CAPSULE = REGISTRY.register("jungle_tree_capsule", JungleTreeCapsuleItem::new);
	public static final DeferredItem<Item> DARK_OAK_TREE_CAPSULE = REGISTRY.register("dark_oak_tree_capsule", DarkOakTreeCapsuleItem::new);
	public static final DeferredItem<Item> CHERRY_TREE_CAPSULE = REGISTRY.register("cherry_tree_capsule", CherryTreeCapsuleItem::new);
	public static final DeferredItem<Item> EMPTY_TREE_CAPSULE = REGISTRY.register("empty_tree_capsule", EmptyTreeCapsuleItem::new);
	public static final DeferredItem<Item> SYNTHETIC_SAPLING = REGISTRY.register("synthetic_sapling", SyntheticSaplingItem::new);
	public static final DeferredItem<Item> GROWTH_CHAMBER = block(AncientAsylumModBlocks.GROWTH_CHAMBER);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
