package net.sixtydegrees.sixend.datagen;

// #region datagen_recipes_provider
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.sixtydegrees.sixend.block.ModBlocks;

public class SixendRecipeProvider extends FabricRecipeProvider {
    public SixendRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                stairBuilder(ModBlocks.DUSK_STAIRS, Ingredient.of(ModBlocks.DUSK_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.DUSK_PLANKS), has(ModBlocks.DUSK_PLANKS))
                        .save(output);
                stairBuilder(ModBlocks.LUCENT_STAIRS, Ingredient.of(ModBlocks.LUCENT_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.LUCENT_PLANKS), has(ModBlocks.LUCENT_PLANKS))
                        .save(output);

                stairBuilder(ModBlocks.AZULITE_STAIRS, Ingredient.of(ModBlocks.AZULITE))
                        .unlockedBy(getHasName(ModBlocks.AZULITE), has(ModBlocks.AZULITE))
                        .save(output);
                stairBuilder(ModBlocks.POLISHED_AZULITE_STAIRS, Ingredient.of(ModBlocks.POLISHED_AZULITE))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_AZULITE), has(ModBlocks.POLISHED_AZULITE))
                        .save(output);
                stairBuilder(ModBlocks.AZULITE_BRICK_STAIRS, Ingredient.of(ModBlocks.AZULITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.AZULITE_BRICKS), has(ModBlocks.AZULITE_BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.AZULITE_TILE_STAIRS, Ingredient.of(ModBlocks.AZULITE_TILES))
                        .unlockedBy(getHasName(ModBlocks.AZULITE_TILES), has(ModBlocks.AZULITE_TILES))
                        .save(output);

                stairBuilder(ModBlocks.COBBLED_ELDERSHALE_STAIRS, Ingredient.of(ModBlocks.COBBLED_ELDERSHALE))
                        .unlockedBy(getHasName(ModBlocks.COBBLED_ELDERSHALE), has(ModBlocks.COBBLED_ELDERSHALE))
                        .save(output);
                stairBuilder(ModBlocks.POLISHED_ELDERSHALE_STAIRS, Ingredient.of(ModBlocks.POLISHED_ELDERSHALE))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_ELDERSHALE), has(ModBlocks.POLISHED_ELDERSHALE))
                        .save(output);
                stairBuilder(ModBlocks.ELDERSHALE_BRICK_STAIRS, Ingredient.of(ModBlocks.ELDERSHALE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.ELDERSHALE_BRICKS), has(ModBlocks.ELDERSHALE_BRICKS))
                        .save(output);

                stairBuilder(ModBlocks.POLISHED_END_STONE_STAIRS, Ingredient.of(ModBlocks.POLISHED_END_STONE))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_END_STONE), has(ModBlocks.POLISHED_END_STONE))
                        .save(output);
                stairBuilder(ModBlocks.END_STONE_TILE_STAIRS, Ingredient.of(ModBlocks.END_STONE_TILES))
                        .unlockedBy(getHasName(ModBlocks.END_STONE_TILES), has(ModBlocks.END_STONE_TILES))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUSK_SLAB, ModBlocks.DUSK_PLANKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LUCENT_SLAB, ModBlocks.LUCENT_PLANKS);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZULITE_SLAB, ModBlocks.AZULITE);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_AZULITE_SLAB, ModBlocks.POLISHED_AZULITE);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZULITE_BRICK_SLAB, ModBlocks.AZULITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZULITE_TILE_SLAB, ModBlocks.AZULITE_TILES);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_ELDERSHALE_SLAB, ModBlocks.COBBLED_ELDERSHALE);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELDERSHALE_BRICK_SLAB, ModBlocks.ELDERSHALE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ELDERSHALE_SLAB, ModBlocks.POLISHED_ELDERSHALE);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_TILE_SLAB, ModBlocks.END_STONE_TILES);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZULITE_WALL, ModBlocks.AZULITE);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_AZULITE_WALL, ModBlocks.POLISHED_AZULITE);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZULITE_BRICK_WALL, ModBlocks.AZULITE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZULITE_TILE_WALL, ModBlocks.AZULITE_TILES);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_ELDERSHALE_WALL, ModBlocks.COBBLED_ELDERSHALE);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELDERSHALE_BRICK_WALL, ModBlocks.ELDERSHALE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ELDERSHALE_WALL, ModBlocks.POLISHED_ELDERSHALE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_TILE_WALL, ModBlocks.END_STONE_TILES);

                buttonBuilder(ModBlocks.DUSK_BUTTON, Ingredient.of(ModBlocks.DUSK_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.DUSK_PLANKS), has(ModBlocks.DUSK_PLANKS))
                        .save(output);
                buttonBuilder(ModBlocks.LUCENT_BUTTON, Ingredient.of(ModBlocks.LUCENT_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.LUCENT_PLANKS), has(ModBlocks.LUCENT_PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.DUSK_PRESSURE_PLATE, ModBlocks.DUSK_PLANKS);
                pressurePlate(ModBlocks.LUCENT_PRESSURE_PLATE, ModBlocks.LUCENT_PLANKS);

                fenceBuilder(ModBlocks.DUSK_FENCE, Ingredient.of(ModBlocks.DUSK_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.DUSK_PLANKS), has(ModBlocks.DUSK_PLANKS))
                        .save(output);
                fenceBuilder(ModBlocks.LUCENT_FENCE, Ingredient.of(ModBlocks.LUCENT_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.LUCENT_PLANKS), has(ModBlocks.LUCENT_PLANKS))
                        .save(output);

                fenceGateBuilder(ModBlocks.DUSK_FENCE_GATE, Ingredient.of(ModBlocks.DUSK_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.DUSK_PLANKS), has(ModBlocks.DUSK_PLANKS))
                        .save(output);
                fenceGateBuilder(ModBlocks.LUCENT_FENCE_GATE, Ingredient.of(ModBlocks.LUCENT_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.LUCENT_PLANKS), has(ModBlocks.LUCENT_PLANKS))
                        .save(output);

                doorBuilder(ModBlocks.DUSK_DOOR, Ingredient.of(ModBlocks.DUSK_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.DUSK_PLANKS), has(ModBlocks.DUSK_PLANKS))
                        .save(output);
                doorBuilder(ModBlocks.LUCENT_DOOR, Ingredient.of(ModBlocks.LUCENT_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.LUCENT_PLANKS), has(ModBlocks.LUCENT_PLANKS))
                        .save(output);

                trapdoorBuilder(ModBlocks.DUSK_TRAPDOOR, Ingredient.of(ModBlocks.DUSK_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.DUSK_PLANKS), has(ModBlocks.DUSK_PLANKS))
                        .save(output);
                trapdoorBuilder(ModBlocks.LUCENT_TRAPDOOR, Ingredient.of(ModBlocks.LUCENT_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.LUCENT_PLANKS), has(ModBlocks.LUCENT_PLANKS))
                        .save(output);

            }
        };
    }

    @Override
    public String getName() {
        return "SixendRecipeProvider";
    }
}
// #endregion datagen_recipes_provider