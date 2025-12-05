package net.pantrymoth.fancyblocks.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.pantrymoth.fancyblocks.FancyBlocks;
import net.pantrymoth.fancyblocks.block.ModBlocks;

import java.awt.*;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FancyBlocks.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.GOLD_STONE_BRICKS);
        blockWithItem(ModBlocks.GOLD_CHISELED_STONE_BRICKS);
        stairsBlock(ModBlocks.GOLD_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GOLD_STONE_BRICKS.get()));
        blockItem(ModBlocks.GOLD_STONE_BRICK_STAIRS);
        wallBlock(ModBlocks.GOLD_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.GOLD_STONE_BRICKS.get()));

        blockWithItem(ModBlocks.GOLD_END_STONE_BRICKS);
        stairsBlock(ModBlocks.GOLD_END_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GOLD_END_STONE_BRICKS.get()));
        blockItem(ModBlocks.GOLD_END_STONE_BRICK_STAIRS);
        wallBlock(ModBlocks.GOLD_END_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.GOLD_END_STONE_BRICKS.get()));

        blockWithItem(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICKS);
        blockWithItem(ModBlocks.GOLD_CHISELED_POLISHED_BLACKSTONE);
        stairsBlock(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICKS.get()));
        blockItem(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICK_STAIRS);
        wallBlock(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICKS.get()));

        blockWithItem(ModBlocks.GOLD_DEEPSLATE_BRICKS);
        blockWithItem(ModBlocks.GOLD_CHISELED_DEEPSLATE);
        stairsBlock(ModBlocks.GOLD_DEEPSLATE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GOLD_DEEPSLATE_BRICKS.get()));
        blockItem(ModBlocks.GOLD_DEEPSLATE_BRICK_STAIRS);
        wallBlock(ModBlocks.GOLD_DEEPSLATE_BRICK_WALL.get(), blockTexture(ModBlocks.GOLD_DEEPSLATE_BRICKS.get()));

        blockWithItem(ModBlocks.GOLD_DEEPSLATE_TILES);
        stairsBlock(ModBlocks.GOLD_DEEPSLATE_TILE_STAIRS.get(), blockTexture(ModBlocks.GOLD_DEEPSLATE_TILES.get()));
        blockItem(ModBlocks.GOLD_DEEPSLATE_TILE_STAIRS);
        wallBlock(ModBlocks.GOLD_DEEPSLATE_TILE_WALL.get(), blockTexture(ModBlocks.GOLD_DEEPSLATE_TILES.get()));

        blockWithItem(ModBlocks.GOLD_QUARTZ_BRICKS);

        blockWithItem(ModBlocks.GOLD_TUFF_BRICKS);
        stairsBlock(ModBlocks.GOLD_TUFF_BRICK_STAIRS.get(), blockTexture(ModBlocks.GOLD_TUFF_BRICKS.get()));
        blockItem(ModBlocks.GOLD_TUFF_BRICK_STAIRS);
        wallBlock(ModBlocks.GOLD_TUFF_BRICK_WALL.get(), blockTexture(ModBlocks.GOLD_TUFF_BRICKS.get()));

        blockWithItem(ModBlocks.GOLD_NETHER_BRICKS);
        blockWithItem(ModBlocks.GOLD_CHISELED_NETHER_BRICKS);
        stairsBlock(ModBlocks.GOLD_NETHER_BRICK_STAIRS.get(), blockTexture(ModBlocks.GOLD_NETHER_BRICKS.get()));
        blockItem(ModBlocks.GOLD_NETHER_BRICK_STAIRS);
        wallBlock(ModBlocks.GOLD_NETHER_BRICK_WALL.get(), blockTexture(ModBlocks.GOLD_NETHER_BRICKS.get()));

        blockWithItem(ModBlocks.GOLD_PRISMARINE_BRICKS);
        stairsBlock(ModBlocks.GOLD_PRISMARINE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GOLD_PRISMARINE_BRICKS.get()));
        blockItem(ModBlocks.GOLD_PRISMARINE_BRICK_STAIRS);

        blockWithItem(ModBlocks.GOLD_PURPUR_BLOCK);
        stairsBlock(ModBlocks.GOLD_PURPUR_STAIRS.get(), blockTexture(ModBlocks.GOLD_PURPUR_BLOCK.get()));
        blockItem(ModBlocks.GOLD_PURPUR_STAIRS);

        blockWithItem(ModBlocks.DIAMOND_STONE_BRICKS);
        blockWithItem(ModBlocks.DIAMOND_CHISELED_STONE_BRICKS);
        stairsBlock(ModBlocks.DIAMOND_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DIAMOND_STONE_BRICKS.get()));
        blockItem(ModBlocks.DIAMOND_STONE_BRICK_STAIRS);
        wallBlock(ModBlocks.DIAMOND_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.DIAMOND_STONE_BRICKS.get()));

        blockWithItem(ModBlocks.DIAMOND_END_STONE_BRICKS);
        stairsBlock(ModBlocks.DIAMOND_END_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DIAMOND_END_STONE_BRICKS.get()));
        blockItem(ModBlocks.DIAMOND_END_STONE_BRICK_STAIRS);
        wallBlock(ModBlocks.DIAMOND_END_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.DIAMOND_END_STONE_BRICKS.get()));

        blockWithItem(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICKS);
        blockWithItem(ModBlocks.DIAMOND_CHISELED_POLISHED_BLACKSTONE);
        stairsBlock(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICKS.get()));
        blockItem(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICK_STAIRS);
        wallBlock(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICKS.get()));

        blockWithItem(ModBlocks.DIAMOND_DEEPSLATE_BRICKS);
        blockWithItem(ModBlocks.DIAMOND_CHISELED_DEEPSLATE);
        stairsBlock(ModBlocks.DIAMOND_DEEPSLATE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DIAMOND_DEEPSLATE_BRICKS.get()));
        blockItem(ModBlocks.DIAMOND_DEEPSLATE_BRICK_STAIRS);
        wallBlock(ModBlocks.DIAMOND_DEEPSLATE_BRICK_WALL.get(), blockTexture(ModBlocks.DIAMOND_DEEPSLATE_BRICKS.get()));

        blockWithItem(ModBlocks.DIAMOND_DEEPSLATE_TILES);
        stairsBlock(ModBlocks.DIAMOND_DEEPSLATE_TILE_STAIRS.get(), blockTexture(ModBlocks.DIAMOND_DEEPSLATE_TILES.get()));
        blockItem(ModBlocks.DIAMOND_DEEPSLATE_TILE_STAIRS);
        wallBlock(ModBlocks.DIAMOND_DEEPSLATE_TILE_WALL.get(), blockTexture(ModBlocks.DIAMOND_DEEPSLATE_TILES.get()));

        blockWithItem(ModBlocks.DIAMOND_QUARTZ_BRICKS);

        blockWithItem(ModBlocks.DIAMOND_TUFF_BRICKS);
        stairsBlock(ModBlocks.DIAMOND_TUFF_BRICK_STAIRS.get(), blockTexture(ModBlocks.DIAMOND_TUFF_BRICKS.get()));
        blockItem(ModBlocks.DIAMOND_TUFF_BRICK_STAIRS);
        wallBlock(ModBlocks.DIAMOND_TUFF_BRICK_WALL.get(), blockTexture(ModBlocks.DIAMOND_TUFF_BRICKS.get()));

        blockWithItem(ModBlocks.DIAMOND_NETHER_BRICKS);
        blockWithItem(ModBlocks.DIAMOND_CHISELED_NETHER_BRICKS);
        stairsBlock(ModBlocks.DIAMOND_NETHER_BRICK_STAIRS.get(), blockTexture(ModBlocks.DIAMOND_NETHER_BRICKS.get()));
        blockItem(ModBlocks.DIAMOND_NETHER_BRICK_STAIRS);
        wallBlock(ModBlocks.DIAMOND_NETHER_BRICK_WALL.get(), blockTexture(ModBlocks.DIAMOND_NETHER_BRICKS.get()));

        blockWithItem(ModBlocks.DIAMOND_PRISMARINE_BRICKS);
        stairsBlock(ModBlocks.DIAMOND_PRISMARINE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DIAMOND_PRISMARINE_BRICKS.get()));
        blockItem(ModBlocks.DIAMOND_PRISMARINE_BRICK_STAIRS);

        blockWithItem(ModBlocks.DIAMOND_PURPUR_BLOCK);
        stairsBlock(ModBlocks.DIAMOND_PURPUR_STAIRS.get(), blockTexture(ModBlocks.DIAMOND_PURPUR_BLOCK.get()));
        blockItem(ModBlocks.DIAMOND_PURPUR_STAIRS);

        blockWithItem(ModBlocks.EMERALD_STONE_BRICKS);
        blockWithItem(ModBlocks.EMERALD_CHISELED_STONE_BRICKS);
        stairsBlock(ModBlocks.EMERALD_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.EMERALD_STONE_BRICKS.get()));
        blockItem(ModBlocks.EMERALD_STONE_BRICK_STAIRS);
        wallBlock(ModBlocks.EMERALD_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.EMERALD_STONE_BRICKS.get()));

        blockWithItem(ModBlocks.EMERALD_END_STONE_BRICKS);
        stairsBlock(ModBlocks.EMERALD_END_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.EMERALD_END_STONE_BRICKS.get()));
        blockItem(ModBlocks.EMERALD_END_STONE_BRICK_STAIRS);
        wallBlock(ModBlocks.EMERALD_END_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.EMERALD_END_STONE_BRICKS.get()));

        blockWithItem(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICKS);
        blockWithItem(ModBlocks.EMERALD_CHISELED_POLISHED_BLACKSTONE);
        stairsBlock(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICKS.get()));
        blockItem(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICK_STAIRS);
        wallBlock(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICKS.get()));

        blockWithItem(ModBlocks.EMERALD_DEEPSLATE_BRICKS);
        blockWithItem(ModBlocks.EMERALD_CHISELED_DEEPSLATE);
        stairsBlock(ModBlocks.EMERALD_DEEPSLATE_BRICK_STAIRS.get(), blockTexture(ModBlocks.EMERALD_DEEPSLATE_BRICKS.get()));
        blockItem(ModBlocks.EMERALD_DEEPSLATE_BRICK_STAIRS);
        wallBlock(ModBlocks.EMERALD_DEEPSLATE_BRICK_WALL.get(), blockTexture(ModBlocks.EMERALD_DEEPSLATE_BRICKS.get()));

        blockWithItem(ModBlocks.EMERALD_DEEPSLATE_TILES);
        stairsBlock(ModBlocks.EMERALD_DEEPSLATE_TILE_STAIRS.get(), blockTexture(ModBlocks.EMERALD_DEEPSLATE_TILES.get()));
        blockItem(ModBlocks.EMERALD_DEEPSLATE_TILE_STAIRS);
        wallBlock(ModBlocks.EMERALD_DEEPSLATE_TILE_WALL.get(), blockTexture(ModBlocks.EMERALD_DEEPSLATE_TILES.get()));

        blockWithItem(ModBlocks.EMERALD_QUARTZ_BRICKS);

        blockWithItem(ModBlocks.EMERALD_TUFF_BRICKS);
        stairsBlock(ModBlocks.EMERALD_TUFF_BRICK_STAIRS.get(), blockTexture(ModBlocks.EMERALD_TUFF_BRICKS.get()));
        blockItem(ModBlocks.EMERALD_TUFF_BRICK_STAIRS);
        wallBlock(ModBlocks.EMERALD_TUFF_BRICK_WALL.get(), blockTexture(ModBlocks.EMERALD_TUFF_BRICKS.get()));

        blockWithItem(ModBlocks.EMERALD_NETHER_BRICKS);
        blockWithItem(ModBlocks.EMERALD_CHISELED_NETHER_BRICKS);
        stairsBlock(ModBlocks.EMERALD_NETHER_BRICK_STAIRS.get(), blockTexture(ModBlocks.EMERALD_NETHER_BRICKS.get()));
        blockItem(ModBlocks.EMERALD_NETHER_BRICK_STAIRS);
        wallBlock(ModBlocks.EMERALD_NETHER_BRICK_WALL.get(), blockTexture(ModBlocks.EMERALD_NETHER_BRICKS.get()));

        blockWithItem(ModBlocks.EMERALD_PRISMARINE_BRICKS);
        stairsBlock(ModBlocks.EMERALD_PRISMARINE_BRICK_STAIRS.get(), blockTexture(ModBlocks.EMERALD_PRISMARINE_BRICKS.get()));
        blockItem(ModBlocks.EMERALD_PRISMARINE_BRICK_STAIRS);

        blockWithItem(ModBlocks.EMERALD_PURPUR_BLOCK);
        stairsBlock(ModBlocks.EMERALD_PURPUR_STAIRS.get(), blockTexture(ModBlocks.EMERALD_PURPUR_BLOCK.get()));
        blockItem(ModBlocks.EMERALD_PURPUR_STAIRS);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }


    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("fancyblocks:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("fancyblocks:block/" + deferredBlock.getId().getPath() + appendix));
    }
}