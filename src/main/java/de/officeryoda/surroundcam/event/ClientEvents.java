package de.officeryoda.surroundcam.event;

import de.officeryoda.surroundcam.SurroundCam;
import de.officeryoda.surroundcam.client.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {

    @Mod.EventBusSubscriber(modid = SurroundCam.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {

        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if(KeyBinding.TOGGLE_CAM_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Toggle cam"));
            }
        }
    }

    @Mod.EventBusSubscriber(modid = SurroundCam.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {

        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.TOGGLE_CAM_KEY);
        }
    }
}
