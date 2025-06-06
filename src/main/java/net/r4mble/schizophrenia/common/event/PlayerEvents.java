package net.r4mble.schizophrenia.common.event;

import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.r4mble.schizophrenia.SchizophreniaMod;

@Mod.EventBusSubscriber(modid = SchizophreniaMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerEvents {

    @SubscribeEvent
    public static void onPlayerWakeUp(PlayerWakeUpEvent event) {
        if (!event.getEntity().level().isClientSide() && !event.updateLevel()) {
            SchizophreniaMod.schizo.removeProgress(100);
        }
    }
}
