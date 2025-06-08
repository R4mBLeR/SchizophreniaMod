package net.r4mble.schizophrenia.common.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.r4mble.schizophrenia.SchizophreniaMod;
import net.r4mble.schizophrenia.common.item.Schizometer;
import net.r4mble.schizophrenia.common.item.armor.FoilHat;
import net.r4mble.schizophrenia.common.item.food.HumanMeat;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SchizophreniaMod.MODID);

    public static final RegistryObject<Item> HUMAN_MEAT = ITEMS.register("human_meat",
            () -> new HumanMeat(
                    new Item.Properties()
                            .food(new FoodProperties.Builder()
                                    .nutrition(5)    // Сколько восстанавливает голода
                                    .saturationMod(0.2f)  // Насыщение
                                    .build())
            ));

    public static final RegistryObject<Item> FOIL_HAT = ITEMS.register("foil_hat",
            () -> new FoilHat(
                    ArmorMaterials.IRON,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .durability(500)
            ));

    public static final RegistryObject<Item> GLASSES_OF_TRUE = ITEMS.register("glasses_of_true",
            () -> new ArmorItem(
                    ArmorMaterials.IRON,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()
            ));

    public static final RegistryObject<Item> SCHIZOMETER = ITEMS.register("schizometer",
            () -> new Schizometer(
                    new Item.Properties()
                            .durability(50)
            ));
}
