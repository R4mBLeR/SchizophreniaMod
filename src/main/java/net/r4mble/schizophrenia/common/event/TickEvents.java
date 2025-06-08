package net.r4mble.schizophrenia.common.event;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.r4mble.schizophrenia.SchizophreniaMod;
import net.r4mble.schizophrenia.common.init.ModItems;
import net.r4mble.schizophrenia.common.util.ModParametrs;

@Mod.EventBusSubscriber(modid = SchizophreniaMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TickEvents {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        // Проверяем, что это фаза START (можно также использовать END, но важно выбрать одну)
        if (event.phase == TickEvent.Phase.END) {
            Player player = event.player;

            float schizoResistance = 0;

            if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.FOIL_HAT.get()) {
                schizoResistance = 0.3f;
            }

            if (player.tickCount % 20 == 0) {
                SchizophreniaMod.schizoPlayers.get(player.getUUID()).addProgress(SchizophreniaMod.schizoPlayers.get(player.getUUID()).getTickValue() * (1f - schizoResistance));
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
                        SchizophreniaMod.schizoPlayers.get(player.getUUID()).addTickValue(ModParametrs.NOT_SLEEPING_FINE);
                    }
                }
            }
        }
    }
}
