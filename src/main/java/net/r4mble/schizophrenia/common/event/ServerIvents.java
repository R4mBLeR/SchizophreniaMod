package net.r4mble.schizophrenia.common.event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.r4mble.schizophrenia.SchizophreniaMod;
import net.r4mble.schizophrenia.common.Schizo;

@Mod.EventBusSubscriber(modid = SchizophreniaMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ServerIvents {
    @SubscribeEvent
    public static void onEntityJoinWorld(EntityJoinLevelEvent event) {
        if (event.getEntity() instanceof Player) {
            Level level = event.getLevel();
            if (!level.isClientSide) {
                Player player = (Player) event.getEntity();
                if (!SchizophreniaMod.schizoPlayers.containsKey(player.getUUID())) {
                    SchizophreniaMod.schizoPlayers.put(player.getUUID(), new Schizo());
                }
            }
        }
    }

}
