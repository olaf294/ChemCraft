
package net.mcreator.chemiemod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SilverOreBlock extends Block {
	public SilverOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(2.5f, 8f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}