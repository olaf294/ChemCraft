
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

import net.mcreator.chemiemod.item.TitanIngotItem;
import net.mcreator.chemiemod.item.TitanArmorItem;
import net.mcreator.chemiemod.ChemieModMod;

public class ChemieModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChemieModMod.MODID);
	public static final RegistryObject<Item> TITAN = block(ChemieModModBlocks.TITAN);
	public static final RegistryObject<Item> TITAN_INGOT = REGISTRY.register("titan_ingot", () -> new TitanIngotItem());
	public static final RegistryObject<Item> TITAN_ARMOR_HELMET = REGISTRY.register("titan_armor_helmet", () -> new TitanArmorItem.Helmet());
	public static final RegistryObject<Item> TITAN_ARMOR_CHESTPLATE = REGISTRY.register("titan_armor_chestplate", () -> new TitanArmorItem.Chestplate());
	public static final RegistryObject<Item> TITAN_ARMOR_LEGGINGS = REGISTRY.register("titan_armor_leggings", () -> new TitanArmorItem.Leggings());
	public static final RegistryObject<Item> TITAN_ARMOR_BOOTS = REGISTRY.register("titan_armor_boots", () -> new TitanArmorItem.Boots());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
