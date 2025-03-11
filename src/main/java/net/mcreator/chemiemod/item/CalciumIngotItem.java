
package net.mcreator.chemiemod.item;

public class CalciumIngotItem extends Item {
	public CalciumIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}