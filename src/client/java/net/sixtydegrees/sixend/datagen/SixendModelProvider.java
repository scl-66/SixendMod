package net.sixtydegrees.sixend.datagen;

import net.minecraft.client.data.models.model.ModelTemplates;
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
        blockStateModelGenerator.createTrivialCube(ModBlocks.AZULITE_BRICKS);
        blockStateModelGenerator.createTrivialCube(ModBlocks.END_STONE_TILES);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.CHISELED_END_STONE, TexturedModel.CUBE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.CHISELED_PURPUR);
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
