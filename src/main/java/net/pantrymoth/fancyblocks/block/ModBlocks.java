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

    public static final DeferredBlock<Block> GOLD_END_STONE_BRICKS = registerBlock("gold_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));

    public static final DeferredBlock<Block> GOLD_DEEPSLATE_BRICKS = registerBlock("gold_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));

    public static final DeferredBlock<Block> GOLD_DEEPSLATE_TILES = registerBlock("gold_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GOLD_TUFF_BRICKS = registerBlock("gold_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)));

    public static final DeferredBlock<Block> GOLD_QUARTZ_BRICKS = registerBlock("gold_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)));

    public static final DeferredBlock<Block> GOLD_PRISMARINE_BRICKS = registerBlock("gold_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));

    public static final DeferredBlock<Block> GOLD_NETHER_BRICKS = registerBlock("gold_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)));





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