
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemiemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.chemiemod.item.TitanItem;
import net.mcreator.chemiemod.item.TitanIngotItem;
import net.mcreator.chemiemod.ChemieModMod;

public class ChemieModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChemieModMod.MODID);
	public static final RegistryObject<Item> TITAN_INGOT = REGISTRY.register("titan_ingot", () -> new TitanIngotItem());
	public static final RegistryObject<Item> TITAN_HELMET = REGISTRY.register("titan_helmet", () -> new TitanItem.Helmet());
	public static final RegistryObject<Item> TITAN_CHESTPLATE = REGISTRY.register("titan_chestplate", () -> new TitanItem.Chestplate());
	public static final RegistryObject<Item> TITAN_LEGGINGS = REGISTRY.register("titan_leggings", () -> new TitanItem.Leggings());
	public static final RegistryObject<Item> TITAN_BOOTS = REGISTRY.register("titan_boots", () -> new TitanItem.Boots());
	// Start of user code block custom items
	// End of user code block custom items
}
