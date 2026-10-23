package net.sixtydegrees.sixend.datagen;

import net.sixtydegrees.sixend.block.ModBlockItemIds;
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

        add(ModBlocks.ELDERSHALE, block -> createSingleItemTableWithSilkTouch(block, ModBlocks.COBBLED_ELDERSHALE));
        dropSelf(ModBlocks.ELDERSHALE_BRICKS);
        dropSelf(ModBlocks.ELDERSHALE_PILLAR);
        dropSelf(ModBlocks.CHISELED_ELDERSHALE);
        dropSelf(ModBlocks.COBBLED_ELDERSHALE);
        dropSelf(ModBlocks.CRACKED_ELDERSHALE_BRICKS);
        dropSelf(ModBlocks.POLISHED_ELDERSHALE);

        dropSelf(ModBlocks.DUSK_STAIRS);
        add(ModBlocks.DUSK_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.LUCENT_STAIRS);
        add(ModBlocks.LUCENT_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.DUSK_FENCE);
        dropSelf(ModBlocks.LUCENT_FENCE);
        dropSelf(ModBlocks.DUSK_FENCE_GATE);
        dropSelf(ModBlocks.LUCENT_FENCE_GATE);
        add(ModBlocks.DUSK_DOOR, this::createDoorTable);
        add(ModBlocks.LUCENT_DOOR, this::createDoorTable);
        dropSelf(ModBlocks.DUSK_TRAPDOOR);
        dropSelf(ModBlocks.LUCENT_TRAPDOOR);
        dropSelf(ModBlocks.DUSK_PRESSURE_PLATE);
        dropSelf(ModBlocks.LUCENT_PRESSURE_PLATE);
        dropSelf(ModBlocks.DUSK_BUTTON);
        dropSelf(ModBlocks.LUCENT_BUTTON);

        dropSelf(ModBlocks.AZULITE_STAIRS);
        dropSelf(ModBlocks.AZULITE_WALL);
        add(ModBlocks.AZULITE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.POLISHED_AZULITE_STAIRS);
        dropSelf(ModBlocks.POLISHED_AZULITE_WALL);
        add(ModBlocks.POLISHED_AZULITE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.AZULITE_BRICK_STAIRS);
        dropSelf(ModBlocks.AZULITE_BRICK_WALL);
        add(ModBlocks.AZULITE_BRICK_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.AZULITE_TILE_STAIRS);
        dropSelf(ModBlocks.AZULITE_TILE_WALL);
        add(ModBlocks.AZULITE_TILE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.COBBLED_ELDERSHALE_STAIRS);
        dropSelf(ModBlocks.COBBLED_ELDERSHALE_WALL);
        add(ModBlocks.COBBLED_ELDERSHALE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.ELDERSHALE_BRICK_STAIRS);
        dropSelf(ModBlocks.ELDERSHALE_BRICK_WALL);
        add(ModBlocks.ELDERSHALE_BRICK_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.POLISHED_ELDERSHALE_STAIRS);
        dropSelf(ModBlocks.POLISHED_ELDERSHALE_WALL);
        add(ModBlocks.POLISHED_ELDERSHALE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.POLISHED_END_STONE_STAIRS);
        dropSelf(ModBlocks.POLISHED_END_STONE_WALL);
        add(ModBlocks.POLISHED_END_STONE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.END_STONE_TILE_STAIRS);
        dropSelf(ModBlocks.END_STONE_TILE_WALL);
        add(ModBlocks.END_STONE_TILE_SLAB, this::createSlabItemTable);
    }
}
