package net.r4mble.schizophrenia.common.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.r4mble.schizophrenia.SchizophreniaMod;
import net.r4mble.schizophrenia.common.item.food.HumanMeat;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SchizophreniaMod.MODID);

    public static final RegistryObject<Item> HUMAN_MEAT = ITEMS.register("human_meat",
            () -> new HumanMeat(
                    new Item.Properties()
                            .food(new FoodProperties.Builder()
                                    .nutrition(1)    // Сколько восстанавливает голода
                                    .saturationMod(0.2f)  // Насыщение
                                    .build())
            ));
}
