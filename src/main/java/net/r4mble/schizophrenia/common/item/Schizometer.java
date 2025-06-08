package net.r4mble.schizophrenia.common.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.r4mble.schizophrenia.SchizophreniaMod;

public class Schizometer extends Item {
    public Schizometer(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide()) {
            player.sendSystemMessage(Component.literal("Уровень вашей шизофрении - " + SchizophreniaMod.schizoPlayers.get(player.getUUID()).getProgress()));
            ItemStack itemStack = player.getItemInHand(hand);
            itemStack.setDamageValue(itemStack.getDamageValue() + 1);

            if (itemStack.getDamageValue() >= itemStack.getMaxDamage()) {
                itemStack.shrink(1); // Удаляем предмет если сломан
                player.broadcastBreakEvent(hand); // Проигрываем анимацию поломки
            }
        }
        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide());
    }
}
