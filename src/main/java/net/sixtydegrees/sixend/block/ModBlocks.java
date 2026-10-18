package net.sixtydegrees.sixend.block;

import net.sixtydegrees.sixend.world.level.block.CoveredEndStone;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public class ModBlocks {
    //region Endsoil
    public static final Block ENDSOIL = register(
            ModBlockItemIds.ENDSOIL,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BLUE).strength(0.6F).sound(SoundType.GRAVEL)
    );
    //endregion
    //region Lucent Endsoil
    public static final Block LUCENT_ENDSOIL = register(
            ModBlockItemIds.LUCENT_ENDSOIL,
            GrassBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(0.7F).sound(SoundType.GRASS)
    );
    //endregion
    //region Lucent End Stone
    public static final Block LUCENT_END_STONE = register(
            ModBlockItemIds.LUCENT_END_STONE,
            CoveredEndStone::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).sound(SoundType.NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)
    );
    //endregion
    //region Chorus Turf
    public static final Block CHORUS_TURF = register(
            ModBlockItemIds.CHORUS_TURF,
            CoveredEndStone::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F)
    );
    //endregion
    //region Dusk Petro
    public static final Block DUSK_PETRO = register(
            ModBlockItemIds.DUSK_PETRO,
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 0.3F).sound(SoundType.STEM).ignitedByLava()
    );
    //endregion
    //region Dusk Planks
    public static final Block DUSK_PLANKS = register(
            ModBlockItemIds.DUSK_PLANKS,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 0.3F).sound(SoundType.STEM).ignitedByLava()
    );
    //endregion
    //region Dusk Crust
    public static final Block DUSK_CRUST = register(
            ModBlockItemIds.DUSK_CRUST,
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 0.3F).sound(SoundType.STEM).ignitedByLava()
    );
    //endregion
    //region Stripped Dusk Petro
    public static final Block STRIPPED_DUSK_PETRO = register(
            ModBlockItemIds.STRIPPED_DUSK_PETRO,
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 0.3F).sound(SoundType.STEM).ignitedByLava()
    );
    //endregion
    //region Stripped Dusk Crust
    public static final Block STRIPPED_DUSK_CRUST = register(
            ModBlockItemIds.STRIPPED_DUSK_CRUST,
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 0.3F).sound(SoundType.STEM).ignitedByLava()
    );
    //endregion
    //region Lucent Petro
    public static final Block LUCENT_PETRO = register(
            ModBlockItemIds.LUCENT_PETRO,
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 0.3F).sound(SoundType.STEM).ignitedByLava()
    );
    //endregion
    //region Lucent Planks
    public static final Block LUCENT_PLANKS = register(
            ModBlockItemIds.LUCENT_PLANKS,
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 0.3F).sound(SoundType.STEM).ignitedByLava()
    );
    //endregion
    // region Lucent Crust
    public static final Block LUCENT_CRUST = register(
            ModBlockItemIds.LUCENT_CRUST,
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 0.3F).sound(SoundType.STEM).ignitedByLava()
    );
    //endregion
    //region Stripped Lucent Petro
    public static final Block STRIPPED_LUCENT_PETRO = register(
            ModBlockItemIds.STRIPPED_LUCENT_PETRO,
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 0.3F).sound(SoundType.STEM).ignitedByLava()
    );
    //endregion
    //region Stripped Lucent Crust
    public static final Block STRIPPED_LUCENT_CRUST = register(
            ModBlockItemIds.STRIPPED_LUCENT_CRUST,
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 0.3F).sound(SoundType.STEM).ignitedByLava()
    );
    //endregion
    //region Lucent Hypnum
    public static final Block LUCENT_HYPNUM = register(
            ModBlockItemIds.LUCENT_HYPNUM,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(0.1F).sound(SoundType.MOSS).pushReaction(PushReaction.DESTROY)
    );
    //endregion
    //region Azulite
    public static final Block AZULITE = register(
            ModBlockItemIds.AZULITE,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.LAPIS).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)
    );
    //endregion
    //region Polished Azulite
    public static final Block POLISHED_AZULITE = register(
            ModBlockItemIds.POLISHED_AZULITE,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.LAPIS).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)
    );
    //endregion
    //region Azulite Bricks
    public static final Block AZULITE_BRICKS = register(
            ModBlockItemIds.AZULITE_BRICKS,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.LAPIS).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)
    );
    //endregion
    // region Azulite Tiles
    public static final Block AZULITE_TILES = register(
            ModBlockItemIds.AZULITE_TILES,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.LAPIS).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)
    );
    //endregion
    //region Polished End Stone
    public static final Block POLISHED_END_STONE = register(
            ModBlockItemIds.POLISHED_END_STONE,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F)
    );
    //endregion
    //region End Stone Tiles
    public static final Block END_STONE_TILES = register(
            ModBlockItemIds.END_STONE_TILES,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F)
    );
    //endregion
    //region Chiseled End Stone
    public static final Block CHISELED_END_STONE = register(
            ModBlockItemIds.CHISELED_END_STONE,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.0F, 9.0F)
    );
    //endregion
    // region Chiseled Purpur
    public static final Block CHISELED_PURPUR = register(
            ModBlockItemIds.CHISELED_PURPUR,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F));
    //endregion

    // region Reinforced Bedrock
    public static final Block REINFORCED_BEDROCK = register(
            ModBlockItemIds.REINFORCED_BEDROCK,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASEDRUM).strength(-1.0F, 3600000.0F).noLootTable().isValidSpawn(Blocks::never));
    //endregion
    // region Reinforced Bedrock Pillar
    public static final Block REINFORCED_BEDROCK_PILLAR = register(
            ModBlockItemIds.REINFORCED_BEDROCK_PILLAR,
            Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASEDRUM).strength(-1.0F, 3600000.0F).noLootTable().isValidSpawn(Blocks::never));
    //endregion
    // region End Gateway Frame
    public static final Block END_GATEWAY_FRAME = register(
            ModBlockItemIds.END_GATEWAY_FRAME,
            EndPortalFrameBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASEDRUM).strength(-1.0F, 3600000.0F).noLootTable());
    //endregion

    public static ResourceKey<Block> getRK(Block block) { return BuiltInRegistries.BLOCK.getResourceKey(block).get(); }

    private static Block register(ResourceKey<Block> id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        // Create the block instance
        Block block = blockFactory.apply(properties.setId(id));

        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }

    private static Block register(BlockItemId id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        // Create the block instance
        Block block = register(id.block(), blockFactory, properties);

        // Create the block item instance
        BlockItem blockItem = new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(id.item()));
        Registry.register(BuiltInRegistries.ITEM, id.item(), blockItem);

        return block;
    }

    public static void initialize() {
        setupItemGroups();
    }

    public static void setupItemGroups() {
        // #region add_to_creative_tab
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register((creativeTab) -> {
            creativeTab.insertBefore(Blocks.STONE.asItem(), ModBlocks.DUSK_PETRO.asItem());
            creativeTab.insertBefore(Blocks.STONE.asItem(), ModBlocks.DUSK_CRUST.asItem());
            creativeTab.insertBefore(Blocks.STONE.asItem(), ModBlocks.STRIPPED_DUSK_PETRO.asItem());
            creativeTab.insertBefore(Blocks.STONE.asItem(), ModBlocks.STRIPPED_DUSK_CRUST.asItem());
            creativeTab.insertBefore(Blocks.STONE.asItem(), ModBlocks.DUSK_PLANKS.asItem());
            creativeTab.insertBefore(Blocks.STONE.asItem(), ModBlocks.LUCENT_PETRO.asItem());
            creativeTab.insertBefore(Blocks.STONE.asItem(), ModBlocks.LUCENT_CRUST.asItem());
            creativeTab.insertBefore(Blocks.STONE.asItem(), ModBlocks.STRIPPED_LUCENT_PETRO.asItem());
            creativeTab.insertBefore(Blocks.STONE.asItem(), ModBlocks.STRIPPED_LUCENT_CRUST.asItem());
            creativeTab.insertBefore(Blocks.STONE.asItem(), ModBlocks.LUCENT_PLANKS.asItem());

            creativeTab.insertBefore(Blocks.END_STONE_BRICKS.asItem(), ModBlocks.CHISELED_END_STONE.asItem());
            creativeTab.insertBefore(Blocks.END_STONE_BRICKS.asItem(), ModBlocks.POLISHED_END_STONE.asItem());
            creativeTab.insertBefore(Blocks.PURPUR_BLOCK.asItem(), ModBlocks.END_STONE_TILES.asItem());

            creativeTab.insertBefore(Blocks.PURPUR_PILLAR.asItem(), ModBlocks.CHISELED_PURPUR.asItem());

            creativeTab.insertBefore(Blocks.COAL_BLOCK.asItem(), ModBlocks.AZULITE.asItem());
            creativeTab.insertBefore(Blocks.COAL_BLOCK.asItem(), ModBlocks.POLISHED_AZULITE.asItem());
            creativeTab.insertBefore(Blocks.COAL_BLOCK.asItem(), ModBlocks.AZULITE_BRICKS.asItem());
            creativeTab.insertBefore(Blocks.COAL_BLOCK.asItem(), ModBlocks.AZULITE_TILES.asItem());
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register((creativeTab) -> {
            creativeTab.insertBefore(Blocks.COAL_ORE.asItem(), ModBlocks.CHORUS_TURF.asItem());
            creativeTab.insertBefore(Blocks.COAL_ORE.asItem(), ModBlocks.LUCENT_END_STONE.asItem());
            creativeTab.insertBefore(Blocks.COAL_ORE.asItem(), ModBlocks.ENDSOIL.asItem());
            creativeTab.insertBefore(Blocks.COAL_ORE.asItem(), ModBlocks.LUCENT_ENDSOIL.asItem());
            creativeTab.insertBefore(Blocks.COAL_ORE.asItem(), ModBlocks.LUCENT_HYPNUM.asItem());
            creativeTab.insertBefore(Blocks.COAL_ORE.asItem(), ModBlocks.AZULITE.asItem());
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register((creativeTab) -> {
            creativeTab.insertAfter(Blocks.END_PORTAL_FRAME.asItem(), ModBlocks.REINFORCED_BEDROCK_PILLAR.asItem());
            creativeTab.insertAfter(Blocks.END_PORTAL_FRAME.asItem(), ModBlocks.REINFORCED_BEDROCK.asItem());
            creativeTab.insertAfter(Blocks.END_PORTAL_FRAME.asItem(), ModBlocks.END_GATEWAY_FRAME.asItem());
        });
        // #endregion add_to_creative_tab
    }
}
