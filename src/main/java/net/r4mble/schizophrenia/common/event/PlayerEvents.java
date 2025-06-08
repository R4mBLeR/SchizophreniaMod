package net.r4mble.schizophrenia.common.event;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.r4mble.schizophrenia.SchizophreniaMod;
import net.r4mble.schizophrenia.common.util.ModParametrs;

@Mod.EventBusSubscriber(modid = SchizophreniaMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerEvents {

    @SubscribeEvent
    public static void onPlayerWakeUp(PlayerWakeUpEvent event) {
        if (!event.getEntity().level().isClientSide() && !event.updateLevel()) {
            Player player = event.getEntity();
            SchizophreniaMod.schizoPlayers.get(player.getUUID()).removeTickValue(ModParametrs.NOT_SLEEPING_FINE * 1.5f);
            SchizophreniaMod.schizoPlayers.get(player.getUUID()).removeProgress(100);
        }
    }
}
