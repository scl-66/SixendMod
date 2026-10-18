package net.sixtydegrees.sixend.datagen;

import net.sixtydegrees.sixend.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.TexturedModel;

public class SixendModelProvider extends FabricModelProvider {
    public SixendModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
//        blockStateModelGenerator.createTrivialCube(ModBlocks.AZULITE);
//        blockStateModelGenerator.createTrivialCube(ModBlocks.POLISHED_AZULITE);
//        blockStateModelGenerator.createTrivialCube(ModBlocks.POLISHED_END_STONE);
//        blockStateModelGenerator.createTrivialCube(ModBlocks.LUCENT_HYPNUM);
//        blockStateModelGenerator.createTrivialBlock(ModBlocks.DUSK_PETRO, TexturedModel.COLUMN_ALT);
//        blockStateModelGenerator.createTrivialBlock(ModBlocks.STRIPPED_DUSK_PETRO, TexturedModel.COLUMN_ALT);
//        blockStateModelGenerator.createTrivialBlock(ModBlocks.LUCENT_PETRO, TexturedModel.COLUMN_ALT);
//        blockStateModelGenerator.createTrivialBlock(ModBlocks.STRIPPED_LUCENT_PETRO, TexturedModel.COLUMN_ALT);
        blockStateModelGenerator.createTrivialCube(ModBlocks.AZULITE_BRICKS);
        blockStateModelGenerator.createTrivialCube(ModBlocks.AZULITE_TILES);
        blockStateModelGenerator.createTrivialCube(ModBlocks.END_STONE_TILES);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.CHISELED_END_STONE, TexturedModel.CUBE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.CHISELED_PURPUR);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }

    @Override
    public String getName() {
        return "SixModModelProvider";
    }
}
