package net.sixtydegrees.sixend.block.entity;

import net.sixtydegrees.sixend.Sixend;
import net.sixtydegrees.sixend.block.ModBlocks;
import net.sixtydegrees.sixend.block.entity.custom.ChiseledEndStoneEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class ModBlockEntities {
    public static final BlockEntityType<ChiseledEndStoneEntity> CHISELED_END_STONE_ENTITY =
            register("chiseled_end_stone", ChiseledEndStoneEntity::new, ModBlocks.CHISELED_END_STONE);
    private static <T extends BlockEntity> BlockEntityType<T> register(
            String name,
            FabricBlockEntityTypeBuilder.Factory<? extends T> entityFactory,
            Block... blocks
    ) {
        Identifier id = Sixend.id(name);
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, id, FabricBlockEntityTypeBuilder.<T>create(entityFactory, blocks).build());
    }
    // #endregion register_block_entity

    public static void initialize() {
    }
}
