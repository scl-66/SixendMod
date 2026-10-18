package net.sixtydegrees.sixend.datagen;

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
//                .add(ModBlocks.getRK(ModBlocks.CHORUS_TURF));
                .add(ModBlocks.getRK(ModBlocks.AZULITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.AZULITE_TILES))
                .add(ModBlocks.getRK(ModBlocks.END_STONE_TILES))
                .add(ModBlocks.getRK(ModBlocks.CHISELED_END_STONE))
                .add(ModBlocks.getRK(ModBlocks.CHISELED_PURPUR))
        ;
    }
}
