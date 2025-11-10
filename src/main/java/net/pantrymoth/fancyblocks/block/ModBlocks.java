package net.pantrymoth.fancyblocks.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pantrymoth.fancyblocks.FancyBlocks;
import net.pantrymoth.fancyblocks.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(FancyBlocks.MODID);

    public static final DeferredBlock<Block> GOLD_STONE_BRICKS = registerBlock("gold_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    
    public static final DeferredBlock<StairBlock> GOLD_STONE_BRICK_STAIRS = registerBlock("gold_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.GOLD_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    
    public static final DeferredBlock<WallBlock> GOLD_STONE_BRICK_WALL = registerBlock("gold_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    

    public static final DeferredBlock<Block> GOLD_POLISHED_BLACKSTONE_BRICKS = registerBlock("gold_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    
    public static final DeferredBlock<StairBlock> GOLD_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("gold_polished_blackstone_brick_stairs",
            () -> new StairBlock(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)));
    
    public static final DeferredBlock<WallBlock> GOLD_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("gold_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICK_WALL)));
    
    

    public static final DeferredBlock<Block> GOLD_END_STONE_BRICKS = registerBlock("gold_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    
    public static final DeferredBlock<StairBlock> GOLD_END_STONE_BRICK_STAIRS = registerBlock("gold_end_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.GOLD_END_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    
    public static final DeferredBlock<WallBlock> GOLD_END_STONE_BRICK_WALL = registerBlock("gold_end_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICK_WALL)));

    
    
    public static final DeferredBlock<Block> GOLD_DEEPSLATE_BRICKS = registerBlock("gold_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));
    
    public static final DeferredBlock<StairBlock> GOLD_DEEPSLATE_BRICK_STAIRS = registerBlock("gold_deepslate_brick_stairs",
            () -> new StairBlock(ModBlocks.GOLD_DEEPSLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));
    
    public static final DeferredBlock<WallBlock> GOLD_DEEPSLATE_BRICK_WALL = registerBlock("gold_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICK_WALL)));

    
    
    public static final DeferredBlock<Block> GOLD_DEEPSLATE_TILES = registerBlock("gold_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> GOLD_DEEPSLATE_TILE_STAIRS = registerBlock("gold_deepslate_tile_stairs",
            () -> new StairBlock(ModBlocks.GOLD_DEEPSLATE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)));

    public static final DeferredBlock<WallBlock> GOLD_DEEPSLATE_TILE_WALL = registerBlock("gold_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILE_WALL)));


    public static final DeferredBlock<Block> GOLD_TUFF_BRICKS = registerBlock("gold_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)));

    public static final DeferredBlock<StairBlock> GOLD_TUFF_BRICK_STAIRS = registerBlock("gold_tuff_brick_stairs",
            () -> new StairBlock(ModBlocks.GOLD_TUFF_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)));

    public static final DeferredBlock<WallBlock> GOLD_TUFF_BRICK_WALL = registerBlock("gold_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICK_WALL)));

    

    public static final DeferredBlock<Block> GOLD_QUARTZ_BRICKS = registerBlock("gold_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)));
    
    

    public static final DeferredBlock<Block> GOLD_PRISMARINE_BRICKS = registerBlock("gold_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));

    public static final DeferredBlock<StairBlock> GOLD_PRISMARINE_BRICK_STAIRS = registerBlock("gold_prismarine_brick_stairs",
            () -> new StairBlock(ModBlocks.GOLD_PRISMARINE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));



    public static final DeferredBlock<Block> GOLD_NETHER_BRICKS = registerBlock("gold_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));

    public static final DeferredBlock<StairBlock> GOLD_NETHER_BRICK_STAIRS = registerBlock("gold_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.GOLD_NETHER_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));

    public static final DeferredBlock<WallBlock> GOLD_NETHER_BRICK_WALL = registerBlock("gold_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_WALL)));



    public static final DeferredBlock<Block> EMERALD_STONE_BRICKS = registerBlock("emerald_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    
    public static final DeferredBlock<StairBlock> EMERALD_STONE_BRICK_STAIRS = registerBlock("emerald_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.EMERALD_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    
    public static final DeferredBlock<WallBlock> EMERALD_STONE_BRICK_WALL = registerBlock("emerald_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    

    public static final DeferredBlock<Block> EMERALD_POLISHED_BLACKSTONE_BRICKS = registerBlock("emerald_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    
    public static final DeferredBlock<StairBlock> EMERALD_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("emerald_polished_blackstone_brick_stairs",
            () -> new StairBlock(ModBlocks.EMERALD_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)));
    
    public static final DeferredBlock<WallBlock> EMERALD_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("emerald_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICK_WALL)));
    
    

    public static final DeferredBlock<Block> EMERALD_END_STONE_BRICKS = registerBlock("emerald_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    
    public static final DeferredBlock<StairBlock> EMERALD_END_STONE_BRICK_STAIRS = registerBlock("emerald_end_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.EMERALD_END_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    
    public static final DeferredBlock<WallBlock> EMERALD_END_STONE_BRICK_WALL = registerBlock("emerald_end_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICK_WALL)));

    
    
    public static final DeferredBlock<Block> EMERALD_DEEPSLATE_BRICKS = registerBlock("emerald_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));
    
    public static final DeferredBlock<StairBlock> EMERALD_DEEPSLATE_BRICK_STAIRS = registerBlock("emerald_deepslate_brick_stairs",
            () -> new StairBlock(ModBlocks.EMERALD_DEEPSLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));
    
    public static final DeferredBlock<WallBlock> EMERALD_DEEPSLATE_BRICK_WALL = registerBlock("emerald_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICK_WALL)));

    
    
    public static final DeferredBlock<Block> EMERALD_DEEPSLATE_TILES = registerBlock("emerald_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> EMERALD_DEEPSLATE_TILE_STAIRS = registerBlock("emerald_deepslate_tile_stairs",
            () -> new StairBlock(ModBlocks.EMERALD_DEEPSLATE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)));

    public static final DeferredBlock<WallBlock> EMERALD_DEEPSLATE_TILE_WALL = registerBlock("emerald_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILE_WALL)));


    public static final DeferredBlock<Block> EMERALD_TUFF_BRICKS = registerBlock("emerald_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)));

    public static final DeferredBlock<StairBlock> EMERALD_TUFF_BRICK_STAIRS = registerBlock("emerald_tuff_brick_stairs",
            () -> new StairBlock(ModBlocks.EMERALD_TUFF_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)));

    public static final DeferredBlock<WallBlock> EMERALD_TUFF_BRICK_WALL = registerBlock("emerald_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICK_WALL)));

    

    public static final DeferredBlock<Block> EMERALD_QUARTZ_BRICKS = registerBlock("emerald_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)));
    
    

    public static final DeferredBlock<Block> EMERALD_PRISMARINE_BRICKS = registerBlock("emerald_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));

    public static final DeferredBlock<StairBlock> EMERALD_PRISMARINE_BRICK_STAIRS = registerBlock("emerald_prismarine_brick_stairs",
            () -> new StairBlock(ModBlocks.EMERALD_PRISMARINE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));


    
    public static final DeferredBlock<Block> EMERALD_NETHER_BRICKS = registerBlock("emerald_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));

    public static final DeferredBlock<StairBlock> EMERALD_NETHER_BRICK_STAIRS = registerBlock("emerald_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.EMERALD_NETHER_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));

    public static final DeferredBlock<WallBlock> EMERALD_NETHER_BRICK_WALL = registerBlock("emerald_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_WALL)));

    //DIAMOND

    public static final DeferredBlock<Block> DIAMOND_STONE_BRICKS = registerBlock("diamond_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    
    public static final DeferredBlock<StairBlock> DIAMOND_STONE_BRICK_STAIRS = registerBlock("diamond_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.DIAMOND_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    
    public static final DeferredBlock<WallBlock> DIAMOND_STONE_BRICK_WALL = registerBlock("diamond_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    

    public static final DeferredBlock<Block> DIAMOND_POLISHED_BLACKSTONE_BRICKS = registerBlock("diamond_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    
    public static final DeferredBlock<StairBlock> DIAMOND_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("diamond_polished_blackstone_brick_stairs",
            () -> new StairBlock(ModBlocks.DIAMOND_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)));
    
    public static final DeferredBlock<WallBlock> DIAMOND_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("diamond_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICK_WALL)));
    
    

    public static final DeferredBlock<Block> DIAMOND_END_STONE_BRICKS = registerBlock("diamond_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    
    public static final DeferredBlock<StairBlock> DIAMOND_END_STONE_BRICK_STAIRS = registerBlock("diamond_end_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.DIAMOND_END_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    
    public static final DeferredBlock<WallBlock> DIAMOND_END_STONE_BRICK_WALL = registerBlock("diamond_end_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICK_WALL)));

    
    
    public static final DeferredBlock<Block> DIAMOND_DEEPSLATE_BRICKS = registerBlock("diamond_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));
    
    public static final DeferredBlock<StairBlock> DIAMOND_DEEPSLATE_BRICK_STAIRS = registerBlock("diamond_deepslate_brick_stairs",
            () -> new StairBlock(ModBlocks.DIAMOND_DEEPSLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));
    
    public static final DeferredBlock<WallBlock> DIAMOND_DEEPSLATE_BRICK_WALL = registerBlock("diamond_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICK_WALL)));

    
    
    public static final DeferredBlock<Block> DIAMOND_DEEPSLATE_TILES = registerBlock("diamond_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DIAMOND_DEEPSLATE_TILE_STAIRS = registerBlock("diamond_deepslate_tile_stairs",
            () -> new StairBlock(ModBlocks.DIAMOND_DEEPSLATE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)));

    public static final DeferredBlock<WallBlock> DIAMOND_DEEPSLATE_TILE_WALL = registerBlock("diamond_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILE_WALL)));


    public static final DeferredBlock<Block> DIAMOND_TUFF_BRICKS = registerBlock("diamond_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)));

    public static final DeferredBlock<StairBlock> DIAMOND_TUFF_BRICK_STAIRS = registerBlock("diamond_tuff_brick_stairs",
            () -> new StairBlock(ModBlocks.DIAMOND_TUFF_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)));

    public static final DeferredBlock<WallBlock> DIAMOND_TUFF_BRICK_WALL = registerBlock("diamond_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICK_WALL)));

    

    public static final DeferredBlock<Block> DIAMOND_QUARTZ_BRICKS = registerBlock("diamond_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)));
    
    

    public static final DeferredBlock<Block> DIAMOND_PRISMARINE_BRICKS = registerBlock("diamond_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));

    public static final DeferredBlock<StairBlock> DIAMOND_PRISMARINE_BRICK_STAIRS = registerBlock("diamond_prismarine_brick_stairs",
            () -> new StairBlock(ModBlocks.DIAMOND_PRISMARINE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));


    
    public static final DeferredBlock<Block> DIAMOND_NETHER_BRICKS = registerBlock("diamond_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));

    public static final DeferredBlock<StairBlock> DIAMOND_NETHER_BRICK_STAIRS = registerBlock("diamond_nether_brick_stairs",
            () -> new StairBlock(ModBlocks.DIAMOND_NETHER_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));

    public static final DeferredBlock<WallBlock> DIAMOND_NETHER_BRICK_WALL = registerBlock("diamond_nether_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_WALL)));





    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);
    }
}