
package net.mcreator.chemiemod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CalciumOreBlock extends Block {
	public CalciumOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}