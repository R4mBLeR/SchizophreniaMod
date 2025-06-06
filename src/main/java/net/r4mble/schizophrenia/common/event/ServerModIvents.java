package net.r4mble.schizophrenia.common.event;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.r4mble.schizophrenia.SchizophreniaMod;
import net.r4mble.schizophrenia.common.util.ModParametrs;

@Mod.EventBusSubscriber(modid = SchizophreniaMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ServerModIvents {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        // Проверяем, что это фаза START (можно также использовать END, но важно выбрать одну)
        if (event.phase == TickEvent.Phase.END) {
            Player player = event.player;
            if (player.tickCount % 20 == 0) {
                SchizophreniaMod.schizo.addProgress(SchizophreniaMod.schizo.getTickValue());
                player.sendSystemMessage(Component.literal(String.valueOf(SchizophreniaMod.schizo.getProgress())));
            }
            if (SchizophreniaMod.schizo.getProgress() == 100) {
                player.setHealth(10f);
            }
        }
    }

    @SubscribeEvent
    public static void onWorldTick(TickEvent.LevelTickEvent event) {
        if (event.phase == TickEvent.Phase.END && event.level instanceof ServerLevel level) {
            long time = level.getDayTime();
            if (time % 24000 == 0) { // Наступило утро
                for (Player player : level.players()) {
                    if (!player.isSleeping()) {
                        SchizophreniaMod.schizo.addTickValue(ModParametrs.NOT_SLEEPING_FINE);
                    }
                }
            }
        }
    }
}
