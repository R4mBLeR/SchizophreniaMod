package net.r4mble.schizophrenia.common.event;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.r4mble.schizophrenia.SchizophreniaMod;

@Mod.EventBusSubscriber(modid = SchizophreniaMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ServerModIvents {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        // Проверяем, что это фаза START (можно также использовать END, но важно выбрать одну)
        if (event.phase == TickEvent.Phase.START) {
            Player player = event.player;
            if (player.tickCount % 20 == 0) {
                SchizophreniaMod.schizo.progress++;
                player.sendSystemMessage(Component.literal(String.valueOf(SchizophreniaMod.schizo.progress)));
            }
        }
    }
}
