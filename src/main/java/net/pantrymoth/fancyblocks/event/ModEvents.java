package net.pantrymoth.fancyblocks.event;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.pantrymoth.fancyblocks.FancyBlocks;

import java.util.Objects;

import static net.pantrymoth.fancyblocks.event.ModMaps.*;

@EventBusSubscriber(modid = FancyBlocks.MODID)

public class ModEvents {

    @SubscribeEvent
    public static InteractionResult useOn(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        Player player = event.getEntity();
        Block clickedBlock = level.getBlockState(event.getPos()).getBlock();
        BlockPos pos = event.getPos();
        if(event.getItemStack().is(Tags.Items.INGOTS_GOLD)) {
            if (GOLD_MAP.containsKey(clickedBlock)) {
                level.playSound(player, pos, SoundEvents.COPPER_PLACE, SoundSource.BLOCKS, 1f, 1f);
                if (!level.isClientSide) {

                    BlockState blockState = event.getLevel().getBlockState(pos);

                    if (clickedBlock instanceof StairBlock) {
                        level.setBlockAndUpdate(pos, Objects.requireNonNull(GOLD_MAP.get(clickedBlock).defaultBlockState()
                                .setValue(StairBlock.HALF, blockState.getValue(StairBlock.HALF))
                                .setValue(StairBlock.FACING, blockState.getValue(StairBlock.FACING))
                                .setValue(StairBlock.SHAPE, blockState.getValue(StairBlock.SHAPE))
                                .setValue(StairBlock.WATERLOGGED, blockState.getValue(StairBlock.WATERLOGGED))));
                    } else if (clickedBlock instanceof WallBlock) {
                        level.setBlockAndUpdate(pos, Objects.requireNonNull(GOLD_MAP.get(clickedBlock).defaultBlockState()
                                .setValue(WallBlock.EAST_WALL, blockState.getValue(WallBlock.EAST_WALL))
                                .setValue(WallBlock.NORTH_WALL, blockState.getValue(WallBlock.NORTH_WALL))
                                .setValue(WallBlock.WEST_WALL, blockState.getValue(WallBlock.WEST_WALL))
                                .setValue(WallBlock.SOUTH_WALL, blockState.getValue(WallBlock.SOUTH_WALL))
                                .setValue(WallBlock.UP, blockState.getValue(WallBlock.UP))
                                .setValue(StairBlock.WATERLOGGED, blockState.getValue(StairBlock.WATERLOGGED))));
                    } else {
                        level.setBlockAndUpdate(pos, Objects.requireNonNull(GOLD_MAP.get(clickedBlock).defaultBlockState()));
                    }
                    if (!player.isCreative()) {
                        player.getMainHandItem().shrink(1);
                    }
                }
            }
        }
        else if(event.getItemStack().is(Tags.Items.GEMS_DIAMOND)) {
            if (DIAMOND_MAP.containsKey(clickedBlock)) {
                level.playSound(player, pos, SoundEvents.AMETHYST_BLOCK_STEP, SoundSource.BLOCKS, 1f, 1f);
                if (!level.isClientSide) {

                    BlockState blockState = event.getLevel().getBlockState(pos);

                    if (clickedBlock instanceof StairBlock) {
                        level.setBlockAndUpdate(pos, Objects.requireNonNull(DIAMOND_MAP.get(clickedBlock).defaultBlockState()
                                .setValue(StairBlock.HALF, blockState.getValue(StairBlock.HALF))
                                .setValue(StairBlock.FACING, blockState.getValue(StairBlock.FACING))
                                .setValue(StairBlock.SHAPE, blockState.getValue(StairBlock.SHAPE))
                                .setValue(StairBlock.WATERLOGGED, blockState.getValue(StairBlock.WATERLOGGED))));
                    } else if (clickedBlock instanceof WallBlock) {
                        level.setBlockAndUpdate(pos, Objects.requireNonNull(DIAMOND_MAP.get(clickedBlock).defaultBlockState()
                                .setValue(WallBlock.EAST_WALL, blockState.getValue(WallBlock.EAST_WALL))
                                .setValue(WallBlock.NORTH_WALL, blockState.getValue(WallBlock.NORTH_WALL))
                                .setValue(WallBlock.WEST_WALL, blockState.getValue(WallBlock.WEST_WALL))
                                .setValue(WallBlock.SOUTH_WALL, blockState.getValue(WallBlock.SOUTH_WALL))
                                .setValue(WallBlock.UP, blockState.getValue(WallBlock.UP))
                                .setValue(StairBlock.WATERLOGGED, blockState.getValue(StairBlock.WATERLOGGED))));
                    } else {
                        level.setBlockAndUpdate(pos, Objects.requireNonNull(DIAMOND_MAP.get(clickedBlock).defaultBlockState()));
                    }
                    if (!player.isCreative()) {
                        player.getMainHandItem().shrink(1);
                    }
                }
            }
        }
        else if(event.getItemStack().is(Tags.Items.GEMS_EMERALD)) {
            if (EMERALD_MAP.containsKey(clickedBlock)) {
                level.playSound(player, pos, SoundEvents.AMETHYST_BLOCK_STEP, SoundSource.BLOCKS, 1f, 1f);
                if (!level.isClientSide) {

                    BlockState blockState = event.getLevel().getBlockState(pos);

                    if (clickedBlock instanceof StairBlock) {
                        level.setBlockAndUpdate(pos, Objects.requireNonNull(EMERALD_MAP.get(clickedBlock).defaultBlockState()
                                .setValue(StairBlock.HALF, blockState.getValue(StairBlock.HALF))
                                .setValue(StairBlock.FACING, blockState.getValue(StairBlock.FACING))
                                .setValue(StairBlock.SHAPE, blockState.getValue(StairBlock.SHAPE))
                                .setValue(StairBlock.WATERLOGGED, blockState.getValue(StairBlock.WATERLOGGED))));
                    } else if (clickedBlock instanceof WallBlock) {
                        level.setBlockAndUpdate(pos, Objects.requireNonNull(EMERALD_MAP.get(clickedBlock).defaultBlockState()
                                .setValue(WallBlock.EAST_WALL, blockState.getValue(WallBlock.EAST_WALL))
                                .setValue(WallBlock.NORTH_WALL, blockState.getValue(WallBlock.NORTH_WALL))
                                .setValue(WallBlock.WEST_WALL, blockState.getValue(WallBlock.WEST_WALL))
                                .setValue(WallBlock.SOUTH_WALL, blockState.getValue(WallBlock.SOUTH_WALL))
                                .setValue(WallBlock.UP, blockState.getValue(WallBlock.UP))
                                .setValue(StairBlock.WATERLOGGED, blockState.getValue(StairBlock.WATERLOGGED))));
                    } else {
                        level.setBlockAndUpdate(pos, Objects.requireNonNull(EMERALD_MAP.get(clickedBlock).defaultBlockState()));
                    }
                    if (!player.isCreative()) {
                        player.getMainHandItem().shrink(1);
                    }
                }
            }
        }
        return InteractionResult.SUCCESS;
    }
}