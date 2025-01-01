
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientasylum.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.ancientasylum.world.inventory.TreeGrowerCraftingInterfaceMenu;
import net.mcreator.ancientasylum.AncientAsylumMod;

public class AncientAsylumModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, AncientAsylumMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<TreeGrowerCraftingInterfaceMenu>> TREE_GROWER_CRAFTING_INTERFACE = REGISTRY.register("tree_grower_crafting_interface",
			() -> IMenuTypeExtension.create(TreeGrowerCraftingInterfaceMenu::new));
}
