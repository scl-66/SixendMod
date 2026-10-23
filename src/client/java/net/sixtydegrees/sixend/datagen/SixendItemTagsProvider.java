package net.sixtydegrees.sixend.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.sixtydegrees.sixend.block.ModBlockItemIds;
import net.sixtydegrees.sixend.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class SixendItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public SixendItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(ModBlockItemIds.COBBLED_ELDERSHALE.item());
        tag(ItemTags.STONE_TOOL_MATERIALS).add(ModBlockItemIds.COBBLED_ELDERSHALE.item());
    }
}
