package net.r4mble.schizophrenia.common.item.food;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.r4mble.schizophrenia.SchizophreniaMod;

public class HumanMeat extends Item {
    public HumanMeat(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {

        if (!level.isClientSide()) {
            SchizophreniaMod.schizoPlayers.get(entity.getUUID()).addProgress(50);
            SchizophreniaMod.schizoPlayers.get(entity.getUUID()).addTickValue(1);
        }
        return super.finishUsingItem(stack, level, entity);
    }
}
