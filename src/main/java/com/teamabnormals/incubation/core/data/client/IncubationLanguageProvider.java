package com.teamabnormals.incubation.core.data.client;

import com.teamabnormals.incubation.core.Incubation;
import com.teamabnormals.incubation.core.registry.IncubationBlocks;
import com.teamabnormals.incubation.core.registry.IncubationItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.lang3.text.WordUtils;

public class IncubationLanguageProvider extends LanguageProvider {

	public IncubationLanguageProvider(PackOutput output) {
		super(output, Incubation.MOD_ID, "en_us");
	}

	@Override
	public void addTranslations() {
		this.add(IncubationBlocks.CHICKEN_EGG_CRATE.get());
		this.add(IncubationBlocks.TURTLE_EGG_CRATE.get());
		this.add(IncubationBlocks.HAY_NEST.get());
		this.add(IncubationBlocks.HAY_CHICKEN_NEST.get());
		this.add(IncubationBlocks.HAY_DUCK_NEST.get());
		this.add(IncubationBlocks.HAY_TURKEY_NEST.get());
		this.add(IncubationBlocks.TWIG_NEST.get());
		this.add(IncubationBlocks.TWIG_CHICKEN_NEST.get());
		this.add(IncubationBlocks.TWIG_DUCK_NEST.get());
		this.add(IncubationBlocks.TWIG_TURKEY_NEST.get());
		this.add(IncubationItems.FRIED_EGG.get());
		this.add(IncubationItems.SCRAMBLED_EGGS.get());
		this.add("item.incubation.chicken_egg", "Chicken Egg");
	}

	private void add(Item item) {
		ResourceLocation name = ForgeRegistries.ITEMS.getKey(item);
		if (name != null)
			this.add(item, format(name));
	}

	private void add(Block block) {
		ResourceLocation name = ForgeRegistries.BLOCKS.getKey(block);
		if (name != null)
			this.add(block, format(name));
	}

	private String format(ResourceLocation registryName) {
		return WordUtils.capitalizeFully(registryName.getPath().replace("_", " "));
	}
}