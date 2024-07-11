package de.publiccode.mixin.client;

import de.publiccode.MinigameUtils;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
    private final MinigameUtils minigameEngine = new MinigameUtils();

    @Inject(method = "render", at = @At("TAIL"))
    public void renderMixin(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        minigameEngine.renderMinigame(context, mouseX, mouseY, delta);
    }
}