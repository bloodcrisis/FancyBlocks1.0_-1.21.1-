package net.pantrymoth.fancyblocks.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.pantrymoth.fancyblocks.FancyBlocks;
import net.pantrymoth.fancyblocks.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FancyBlocks.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.GOLD_STONE_BRICKS);
        stairsBlock(ModBlocks.GOLD_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GOLD_STONE_BRICKS.get()));
        blockItem(ModBlocks.GOLD_STONE_BRICK_STAIRS);
        wallBlock(ModBlocks.GOLD_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.GOLD_STONE_BRICKS.get()));

        blockWithItem(ModBlocks.GOLD_END_STONE_BRICKS);
        blockWithItem(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICKS);
        blockWithItem(ModBlocks.GOLD_DEEPSLATE_BRICKS);
        blockWithItem(ModBlocks.GOLD_DEEPSLATE_TILES);
        blockWithItem(ModBlocks.GOLD_QUARTZ_BRICKS);
        blockWithItem(ModBlocks.GOLD_TUFF_BRICKS);
        blockWithItem(ModBlocks.GOLD_NETHER_BRICKS);
        blockWithItem(ModBlocks.GOLD_PRISMARINE_BRICKS);
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