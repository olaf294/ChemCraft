
package net.mcreator.chemiemod.item;

public class UraniumSuperIngotItem extends Item {
	public UraniumSuperIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}