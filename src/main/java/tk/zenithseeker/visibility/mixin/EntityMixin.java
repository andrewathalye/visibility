package tk.zenithseeker.visibility.mixin;

import net.minecraft.entity.Entity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Entity.class)
public class EntityMixin {

	@Overwrite
	public boolean isInvisible() {
		return false;
	}
}
