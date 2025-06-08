package net.r4mble.schizophrenia.common.item.armor;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.r4mble.schizophrenia.common.item.armor.client.model.FoilHatModel;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class FoilHat extends ArmorItem {
    public FoilHat(ArmorMaterial p_40386_, Type p_266831_, Properties p_40388_) {
        super(p_40386_, p_266831_, p_40388_);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(
                    LivingEntity entity, ItemStack stack, EquipmentSlot slot, HumanoidModel<?> original
            ) {
                // Возвращаем вашу 3D-модель для слота HEAD
                if (slot == EquipmentSlot.HEAD) {
                    return new FoilHatModel(
                            Minecraft.getInstance().getEntityModels().bakeLayer(FoilHatModel.LAYER_LOCATION)
                    );
                }
                return original; // Для других слотов используем стандартную модель
            }
        });
    }
}