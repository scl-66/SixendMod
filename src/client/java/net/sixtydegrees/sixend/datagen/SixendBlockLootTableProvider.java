package net.sixtydegrees.sixend.datagen;

import net.sixtydegrees.sixend.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class SixendBlockLootTableProvider extends FabricBlockLootSubProvider {
    protected SixendBlockLootTableProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
//        add(ModBlocks.CHORUS_TURF, block -> createSingleItemTableWithSilkTouch(block, Blocks.END_STONE));
        dropSelf(ModBlocks.AZULITE_BRICKS);
        dropSelf(ModBlocks.AZULITE_TILES);
        dropSelf(ModBlocks.END_STONE_TILES);
        dropSelf(ModBlocks.CHISELED_END_STONE);
        dropSelf(ModBlocks.CHISELED_PURPUR);
    }
}
