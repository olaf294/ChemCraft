
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemiemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.chemiemod.block.UraniumOreBlock;
import net.mcreator.chemiemod.block.TitanBlock;
import net.mcreator.chemiemod.block.NatriumOreBlock;
import net.mcreator.chemiemod.block.MagnesiumOreBlock;
import net.mcreator.chemiemod.block.LithiumOreBlock;
import net.mcreator.chemiemod.ChemieModMod;

public class ChemieModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChemieModMod.MODID);
	public static final RegistryObject<Block> TITAN = REGISTRY.register("titan", () -> new TitanBlock());
	public static final RegistryObject<Block> MAGNESIUM_ORE = REGISTRY.register("magnesium_ore", () -> new MagnesiumOreBlock());
	public static final RegistryObject<Block> NATRIUM_ORE = REGISTRY.register("natrium_ore", () -> new NatriumOreBlock());
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> LITHIUM_ORE = REGISTRY.register("lithium_ore", () -> new LithiumOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
