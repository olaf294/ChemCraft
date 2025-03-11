
package net.mcreator.chemiemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NatriumIngotItem extends Item {
	public NatriumIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
