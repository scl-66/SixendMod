package net.sixtydegrees.sixend.datagen;

import net.minecraft.client.data.models.model.ModelTemplates;
import net.sixtydegrees.sixend.block.ModBlockItemIds;
import net.sixtydegrees.sixend.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.TexturedModel;
import net.sixtydegrees.sixend.item.ModItems;

public class SixendModelProvider extends FabricModelProvider {
    public SixendModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
//        blockStateModelGenerator.createTrivialBlock(ModBlocks.ELDERSHALE, TexturedModel.COLUMN_ALT); // commented out due to special model
//        blockStateModelGenerator.createTrivialCube(ModBlocks.AZULITE_BRICKS);
//        blockStateModelGenerator.createTrivialCube(ModBlocks.END_STONE_TILES);
//        blockStateModelGenerator.createTrivialCube(ModBlocks.ELDERSHALE_BRICKS);
//        blockStateModelGenerator.createTrivialCube(ModBlocks.COBBLED_ELDERSHALE);
//        blockStateModelGenerator.createTrivialCube(ModBlocks.POLISHED_ELDERSHALE);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.CHISELED_END_STONE, TexturedModel.CUBE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.CHISELED_PURPUR);
        blockStateModelGenerator.createTrivialCube(ModBlocks.CHISELED_ELDERSHALE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.CRACKED_ELDERSHALE_BRICKS);
        blockStateModelGenerator.createRotatedPillarWithHorizontalVariant(ModBlocks.ELDERSHALE_PILLAR, TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);

        blockStateModelGenerator.family(ModBlocks.DUSK_PLANKS)
                .stairs(ModBlocks.DUSK_STAIRS)
                .slab(ModBlocks.DUSK_SLAB)
                .button(ModBlocks.DUSK_BUTTON)
                .pressurePlate(ModBlocks.DUSK_PRESSURE_PLATE)
                .fence(ModBlocks.DUSK_FENCE)
                .fenceGate(ModBlocks.DUSK_FENCE_GATE);
        blockStateModelGenerator.createDoor(ModBlocks.DUSK_DOOR);
        blockStateModelGenerator.createOrientableTrapdoor(ModBlocks.DUSK_TRAPDOOR);

        blockStateModelGenerator.family(ModBlocks.LUCENT_PLANKS)
                .stairs(ModBlocks.LUCENT_STAIRS)
                .slab(ModBlocks.LUCENT_SLAB)
                .button(ModBlocks.LUCENT_BUTTON)
                .pressurePlate(ModBlocks.LUCENT_PRESSURE_PLATE)
                .fence(ModBlocks.LUCENT_FENCE)
                .fenceGate(ModBlocks.LUCENT_FENCE_GATE);
        blockStateModelGenerator.createDoor(ModBlocks.LUCENT_DOOR);
        blockStateModelGenerator.createOrientableTrapdoor(ModBlocks.LUCENT_TRAPDOOR);

        blockStateModelGenerator.family(ModBlocks.AZULITE)
                .stairs(ModBlocks.AZULITE_STAIRS)
                .slab(ModBlocks.AZULITE_SLAB)
                .wall(ModBlocks.AZULITE_WALL);
        blockStateModelGenerator.family(ModBlocks.AZULITE_BRICKS)
                .stairs(ModBlocks.AZULITE_BRICK_STAIRS)
                .slab(ModBlocks.AZULITE_BRICK_SLAB)
                .wall(ModBlocks.AZULITE_BRICK_WALL);
        blockStateModelGenerator.family(ModBlocks.POLISHED_AZULITE)
                .stairs(ModBlocks.POLISHED_AZULITE_STAIRS)
                .slab(ModBlocks.POLISHED_AZULITE_SLAB)
                .wall(ModBlocks.POLISHED_AZULITE_WALL);
//        blockStateModelGenerator.family(ModBlocks.AZULITE_TILES) //commented out because azulite tiles has a unique model
//                .stairs(ModBlocks.AZULITE_TILE_STAIRS)
//                .slab(ModBlocks.AZULITE_TILE_SLAB)
//                .wall(ModBlocks.AZULITE_TILE_WALL);

        blockStateModelGenerator.family(ModBlocks.COBBLED_ELDERSHALE)
                .stairs(ModBlocks.COBBLED_ELDERSHALE_STAIRS)
                .slab(ModBlocks.COBBLED_ELDERSHALE_SLAB)
                .wall(ModBlocks.COBBLED_ELDERSHALE_WALL);
        blockStateModelGenerator.family(ModBlocks.ELDERSHALE_BRICKS)
                .stairs(ModBlocks.ELDERSHALE_BRICK_STAIRS)
                .slab(ModBlocks.ELDERSHALE_BRICK_SLAB)
                .wall(ModBlocks.ELDERSHALE_BRICK_WALL);
        blockStateModelGenerator.family(ModBlocks.POLISHED_ELDERSHALE)
                .stairs(ModBlocks.POLISHED_ELDERSHALE_STAIRS)
                .slab(ModBlocks.POLISHED_ELDERSHALE_SLAB)
                .wall(ModBlocks.POLISHED_ELDERSHALE_WALL);

        blockStateModelGenerator.family(ModBlocks.END_STONE_TILES)
                .stairs(ModBlocks.END_STONE_TILE_STAIRS)
                .slab(ModBlocks.END_STONE_TILE_SLAB)
                .wall(ModBlocks.END_STONE_TILE_WALL);
        blockStateModelGenerator.family(ModBlocks.POLISHED_END_STONE)
                .stairs(ModBlocks.POLISHED_END_STONE_STAIRS)
                .slab(ModBlocks.POLISHED_END_STONE_SLAB)
                .wall(ModBlocks.POLISHED_END_STONE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(ModItems.PYLON, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.PYLON_FRAME, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CHORUS_PETALS, ModelTemplates.FLAT_ITEM);
    }

    @Override
    public String getName() {
        return "SixModModelProvider";
    }
}
