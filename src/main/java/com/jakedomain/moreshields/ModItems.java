package com.jakedomain.moreshields;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("moreshields");

    public static final DeferredItem<ShieldItem> NETHERITE_SHIELD = ITEMS.registerItem(
            "netherite_shield",
            ShieldItem::new,
            props -> props.durability(828)
                    .fireResistant()
                    .component(ModDataComponents.WOOD_TYPE.get(), "oak")

    );

    public static final DeferredItem<ShieldItem> DIAMOND_SHIELD = ITEMS.registerItem(
            "diamond_shield",
            ShieldItem::new,
            props -> props.durability(739)
                    .component(ModDataComponents.WOOD_TYPE.get(), "oak")
    );

    public static final DeferredItem<ShieldItem> GOLD_SHIELD = ITEMS.registerItem(
            "gold_shield",
            ShieldItem::new,
            props -> props.durability(156)
                    .component(ModDataComponents.WOOD_TYPE.get(), "oak")
    );

    public static final DeferredItem<ShieldItem> IRON_SHIELD = ITEMS.registerItem(
            "iron_shield",
            ShieldItem::new,
            props -> props.durability(336)
                    .component(ModDataComponents.WOOD_TYPE.get(), "oak")
    );

    public static final DeferredItem<ShieldItem> COPPER_SHIELD = ITEMS.registerItem(
            "copper_shield",
            ShieldItem::new,
            props -> props.durability(246)
                    .component(ModDataComponents.WOOD_TYPE.get(), "oak")
    );


}


