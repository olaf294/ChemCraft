
package net.mcreator.chemiemod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.chemiemod.init.ChemieModModItems;

public class TitanShovelItem extends ShovelItem {
	public TitanShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1600;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ChemieModModItems.TITAN_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
