package net.sixtydegrees.sixend.block.entity.custom;

import net.sixtydegrees.sixend.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ChiseledEndStoneEntity extends BlockEntity {
    public ChiseledEndStoneEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CHISELED_END_STONE_ENTITY, pos, state);
    }
}
