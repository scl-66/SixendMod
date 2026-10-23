package net.sixtydegrees.sixend.datagen;

import net.minecraft.world.level.block.Block;
import net.sixtydegrees.sixend.block.ModBlockItemIds;
import net.sixtydegrees.sixend.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class SixendBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public SixendBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.AZULITE))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_AZULITE))
                .add(ModBlocks.getRK(ModBlocks.AZULITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.AZULITE_TILES))
                .add(ModBlocks.getRK(ModBlocks.END_STONE_TILES))
                .add(ModBlocks.getRK(ModBlocks.CHISELED_END_STONE))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_END_STONE))
                .add(ModBlocks.getRK(ModBlocks.CHISELED_PURPUR))
                .add(ModBlocks.getRK(ModBlocks.ELDERSHALE))
                .add(ModBlocks.getRK(ModBlocks.ELDERSHALE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.ELDERSHALE_PILLAR))
                .add(ModBlocks.getRK(ModBlocks.CHISELED_ELDERSHALE))
                .add(ModBlocks.getRK(ModBlocks.COBBLED_ELDERSHALE))
                .add(ModBlocks.getRK(ModBlocks.CRACKED_ELDERSHALE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_ELDERSHALE))
                .add(ModBlocks.getRK(ModBlocks.CHORUS_TURF))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_END_STONE))
        ;
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.getRK(ModBlocks.DUSK_PETRO))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_PETRO))
                .add(ModBlocks.getRK(ModBlocks.DUSK_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_PLANKS))
                .add(ModBlocks.getRK(ModBlocks.STRIPPED_DUSK_PETRO))
                .add(ModBlocks.getRK(ModBlocks.STRIPPED_LUCENT_PETRO))
                .add(ModBlocks.getRK(ModBlocks.DUSK_CRUST))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_CRUST))
                .add(ModBlocks.getRK(ModBlocks.STRIPPED_DUSK_CRUST))
                .add(ModBlocks.getRK(ModBlocks.STRIPPED_LUCENT_CRUST))
                .add(ModBlocks.getRK(ModBlocks.DUSK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.DUSK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_SLAB))
                .add(ModBlocks.getRK(ModBlocks.DUSK_FENCE))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_FENCE))
                .add(ModBlocks.getRK(ModBlocks.DUSK_FENCE_GATE))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_FENCE_GATE))
                .add(ModBlocks.getRK(ModBlocks.DUSK_DOOR))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_DOOR))
                .add(ModBlocks.getRK(ModBlocks.DUSK_TRAPDOOR))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_TRAPDOOR))
                .add(ModBlocks.getRK(ModBlocks.DUSK_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.DUSK_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_BUTTON))
        ;

        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.DUSK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_STAIRS))

                .add(ModBlocks.getRK(ModBlocks.AZULITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_AZULITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.AZULITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.AZULITE_TILE_STAIRS))

                .add(ModBlocks.getRK(ModBlocks.COBBLED_ELDERSHALE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_ELDERSHALE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.ELDERSHALE_BRICK_STAIRS))

                .add(ModBlocks.getRK(ModBlocks.POLISHED_END_STONE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.END_STONE_TILE_STAIRS))
        ;
        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.DUSK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_SLAB))

                .add(ModBlocks.getRK(ModBlocks.AZULITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_AZULITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.AZULITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.AZULITE_TILE_SLAB))

                .add(ModBlocks.getRK(ModBlocks.COBBLED_ELDERSHALE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_ELDERSHALE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.ELDERSHALE_BRICK_SLAB))

                .add(ModBlocks.getRK(ModBlocks.POLISHED_END_STONE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.END_STONE_TILE_SLAB))
        ;
        tag(BlockTags.WALLS)
                .add(ModBlocks.getRK(ModBlocks.AZULITE_WALL))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_AZULITE_WALL))
                .add(ModBlocks.getRK(ModBlocks.AZULITE_BRICK_WALL))
                .add(ModBlocks.getRK(ModBlocks.AZULITE_TILE_WALL))

                .add(ModBlocks.getRK(ModBlocks.COBBLED_ELDERSHALE_WALL))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_ELDERSHALE_WALL))
                .add(ModBlocks.getRK(ModBlocks.ELDERSHALE_BRICK_WALL))

                .add(ModBlocks.getRK(ModBlocks.POLISHED_END_STONE_WALL))
                .add(ModBlocks.getRK(ModBlocks.END_STONE_TILE_WALL))
        ;
        tag(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.getRK(ModBlocks.DUSK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_STAIRS))
        ;
        tag(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.getRK(ModBlocks.DUSK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_SLAB))
        ;
        tag(BlockTags.FENCES)
                .add(ModBlocks.getRK(ModBlocks.DUSK_FENCE))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_FENCE))
        ;
        tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.getRK(ModBlocks.DUSK_FENCE))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_FENCE))
        ;
        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.getRK(ModBlocks.DUSK_FENCE_GATE))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_FENCE_GATE))
        ;
        tag(BlockTags.DOORS)
                .add(ModBlocks.getRK(ModBlocks.DUSK_DOOR))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_DOOR))
        ;
        tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.getRK(ModBlocks.DUSK_DOOR))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_DOOR))
        ;
        tag(BlockTags.TRAPDOORS)
                .add(ModBlocks.getRK(ModBlocks.DUSK_TRAPDOOR))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_TRAPDOOR))
        ;
        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.getRK(ModBlocks.DUSK_TRAPDOOR))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_TRAPDOOR))
        ;
        tag(BlockTags.BUTTONS)
                .add(ModBlocks.getRK(ModBlocks.DUSK_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_BUTTON))
        ;
        tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.getRK(ModBlocks.DUSK_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_PRESSURE_PLATE))
        ;
        tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.getRK(ModBlocks.DUSK_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_BUTTON))
        ;
        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.getRK(ModBlocks.DUSK_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.LUCENT_PRESSURE_PLATE))
        ;
    }
}
