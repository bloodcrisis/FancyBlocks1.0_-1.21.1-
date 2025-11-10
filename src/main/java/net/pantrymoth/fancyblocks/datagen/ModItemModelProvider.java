package net.pantrymoth.fancyblocks.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.pantrymoth.fancyblocks.FancyBlocks;
import net.pantrymoth.fancyblocks.block.ModBlocks;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FancyBlocks.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        wallItem(ModBlocks.GOLD_STONE_BRICK_WALL, ModBlocks.GOLD_STONE_BRICKS);
        wallItem(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICK_WALL, ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICKS);
        wallItem(ModBlocks.GOLD_DEEPSLATE_BRICK_WALL, ModBlocks.GOLD_DEEPSLATE_BRICKS);
        wallItem(ModBlocks.GOLD_DEEPSLATE_TILE_WALL, ModBlocks.GOLD_DEEPSLATE_TILES);
        wallItem(ModBlocks.GOLD_NETHER_BRICK_WALL, ModBlocks.GOLD_NETHER_BRICKS);
        wallItem(ModBlocks.GOLD_TUFF_BRICK_WALL, ModBlocks.GOLD_TUFF_BRICKS);
        wallItem(ModBlocks.GOLD_END_STONE_BRICK_WALL, ModBlocks.GOLD_END_STONE_BRICKS);
        
        wallItem(ModBlocks.EMERALD_STONE_BRICK_WALL, ModBlocks.EMERALD_STONE_BRICKS);
        wallItem(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICK_WALL, ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICKS);
        wallItem(ModBlocks.EMERALD_DEEPSLATE_BRICK_WALL, ModBlocks.EMERALD_DEEPSLATE_BRICKS);
        wallItem(ModBlocks.EMERALD_DEEPSLATE_TILE_WALL, ModBlocks.EMERALD_DEEPSLATE_TILES);
        wallItem(ModBlocks.EMERALD_NETHER_BRICK_WALL, ModBlocks.EMERALD_NETHER_BRICKS);
        wallItem(ModBlocks.EMERALD_TUFF_BRICK_WALL, ModBlocks.EMERALD_TUFF_BRICKS);
        wallItem(ModBlocks.EMERALD_END_STONE_BRICK_WALL, ModBlocks.EMERALD_END_STONE_BRICKS);
        
        wallItem(ModBlocks.DIAMOND_STONE_BRICK_WALL, ModBlocks.DIAMOND_STONE_BRICKS);
        wallItem(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICK_WALL, ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICKS);
        wallItem(ModBlocks.DIAMOND_DEEPSLATE_BRICK_WALL, ModBlocks.DIAMOND_DEEPSLATE_BRICKS);
        wallItem(ModBlocks.DIAMOND_DEEPSLATE_TILE_WALL, ModBlocks.DIAMOND_DEEPSLATE_TILES);
        wallItem(ModBlocks.DIAMOND_NETHER_BRICK_WALL, ModBlocks.DIAMOND_NETHER_BRICKS);
        wallItem(ModBlocks.DIAMOND_TUFF_BRICK_WALL, ModBlocks.DIAMOND_TUFF_BRICKS);
        wallItem(ModBlocks.DIAMOND_END_STONE_BRICK_WALL, ModBlocks.DIAMOND_END_STONE_BRICKS);
    }


    public  void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(FancyBlocks.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
