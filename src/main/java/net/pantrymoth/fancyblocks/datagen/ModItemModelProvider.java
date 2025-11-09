package net.pantrymoth.fancyblocks.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.pantrymoth.fancyblocks.FancyBlocks;
import net.pantrymoth.fancyblocks.block.ModBlocks;
import net.pantrymoth.fancyblocks.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, FancyBlocks.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        wallItem(ModBlocks.GOLD_STONE_BRICK_WALL, ModBlocks.GOLD_STONE_BRICKS);
    }


    public  void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(FancyBlocks.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
