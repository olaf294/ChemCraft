
package net.mcreator.chemiemod.item;

public class GoutgasItem extends Item {
	public GoutgasItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.chemie_mod.goutgas.description_0"));
	}
}