package net.mcreator.ancientasylum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResult;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class SpruceTreeCapsuleRightclickedOnBlockProcedure {
	public static InteractionResult execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:dirt")))) {
			if (world instanceof ServerLevel _level)
				_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("spruce"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(), BlockPos.containing(x, y + 1, z));
			itemstack.shrink(1);
			return InteractionResult.CONSUME;
		}
		return InteractionResult.FAIL;
	}
}
