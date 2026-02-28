package com.jakedomain.moreshields;

import com.mojang.serialization.Codec;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.network.codec.ByteBufCodecs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;

public class ModDataComponents {
    public static final DeferredRegister.DataComponents COMPONENTS =
            DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, "moreshields");

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<String>> WOOD_TYPE =
            COMPONENTS.registerComponentType(
                    "wood_type",
                    builder -> builder
                            .persistent(Codec.STRING)
                            .networkSynchronized(ByteBufCodecs.STRING_UTF8)
            );

    public static void register(IEventBus eventBus) {
        COMPONENTS.register(eventBus);
    }
}
