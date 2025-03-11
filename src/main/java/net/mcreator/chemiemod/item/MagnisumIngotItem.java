
package net.mcreator.chemiemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagnisumIngotItem extends Item {
	public MagnisumIngotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
