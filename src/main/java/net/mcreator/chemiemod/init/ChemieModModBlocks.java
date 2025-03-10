
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemiemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.chemiemod.block.TitanBlock;
import net.mcreator.chemiemod.ChemieModMod;

public class ChemieModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChemieModMod.MODID);
	public static final RegistryObject<Block> TITANORE = REGISTRY.register("titanore", () -> new TitanBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
