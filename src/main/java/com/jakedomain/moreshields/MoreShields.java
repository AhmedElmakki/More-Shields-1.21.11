package com.jakedomain.moreshields; // Make sure this matches your actual package!

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
import org.slf4j.Logger;



@Mod(MoreShields.MODID)
public class MoreShields {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "moreshields";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public MoreShields(IEventBus modEventBus, ModContainer modContainer) {
        // 1. Ignite your custom items registry!
        ModItems.ITEMS.register(modEventBus);

        // Placeholder: Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Listen for the Creative Tab event so we can put your shield in the menu
        modEventBus.addListener(this::addCreative);

        // Placeholder: Register ourselves for server and other game events
        NeoForge.EVENT_BUS.register(this);

        // Placeholder: Register config (Assuming you kept the Config class from the template)
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Placeholder for future setup code
        LOGGER.info("More Shields common setup is running!");
    }

    // Add your custom items to the vanilla creative tabs
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Check if the current tab loading is the Combat tab
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            // Add our Diamond Shield to the tab!
            event.accept(ModItems.NETHERITE_SHIELD);
            event.accept(ModItems.DIAMOND_SHIELD);
            event.accept(ModItems.GOLD_SHIELD);
            event.accept(ModItems.IRON_SHIELD);
            event.accept(ModItems.COPPER_SHIELD);
        }
    }

    // Placeholder: Let the Event Bus discover methods to call on server start
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("More Shields says hello from the server!");
    }
}