package net.pantrymoth.fancyblocks;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.pantrymoth.fancyblocks.block.ModBlocks;
import net.pantrymoth.fancyblocks.event.ModEvents;
import net.pantrymoth.fancyblocks.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(FancyBlocks.MODID)
public class FancyBlocks {
    public static final String MODID = "fancyblocks";
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public FancyBlocks(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);


        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.GOLD_STONE_BRICKS);
            event.accept(ModBlocks.GOLD_POLISHED_BLACKSTONE_BRICKS);
            event.accept(ModBlocks.GOLD_END_STONE_BRICKS);
            event.accept(ModBlocks.GOLD_DEEPSLATE_BRICKS);
            event.accept(ModBlocks.GOLD_DEEPSLATE_TILES);
            event.accept(ModBlocks.GOLD_TUFF_BRICKS);
            event.accept(ModBlocks.GOLD_QUARTZ_BRICKS);
            event.accept(ModBlocks.GOLD_NETHER_BRICKS);
            event.accept(ModBlocks.GOLD_PRISMARINE_BRICKS);
            event.accept(ModBlocks.GOLD_STONE_BRICK_STAIRS);
            event.accept(ModBlocks.GOLD_STONE_BRICK_WALL);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
