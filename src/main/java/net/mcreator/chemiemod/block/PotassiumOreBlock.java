
package net.mcreator.chemiemod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PotassiumOreBlock extends Block {
	public PotassiumOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2.5f, 5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}