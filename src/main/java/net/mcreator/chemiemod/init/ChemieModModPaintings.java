
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemiemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.chemiemod.ChemieModMod;

public class ChemieModModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ChemieModMod.MODID);
	public static final RegistryObject<PaintingVariant> PSE = REGISTRY.register("pse", () -> new PaintingVariant(64, 48));
	public static final RegistryObject<PaintingVariant> GIANT_PSE = REGISTRY.register("giant_pse", () -> new PaintingVariant(320, 240));
}
