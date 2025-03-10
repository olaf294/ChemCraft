
package net.mcreator.chemiemod.item;

public class TitanPickaxeItem extends PickaxeItem {
	public TitanPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1600;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ChemieModModItems.TITAN_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
