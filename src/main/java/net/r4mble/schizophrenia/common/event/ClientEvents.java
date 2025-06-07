package net.r4mble.schizophrenia.common.event;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.r4mble.schizophrenia.SchizophreniaMod;

@Mod.EventBusSubscriber(modid = SchizophreniaMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ClientEvents {
    @SubscribeEvent
    public static void onModelRegister(ModelEvent.RegisterAdditional event) {
        event.register(new ResourceLocation(SchizophreniaMod.MODID, "item/foil_hat"));
    }
}
