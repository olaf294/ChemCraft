
package net.mcreator.chemiemod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LithiumOreBlock extends Block {
	public LithiumOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(6.5f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}