package net.pantrymoth.fancyblocks.event;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.pantrymoth.fancyblocks.FancyBlocks;

import static net.pantrymoth.fancyblocks.event.ModMaps.GOLD_MAP;

@EventBusSubscriber(modid = FancyBlocks.MODID)

public class ModEvents {

    @SubscribeEvent
    public static InteractionResult useOn(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        Player player = event.getEntity();
        Block clickedBlock = level.getBlockState(event.getPos()).getBlock();
        BlockPos pos = event.getPos();
        if(event.getItemStack().is(Tags.Items.INGOTS_GOLD)) {
            if(GOLD_MAP.containsKey(clickedBlock)) {
                level.playSound(player, pos, SoundEvents.COPPER_PLACE, SoundSource.BLOCKS, 1f,1f);
                if(!level.isClientSide) {
                    level.setBlockAndUpdate(event.getPos(), GOLD_MAP.get(clickedBlock).defaultBlockState());
                    if(!player.isCreative()) {
                        player.getMainHandItem().shrink(1);
                    }
                }
            }
        }
        return InteractionResult.SUCCESS;
    }
}