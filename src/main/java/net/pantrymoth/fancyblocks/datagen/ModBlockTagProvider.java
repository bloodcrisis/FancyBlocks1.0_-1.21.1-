package net.pantrymoth.fancyblocks.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.pantrymoth.fancyblocks.FancyBlocks;
import net.pantrymoth.fancyblocks.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FancyBlocks.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.GOLD_STONE_BRICKS.get())
                .add(ModBlocks.GOLD_CHISELED_STONE_BRICKS.get())
                .add(ModBlocks.GOLD_END_STONE_BRICKS.get())
                .add(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICKS.get())
                .add(ModBlocks.GOLD_CHISELED_POLISHED_BLACKSTONE.get())
                .add(ModBlocks.GOLD_PRISMARINE_BRICKS.get())
                .add(ModBlocks.GOLD_QUARTZ_BRICKS.get())
                .add(ModBlocks.GOLD_CHISELED_QUARTZ.get())
                .add(ModBlocks.GOLD_DEEPSLATE_BRICKS.get())
                .add(ModBlocks.GOLD_CHISELED_DEEPSLATE.get())
                .add(ModBlocks.GOLD_DEEPSLATE_TILES.get())
                .add(ModBlocks.GOLD_TUFF_BRICKS.get())
                .add(ModBlocks.GOLD_CHISELED_TUFF.get())
                .add(ModBlocks.GOLD_CHISELED_TUFF_BRICKS.get())
                .add(ModBlocks.GOLD_NETHER_BRICKS.get())
                .add(ModBlocks.GOLD_CHISELED_NETHER_BRICKS.get())
                .add(ModBlocks.GOLD_PURPUR_BLOCK.get())
                .add(ModBlocks.GOLD_CHISELED_SANDSTONE.get())
                .add(ModBlocks.GOLD_CHISELED_RED_SANDSTONE.get())

                .add(ModBlocks.GOLD_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_DEEPSLATE_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_DEEPSLATE_TILE_STAIRS.get())
                .add(ModBlocks.GOLD_END_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_TUFF_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_PRISMARINE_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_NETHER_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_PURPUR_STAIRS.get())

                .add(ModBlocks.GOLD_STONE_BRICK_WALL.get())
                .add(ModBlocks.GOLD_DEEPSLATE_BRICK_WALL.get())
                .add(ModBlocks.GOLD_DEEPSLATE_TILE_WALL.get())
                .add(ModBlocks.GOLD_END_STONE_BRICK_WALL.get())
                .add(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICK_WALL.get())
                .add(ModBlocks.GOLD_TUFF_BRICK_WALL.get())
                .add(ModBlocks.GOLD_NETHER_BRICK_WALL.get())


                .add(ModBlocks.DIAMOND_STONE_BRICKS.get())
                .add(ModBlocks.DIAMOND_CHISELED_STONE_BRICKS.get())
                .add(ModBlocks.DIAMOND_END_STONE_BRICKS.get())
                .add(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICKS.get())
                .add(ModBlocks.DIAMOND_CHISELED_POLISHED_BLACKSTONE.get())
                .add(ModBlocks.DIAMOND_PRISMARINE_BRICKS.get())
                .add(ModBlocks.DIAMOND_QUARTZ_BRICKS.get())
                .add(ModBlocks.DIAMOND_CHISELED_QUARTZ.get())
                .add(ModBlocks.DIAMOND_DEEPSLATE_BRICKS.get())
                .add(ModBlocks.DIAMOND_CHISELED_DEEPSLATE.get())
                .add(ModBlocks.DIAMOND_DEEPSLATE_TILES.get())
                .add(ModBlocks.DIAMOND_TUFF_BRICKS.get())
                .add(ModBlocks.DIAMOND_CHISELED_TUFF.get())
                .add(ModBlocks.DIAMOND_CHISELED_TUFF_BRICKS.get())
                .add(ModBlocks.DIAMOND_NETHER_BRICKS.get())
                .add(ModBlocks.DIAMOND_CHISELED_NETHER_BRICKS.get())
                .add(ModBlocks.DIAMOND_PURPUR_BLOCK.get())
                .add(ModBlocks.DIAMOND_CHISELED_SANDSTONE.get())
                .add(ModBlocks.DIAMOND_CHISELED_RED_SANDSTONE.get())

                .add(ModBlocks.DIAMOND_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_DEEPSLATE_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_DEEPSLATE_TILE_STAIRS.get())
                .add(ModBlocks.DIAMOND_END_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_TUFF_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_PRISMARINE_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_NETHER_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_PURPUR_STAIRS.get())

                .add(ModBlocks.DIAMOND_STONE_BRICK_WALL.get())
                .add(ModBlocks.DIAMOND_DEEPSLATE_BRICK_WALL.get())
                .add(ModBlocks.DIAMOND_DEEPSLATE_TILE_WALL.get())
                .add(ModBlocks.DIAMOND_END_STONE_BRICK_WALL.get())
                .add(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICK_WALL.get())
                .add(ModBlocks.DIAMOND_TUFF_BRICK_WALL.get())
                .add(ModBlocks.DIAMOND_NETHER_BRICK_WALL.get())




                .add(ModBlocks.EMERALD_STONE_BRICKS.get())
                .add(ModBlocks.EMERALD_CHISELED_STONE_BRICKS.get())
                .add(ModBlocks.EMERALD_END_STONE_BRICKS.get())
                .add(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICKS.get())
                .add(ModBlocks.EMERALD_CHISELED_POLISHED_BLACKSTONE.get())
                .add(ModBlocks.EMERALD_PRISMARINE_BRICKS.get())
                .add(ModBlocks.EMERALD_QUARTZ_BRICKS.get())
                .add(ModBlocks.EMERALD_CHISELED_QUARTZ.get())
                .add(ModBlocks.EMERALD_DEEPSLATE_BRICKS.get())
                .add(ModBlocks.EMERALD_CHISELED_DEEPSLATE.get())
                .add(ModBlocks.EMERALD_DEEPSLATE_TILES.get())
                .add(ModBlocks.EMERALD_TUFF_BRICKS.get())
                .add(ModBlocks.EMERALD_CHISELED_TUFF.get())
                .add(ModBlocks.EMERALD_CHISELED_TUFF_BRICKS.get())
                .add(ModBlocks.EMERALD_CHISELED_NETHER_BRICKS.get())
                .add(ModBlocks.EMERALD_NETHER_BRICKS.get())
                .add(ModBlocks.EMERALD_PURPUR_BLOCK.get())
                .add(ModBlocks.EMERALD_CHISELED_SANDSTONE.get())
                .add(ModBlocks.EMERALD_CHISELED_RED_SANDSTONE.get())

                .add(ModBlocks.EMERALD_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_DEEPSLATE_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_DEEPSLATE_TILE_STAIRS.get())
                .add(ModBlocks.EMERALD_END_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_TUFF_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_PRISMARINE_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_NETHER_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_PURPUR_STAIRS.get())

                .add(ModBlocks.EMERALD_STONE_BRICK_WALL.get())
                .add(ModBlocks.EMERALD_DEEPSLATE_BRICK_WALL.get())
                .add(ModBlocks.EMERALD_DEEPSLATE_TILE_WALL.get())
                .add(ModBlocks.EMERALD_END_STONE_BRICK_WALL.get())
                .add(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICK_WALL.get())
                .add(ModBlocks.EMERALD_TUFF_BRICK_WALL.get())
                .add(ModBlocks.EMERALD_NETHER_BRICK_WALL.get());



                
        
        

        tag(BlockTags.STAIRS)
                .add(ModBlocks.GOLD_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_DEEPSLATE_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_DEEPSLATE_TILE_STAIRS.get())
                .add(ModBlocks.GOLD_END_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_TUFF_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_PRISMARINE_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_NETHER_BRICK_STAIRS.get())
                .add(ModBlocks.GOLD_PURPUR_STAIRS.get())

                .add(ModBlocks.EMERALD_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_DEEPSLATE_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_DEEPSLATE_TILE_STAIRS.get())
                .add(ModBlocks.EMERALD_END_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_TUFF_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_PRISMARINE_BRICK_STAIRS.get())
                .add(ModBlocks.EMERALD_NETHER_BRICK_STAIRS.get())
        
                .add(ModBlocks.DIAMOND_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_DEEPSLATE_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_DEEPSLATE_TILE_STAIRS.get())
                .add(ModBlocks.DIAMOND_END_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_TUFF_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_PRISMARINE_BRICK_STAIRS.get())
                .add(ModBlocks.DIAMOND_NETHER_BRICK_STAIRS.get());

        tag(BlockTags.WALLS)
                .add(ModBlocks.GOLD_STONE_BRICK_WALL.get())
                .add(ModBlocks.GOLD_DEEPSLATE_BRICK_WALL.get())
                .add(ModBlocks.GOLD_DEEPSLATE_TILE_WALL.get())
                .add(ModBlocks.GOLD_END_STONE_BRICK_WALL.get())
                .add(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICK_WALL.get())
                .add(ModBlocks.GOLD_TUFF_BRICK_WALL.get())
                .add(ModBlocks.GOLD_NETHER_BRICK_WALL.get())
                
                .add(ModBlocks.EMERALD_STONE_BRICK_WALL.get())
                .add(ModBlocks.EMERALD_DEEPSLATE_BRICK_WALL.get())
                .add(ModBlocks.EMERALD_DEEPSLATE_TILE_WALL.get())
                .add(ModBlocks.EMERALD_END_STONE_BRICK_WALL.get())
                .add(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICK_WALL.get())
                .add(ModBlocks.EMERALD_TUFF_BRICK_WALL.get())
                .add(ModBlocks.EMERALD_NETHER_BRICK_WALL.get())
                
                .add(ModBlocks.DIAMOND_STONE_BRICK_WALL.get())
                .add(ModBlocks.DIAMOND_DEEPSLATE_BRICK_WALL.get())
                .add(ModBlocks.DIAMOND_DEEPSLATE_TILE_WALL.get())
                .add(ModBlocks.DIAMOND_END_STONE_BRICK_WALL.get())
                .add(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICK_WALL.get())
                .add(ModBlocks.DIAMOND_TUFF_BRICK_WALL.get())
                .add(ModBlocks.DIAMOND_NETHER_BRICK_WALL.get());

    }
}
