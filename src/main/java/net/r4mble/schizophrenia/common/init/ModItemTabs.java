package net.r4mble.schizophrenia.common.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.r4mble.schizophrenia.SchizophreniaMod;

public class ModItemTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SchizophreniaMod.MODID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = TABS.register("mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HUMAN_MEAT.get()))
                    .title(Component.translatable("itemGroup.mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HUMAN_MEAT.get());
                    })
                    .build());
}
