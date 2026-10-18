package net.sixtydegrees.sixend.block;

import net.sixtydegrees.sixend.Sixend;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class ModBlockItemIds {

    // region Endsoil
    public static final BlockItemId ENDSOIL = create(
            "endsoil"
    );
    // endregion
    // region Lucent Endsoil
    public static final BlockItemId LUCENT_ENDSOIL = create(
            "lucent_endsoil"
    );
    // endregion
    // region Lucent End Stone
    public static final BlockItemId LUCENT_END_STONE = create(
            "lucent_end_stone"
    );
    // endregion
    // region Chorus Turf
    public static final BlockItemId CHORUS_TURF = create(
            "chorus_turf"
    );
    // endregion
    // region Dusk Petro
    public static final BlockItemId DUSK_PETRO = create(
            "dusk_petro"
    );
    // endregion
    // region Dusk Planks
    public static final BlockItemId DUSK_PLANKS = create(
            "dusk_planks"
    );
    // endregion
    // region Dusk Crust
    public static final BlockItemId DUSK_CRUST = create(
            "dusk_crust"
    );
    // endregion
    // region Stripped Dusk Petro
    public static final BlockItemId STRIPPED_DUSK_PETRO = create(
            "stripped_dusk_petro"
    );
    // endregion
    // region Stripped Dusk Crust
    public static final BlockItemId STRIPPED_DUSK_CRUST = create(
            "stripped_dusk_crust"
    );
    // endregion
    // region Lucent Petro
    public static final BlockItemId LUCENT_PETRO = create(
            "lucent_petro"
    );
    // endregion
    // region Lucent Planks
    public static final BlockItemId LUCENT_PLANKS = create(
            "lucent_planks"
    );
    // endregion
    // region Lucent Crust
    public static final BlockItemId LUCENT_CRUST = create(
            "lucent_crust"
    );
    // endregion
    // region Stripped Lucent Petro
    public static final BlockItemId STRIPPED_LUCENT_PETRO = create(
            "stripped_lucent_petro"
    );
    // endregion
    // region Stripped Lucent Crust
    public static final BlockItemId STRIPPED_LUCENT_CRUST = create(
            "stripped_lucent_crust"
    );
    // endregion
    // region Lucent Hypnum (moss)
    public static final BlockItemId LUCENT_HYPNUM = create(
            "lucent_hypnum"
    );
    // endregion
    // region Azulite
    public static final BlockItemId AZULITE = create(
            "azulite"
    );
    // endregion
    // region Polished Azulite
    public static final BlockItemId POLISHED_AZULITE = create(
            "polished_azulite"
    );
    // endregion
    // region Azulite Bricks
    public static final BlockItemId AZULITE_BRICKS = create(
            "azulite_bricks"
    );
    // endregion
    // region Azulite Tiles
    public static final BlockItemId AZULITE_TILES = create(
            "azulite_tiles"
    );
    // endregion
    // region Polished End Stone
    public static final BlockItemId POLISHED_END_STONE = create(
            "polished_end_stone"
    );
    // endregion
    // region End Stone Tiles
    public static final BlockItemId END_STONE_TILES = create(
            "end_stone_tiles"
    );
    // endregion
    // region Chiseled End Stone
    public static final BlockItemId CHISELED_END_STONE = create(
            "chiseled_end_stone"
    );
    // endregion
    // region Chiseled Purpur
    public static final BlockItemId CHISELED_PURPUR = create(
            "chiseled_purpur"
    );
    // endregion

    // region Reinforced Bedrock
    public static final BlockItemId REINFORCED_BEDROCK = create(
            "reinforced_bedrock"
    );
    // endregion
    // region Reinforced Bedrock Pillar
    public static final BlockItemId REINFORCED_BEDROCK_PILLAR = create(
            "reinforced_bedrock_pillar"
    );
    // endregion
    // region End Gateway Frame
    public static final BlockItemId END_GATEWAY_FRAME = create(
            "end_gateway_frame"
    );
    // endregion
    private static BlockItemId create(String name) {
        Identifier id = Sixend.id(name);
        return BlockItemId.create(id, id);
    }
}