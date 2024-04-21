package com.teamabnormals.incubation.core.data.client;

import com.teamabnormals.blueprint.core.data.client.BlueprintLanguageProvider;
import com.teamabnormals.incubation.core.Incubation;
import com.teamabnormals.incubation.core.registry.IncubationItems;
import net.minecraft.data.PackOutput;

import static com.teamabnormals.incubation.core.registry.IncubationBlocks.*;

public class IncubationLanguageProvider extends BlueprintLanguageProvider {

	public IncubationLanguageProvider(PackOutput output) {
		super(output, Incubation.MOD_ID);
	}

	@Override
	public void addTranslations() {
		this.add(
				CHICKEN_EGG_CRATE.get(), TURTLE_EGG_CRATE.get(),
				HAY_NEST.get(), HAY_CHICKEN_NEST.get(), HAY_DUCK_NEST.get(), HAY_TURKEY_NEST.get(),
				TWIG_NEST.get(), TWIG_CHICKEN_NEST.get(), TWIG_DUCK_NEST.get(), TWIG_TURKEY_NEST.get()
		);
		this.add(IncubationItems.FRIED_EGG.get(), IncubationItems.SCRAMBLED_EGGS.get());
		this.add("item.incubation.chicken_egg", "Chicken Egg");
	}
}