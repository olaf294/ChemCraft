
package net.mcreator.chemiemod.item;

public class UranIngotItem extends Item {
	public UranIngotItem() {
		super(new Item.Properties().stacksTo(16).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}