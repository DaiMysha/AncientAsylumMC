
package net.mcreator.ancientasylum.block;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.Containers;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.ancientasylum.world.inventory.TreeGrowerCraftingInterfaceMenu;
import net.mcreator.ancientasylum.procedures.GrowthChamberRecipeCalculatorProcedure;
import net.mcreator.ancientasylum.block.entity.GrowthChamberBlockEntity;

import io.netty.buffer.Unpooled;

public class GrowthChamberBlock extends Block implements EntityBlock {
	public GrowthChamberBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 10f).requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		GrowthChamberRecipeCalculatorProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		if (entity instanceof ServerPlayer player) {
			player.openMenu(new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Growth Chamber");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new TreeGrowerCraftingInterfaceMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
				}
			}, pos);
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new GrowthChamberBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof GrowthChamberBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}
}