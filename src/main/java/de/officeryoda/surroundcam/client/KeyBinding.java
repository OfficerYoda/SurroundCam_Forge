package de.officeryoda.surroundcam.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {

    public static final String KEY_CATEGORY = "key.category.surroundcam.cam";
    public static final String KEY_TOGGLE_CAM = "key.surroundcam.toggle_cam";

    public static final KeyMapping TOGGLE_CAM_KEY = new KeyMapping(KEY_TOGGLE_CAM, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_F6, KEY_CATEGORY);
}
