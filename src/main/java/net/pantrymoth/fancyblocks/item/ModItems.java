package net.pantrymoth.fancyblocks.item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pantrymoth.fancyblocks.FancyBlocks;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FancyBlocks.MODID);

    

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}