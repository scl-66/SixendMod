package net.sixtydegrees.sixend.block.custom;

import com.mojang.serialization.MapCodec;
import net.sixtydegrees.sixend.block.entity.custom.ChiseledEndStoneEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.Nullable;

public class ChiseledEndStone extends BaseEntityBlock {
    public ChiseledEndStone(Properties settings) {
        super(settings);
    }
    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return simpleCodec(ChiseledEndStone::new);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ChiseledEndStoneEntity(pos, state);
    }
}
