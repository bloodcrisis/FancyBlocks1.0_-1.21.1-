package net.pantrymoth.fancyblocks.event;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.pantrymoth.fancyblocks.block.ModBlocks;

import java.util.Map;

public class ModMaps {
    public static final Map<Block, Block> GOLD_MAP =
            Map.ofEntries(
                    Map.entry(Blocks.STONE_BRICKS, ModBlocks.GOLD_STONE_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_STONE_BRICKS, ModBlocks.GOLD_CHISELED_STONE_BRICKS.get()),
                    Map.entry(Blocks.STONE_BRICK_STAIRS, ModBlocks.GOLD_STONE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.STONE_BRICK_WALL, ModBlocks.GOLD_STONE_BRICK_WALL.get()),

                    Map.entry(Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_POLISHED_BLACKSTONE, ModBlocks.GOLD_CHISELED_POLISHED_BLACKSTONE.get()),
                    Map.entry(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.POLISHED_BLACKSTONE_BRICK_WALL, ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICK_WALL.get()),

                    Map.entry(Blocks.END_STONE_BRICKS, ModBlocks.GOLD_END_STONE_BRICKS.get()),
                    Map.entry(Blocks.END_STONE_BRICK_STAIRS, ModBlocks.GOLD_END_STONE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.END_STONE_BRICK_WALL, ModBlocks.GOLD_END_STONE_BRICK_WALL.get()),

                    Map.entry(Blocks.DEEPSLATE_BRICKS, ModBlocks.GOLD_DEEPSLATE_BRICKS.get()),
                    Map.entry(Blocks.DEEPSLATE_BRICK_STAIRS, ModBlocks.GOLD_DEEPSLATE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.DEEPSLATE_BRICK_WALL, ModBlocks.GOLD_DEEPSLATE_BRICK_WALL.get()),

                    Map.entry(Blocks.DEEPSLATE_TILES, ModBlocks.GOLD_DEEPSLATE_TILES.get()),
                    Map.entry(Blocks.CHISELED_DEEPSLATE, ModBlocks.GOLD_CHISELED_DEEPSLATE.get()),
                    Map.entry(Blocks.DEEPSLATE_TILE_STAIRS, ModBlocks.GOLD_DEEPSLATE_TILE_STAIRS.get()),
                    Map.entry(Blocks.DEEPSLATE_TILE_WALL, ModBlocks.GOLD_DEEPSLATE_TILE_WALL.get()),

                    Map.entry(Blocks.TUFF_BRICKS, ModBlocks.GOLD_TUFF_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_TUFF, ModBlocks.GOLD_CHISELED_TUFF.get()),
                    Map.entry(Blocks.CHISELED_TUFF_BRICKS, ModBlocks.GOLD_CHISELED_TUFF_BRICKS.get()),
                    Map.entry(Blocks.TUFF_BRICK_STAIRS, ModBlocks.GOLD_TUFF_BRICK_STAIRS.get()),
                    Map.entry(Blocks.TUFF_BRICK_WALL, ModBlocks.GOLD_TUFF_BRICK_WALL.get()),

                    Map.entry(Blocks.QUARTZ_BRICKS, ModBlocks.GOLD_QUARTZ_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_QUARTZ_BLOCK, ModBlocks.GOLD_CHISELED_QUARTZ.get()),

                    Map.entry(Blocks.NETHER_BRICKS, ModBlocks.GOLD_NETHER_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_NETHER_BRICKS, ModBlocks.GOLD_CHISELED_NETHER_BRICKS.get()),
                    Map.entry(Blocks.NETHER_BRICK_STAIRS, ModBlocks.GOLD_NETHER_BRICK_STAIRS.get()),
                    Map.entry(Blocks.NETHER_BRICK_WALL, ModBlocks.GOLD_NETHER_BRICK_WALL.get()),

                    Map.entry(Blocks.PRISMARINE_BRICKS, ModBlocks.GOLD_PRISMARINE_BRICKS.get()),
                    Map.entry(Blocks.PRISMARINE_BRICK_STAIRS, ModBlocks.GOLD_PRISMARINE_BRICK_STAIRS.get()),

                    Map.entry(Blocks.PURPUR_BLOCK, ModBlocks.GOLD_PURPUR_BLOCK.get()),
                    Map.entry(Blocks.PURPUR_STAIRS, ModBlocks.GOLD_PURPUR_STAIRS.get()),

                    Map.entry(Blocks.CHISELED_SANDSTONE, ModBlocks.GOLD_CHISELED_SANDSTONE.get()),
                    Map.entry(Blocks.CHISELED_RED_SANDSTONE, ModBlocks.GOLD_CHISELED_RED_SANDSTONE.get())
                    );

    public static final Map<Block, Block> EMERALD_MAP =
            Map.ofEntries(
                    Map.entry(Blocks.STONE_BRICKS, ModBlocks.EMERALD_STONE_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_STONE_BRICKS, ModBlocks.EMERALD_CHISELED_STONE_BRICKS.get()),
                    Map.entry(Blocks.STONE_BRICK_STAIRS, ModBlocks.EMERALD_STONE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.STONE_BRICK_WALL, ModBlocks.EMERALD_STONE_BRICK_WALL.get()),

                    Map.entry(Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_POLISHED_BLACKSTONE, ModBlocks.EMERALD_CHISELED_POLISHED_BLACKSTONE.get()),
                    Map.entry(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.POLISHED_BLACKSTONE_BRICK_WALL, ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICK_WALL.get()),

                    Map.entry(Blocks.END_STONE_BRICKS, ModBlocks.EMERALD_END_STONE_BRICKS.get()),
                    Map.entry(Blocks.END_STONE_BRICK_STAIRS, ModBlocks.EMERALD_END_STONE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.END_STONE_BRICK_WALL, ModBlocks.EMERALD_END_STONE_BRICK_WALL.get()),

                    Map.entry(Blocks.DEEPSLATE_BRICKS, ModBlocks.EMERALD_DEEPSLATE_BRICKS.get()),
                    Map.entry(Blocks.DEEPSLATE_BRICK_STAIRS, ModBlocks.EMERALD_DEEPSLATE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.DEEPSLATE_BRICK_WALL, ModBlocks.EMERALD_DEEPSLATE_BRICK_WALL.get()),

                    Map.entry(Blocks.DEEPSLATE_TILES, ModBlocks.EMERALD_DEEPSLATE_TILES.get()),
                    Map.entry(Blocks.CHISELED_DEEPSLATE, ModBlocks.EMERALD_CHISELED_DEEPSLATE.get()),
                    Map.entry(Blocks.DEEPSLATE_TILE_STAIRS, ModBlocks.EMERALD_DEEPSLATE_TILE_STAIRS.get()),
                    Map.entry(Blocks.DEEPSLATE_TILE_WALL, ModBlocks.EMERALD_DEEPSLATE_TILE_WALL.get()),

                    Map.entry(Blocks.TUFF_BRICKS, ModBlocks.EMERALD_TUFF_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_TUFF, ModBlocks.EMERALD_CHISELED_TUFF.get()),
                    Map.entry(Blocks.CHISELED_TUFF_BRICKS, ModBlocks.EMERALD_CHISELED_TUFF_BRICKS.get()),
                    Map.entry(Blocks.TUFF_BRICK_STAIRS, ModBlocks.EMERALD_TUFF_BRICK_STAIRS.get()),
                    Map.entry(Blocks.TUFF_BRICK_WALL, ModBlocks.EMERALD_TUFF_BRICK_WALL.get()),

                    Map.entry(Blocks.QUARTZ_BRICKS, ModBlocks.EMERALD_QUARTZ_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_QUARTZ_BLOCK, ModBlocks.EMERALD_CHISELED_QUARTZ.get()),

                    Map.entry(Blocks.NETHER_BRICKS, ModBlocks.EMERALD_NETHER_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_NETHER_BRICKS, ModBlocks.EMERALD_CHISELED_NETHER_BRICKS.get()),
                    Map.entry(Blocks.NETHER_BRICK_STAIRS, ModBlocks.EMERALD_NETHER_BRICK_STAIRS.get()),
                    Map.entry(Blocks.NETHER_BRICK_WALL, ModBlocks.EMERALD_NETHER_BRICK_WALL.get()),

                    Map.entry(Blocks.PRISMARINE_BRICKS, ModBlocks.EMERALD_PRISMARINE_BRICKS.get()),
                    Map.entry(Blocks.PRISMARINE_BRICK_STAIRS, ModBlocks.EMERALD_PRISMARINE_BRICK_STAIRS.get()),

                    Map.entry(Blocks.PURPUR_BLOCK, ModBlocks.EMERALD_PURPUR_BLOCK.get()),
                    Map.entry(Blocks.PURPUR_STAIRS, ModBlocks.EMERALD_PURPUR_STAIRS.get()),

                    Map.entry(Blocks.CHISELED_SANDSTONE, ModBlocks.EMERALD_CHISELED_SANDSTONE.get()),
                    Map.entry(Blocks.CHISELED_RED_SANDSTONE, ModBlocks.EMERALD_CHISELED_RED_SANDSTONE.get())
            );

    public static final Map<Block, Block> DIAMOND_MAP =
            Map.ofEntries(
                    Map.entry(Blocks.STONE_BRICKS, ModBlocks.DIAMOND_STONE_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_STONE_BRICKS, ModBlocks.DIAMOND_CHISELED_STONE_BRICKS.get()),
                    Map.entry(Blocks.STONE_BRICK_STAIRS, ModBlocks.DIAMOND_STONE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.STONE_BRICK_WALL, ModBlocks.DIAMOND_STONE_BRICK_WALL.get()),

                    Map.entry(Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_POLISHED_BLACKSTONE, ModBlocks.DIAMOND_CHISELED_POLISHED_BLACKSTONE.get()),
                    Map.entry(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.POLISHED_BLACKSTONE_BRICK_WALL, ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICK_WALL.get()),

                    Map.entry(Blocks.END_STONE_BRICKS, ModBlocks.DIAMOND_END_STONE_BRICKS.get()),
                    Map.entry(Blocks.END_STONE_BRICK_STAIRS, ModBlocks.DIAMOND_END_STONE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.END_STONE_BRICK_WALL, ModBlocks.DIAMOND_END_STONE_BRICK_WALL.get()),

                    Map.entry(Blocks.DEEPSLATE_BRICKS, ModBlocks.DIAMOND_DEEPSLATE_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_DEEPSLATE, ModBlocks.DIAMOND_CHISELED_DEEPSLATE.get()),
                    Map.entry(Blocks.DEEPSLATE_BRICK_STAIRS, ModBlocks.DIAMOND_DEEPSLATE_BRICK_STAIRS.get()),
                    Map.entry(Blocks.DEEPSLATE_BRICK_WALL, ModBlocks.DIAMOND_DEEPSLATE_BRICK_WALL.get()),

                    Map.entry(Blocks.DEEPSLATE_TILES, ModBlocks.DIAMOND_DEEPSLATE_TILES.get()),
                    Map.entry(Blocks.DEEPSLATE_TILE_STAIRS, ModBlocks.DIAMOND_DEEPSLATE_TILE_STAIRS.get()),
                    Map.entry(Blocks.DEEPSLATE_TILE_WALL, ModBlocks.DIAMOND_DEEPSLATE_TILE_WALL.get()),

                    Map.entry(Blocks.TUFF_BRICKS, ModBlocks.DIAMOND_TUFF_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_TUFF, ModBlocks.DIAMOND_CHISELED_TUFF.get()),
                    Map.entry(Blocks.CHISELED_TUFF_BRICKS, ModBlocks.DIAMOND_CHISELED_TUFF_BRICKS.get()),
                    Map.entry(Blocks.TUFF_BRICK_STAIRS, ModBlocks.DIAMOND_TUFF_BRICK_STAIRS.get()),
                    Map.entry(Blocks.TUFF_BRICK_WALL, ModBlocks.DIAMOND_TUFF_BRICK_WALL.get()),

                    Map.entry(Blocks.QUARTZ_BRICKS, ModBlocks.DIAMOND_QUARTZ_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_QUARTZ_BLOCK, ModBlocks.DIAMOND_CHISELED_QUARTZ.get()),

                    Map.entry(Blocks.NETHER_BRICKS, ModBlocks.DIAMOND_NETHER_BRICKS.get()),
                    Map.entry(Blocks.CHISELED_NETHER_BRICKS, ModBlocks.DIAMOND_CHISELED_NETHER_BRICKS.get()),
                    Map.entry(Blocks.NETHER_BRICK_STAIRS, ModBlocks.DIAMOND_NETHER_BRICK_STAIRS.get()),
                    Map.entry(Blocks.NETHER_BRICK_WALL, ModBlocks.DIAMOND_NETHER_BRICK_WALL.get()),

                    Map.entry(Blocks.PRISMARINE_BRICKS, ModBlocks.DIAMOND_PRISMARINE_BRICKS.get()),
                    Map.entry(Blocks.PRISMARINE_BRICK_STAIRS, ModBlocks.DIAMOND_PRISMARINE_BRICK_STAIRS.get()),

                    Map.entry(Blocks.PURPUR_BLOCK, ModBlocks.DIAMOND_PURPUR_BLOCK.get()),
                    Map.entry(Blocks.PURPUR_STAIRS, ModBlocks.DIAMOND_PURPUR_STAIRS.get()),

                    Map.entry(Blocks.CHISELED_SANDSTONE, ModBlocks.DIAMOND_CHISELED_SANDSTONE.get()),
                    Map.entry(Blocks.CHISELED_RED_SANDSTONE, ModBlocks.DIAMOND_CHISELED_RED_SANDSTONE.get())
            );
}