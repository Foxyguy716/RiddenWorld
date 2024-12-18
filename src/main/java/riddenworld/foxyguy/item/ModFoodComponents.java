package riddenworld.foxyguy.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent BLAND_AMBER = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300), 0.1f).build();
    public static final FoodComponent CHAOTIC_AMBER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300), 0.25f).build();
    public static final FoodComponent HARMONIC_AMBER = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300), 0.5f).build();
}
