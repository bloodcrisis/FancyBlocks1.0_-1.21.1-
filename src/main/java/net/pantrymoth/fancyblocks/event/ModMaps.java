package net.pantrymoth.fancyblocks.event;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.pantrymoth.fancyblocks.block.ModBlocks;

import java.util.Map;

public class ModMaps {
    public static final Map<Block, Block> GOLD_MAP =
            Map.ofEntries(
                    Map.entry(Blocks.STONE_BRICKS, ModBlocks.GOLD_STONE_BRICKS.get()),
                    Map.entry(Blocks.STONE_BRICK_STAIRS, ModBlocks.GOLD_STONE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.STONE_BRICK_WALL, ModBlocks.GOLD_STONE_BRICK_WALL.get()),
                    Map.entry(Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICKS.get()),
                    Map.entry(Blocks.END_STONE_BRICKS, ModBlocks.GOLD_END_STONE_BRICKS.get()),
                    Map.entry(Blocks.DEEPSLATE_BRICKS, ModBlocks.GOLD_DEEPSLATE_BRICKS.get()),
                    Map.entry(Blocks.DEEPSLATE_TILES, ModBlocks.GOLD_DEEPSLATE_TILES.get()),
                    Map.entry(Blocks.TUFF_BRICKS, ModBlocks.GOLD_TUFF_BRICKS.get()),
                    Map.entry(Blocks.QUARTZ_BRICKS, ModBlocks.GOLD_QUARTZ_BRICKS.get()),
                    Map.entry(Blocks.NETHER_BRICKS, ModBlocks.GOLD_NETHER_BRICKS.get()),
                    Map.entry(Blocks.PRISMARINE_BRICKS, ModBlocks.GOLD_PRISMARINE_BRICKS.get())
            );
}