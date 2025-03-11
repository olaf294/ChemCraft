
package net.mcreator.chemiemod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class UraniumOreBlock extends Block {
	public UraniumOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(5.5f, 12f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}