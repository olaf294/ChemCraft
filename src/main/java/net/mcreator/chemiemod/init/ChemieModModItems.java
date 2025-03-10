
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemiemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.chemiemod.item.TitanarmorItem;
import net.mcreator.chemiemod.item.TitanIngotItem;
import net.mcreator.chemiemod.ChemieModMod;

public class ChemieModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChemieModMod.MODID);
	public static final RegistryObject<Item> TITAN_INGOT = REGISTRY.register("titan_ingot", () -> new TitanIngotItem());
	public static final RegistryObject<Item> TITANARMOR_HELMET = REGISTRY.register("titanarmor_helmet", () -> new TitanarmorItem.Helmet());
	public static final RegistryObject<Item> TITANARMOR_CHESTPLATE = REGISTRY.register("titanarmor_chestplate", () -> new TitanarmorItem.Chestplate());
	public static final RegistryObject<Item> TITANARMOR_LEGGINGS = REGISTRY.register("titanarmor_leggings", () -> new TitanarmorItem.Leggings());
	public static final RegistryObject<Item> TITANARMOR_BOOTS = REGISTRY.register("titanarmor_boots", () -> new TitanarmorItem.Boots());
	public static final RegistryObject<Item> HURED = block(ChemieModModBlocks.HURED);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
