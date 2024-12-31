
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientasylum.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ancientasylum.AncientAsylumMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AncientAsylumModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AncientAsylumMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ANCIENT_ASYLUM_ITEMS = REGISTRY.register("ancient_asylum_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ancient_asylum.ancient_asylum_items")).icon(() -> new ItemStack(AncientAsylumModItems.RUBBER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AncientAsylumModItems.RUBBER.get());
				tabData.accept(AncientAsylumModBlocks.RUBBER_BLOCK.get().asItem());
				tabData.accept(AncientAsylumModBlocks.SYNTHETIC_LOG.get().asItem());
				tabData.accept(AncientAsylumModBlocks.SYNTHETIC_PLANK.get().asItem());
				tabData.accept(AncientAsylumModItems.SYNTHETIC_TREE_CAPSULE.get());
				tabData.accept(AncientAsylumModItems.OAK_TREE_CAPSULE.get());
				tabData.accept(AncientAsylumModItems.SPRUCE_TREE_CAPSULE.get());
				tabData.accept(AncientAsylumModItems.BIRCH_TREE_CAPSULE.get());
				tabData.accept(AncientAsylumModItems.JUNGLE_TREE_CAPSULE.get());
				tabData.accept(AncientAsylumModItems.DARK_OAK_TREE_CAPSULE.get());
				tabData.accept(AncientAsylumModItems.CHERRY_TREE_CAPSULE.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(AncientAsylumModItems.RUBBER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(AncientAsylumModBlocks.RUBBER_BLOCK.get().asItem());
			tabData.accept(AncientAsylumModBlocks.SYNTHETIC_LOG.get().asItem());
			tabData.accept(AncientAsylumModBlocks.SYNTHETIC_PLANK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(AncientAsylumModItems.SYNTHETIC_TREE_CAPSULE.get());
			tabData.accept(AncientAsylumModItems.OAK_TREE_CAPSULE.get());
			tabData.accept(AncientAsylumModItems.SPRUCE_TREE_CAPSULE.get());
			tabData.accept(AncientAsylumModItems.BIRCH_TREE_CAPSULE.get());
			tabData.accept(AncientAsylumModItems.JUNGLE_TREE_CAPSULE.get());
			tabData.accept(AncientAsylumModItems.DARK_OAK_TREE_CAPSULE.get());
			tabData.accept(AncientAsylumModItems.CHERRY_TREE_CAPSULE.get());
		}
	}
}
