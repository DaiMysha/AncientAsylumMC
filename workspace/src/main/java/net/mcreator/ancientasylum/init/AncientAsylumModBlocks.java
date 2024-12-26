
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientasylum.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.ancientasylum.block.SyntheticPlankBlock;
import net.mcreator.ancientasylum.block.SyntheticLogBlock;
import net.mcreator.ancientasylum.block.RubberBlockBlock;
import net.mcreator.ancientasylum.AncientAsylumMod;

public class AncientAsylumModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AncientAsylumMod.MODID);
	public static final DeferredBlock<Block> RUBBER_BLOCK = REGISTRY.register("rubber_block", RubberBlockBlock::new);
	public static final DeferredBlock<Block> SYNTHETIC_LOG = REGISTRY.register("synthetic_log", SyntheticLogBlock::new);
	public static final DeferredBlock<Block> SYNTHETIC_PLANK = REGISTRY.register("synthetic_plank", SyntheticPlankBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
