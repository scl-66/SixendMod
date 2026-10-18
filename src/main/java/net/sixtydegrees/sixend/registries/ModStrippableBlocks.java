package net.sixtydegrees.sixend.registries;

import net.sixtydegrees.sixend.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlocks {
    public static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(ModBlocks.DUSK_PETRO, ModBlocks.STRIPPED_DUSK_PETRO);
        StrippableBlockRegistry.register(ModBlocks.DUSK_CRUST, ModBlocks.STRIPPED_DUSK_CRUST);
        StrippableBlockRegistry.register(ModBlocks.LUCENT_PETRO, ModBlocks.STRIPPED_LUCENT_PETRO);
        StrippableBlockRegistry.register(ModBlocks.LUCENT_CRUST, ModBlocks.STRIPPED_LUCENT_CRUST);
    }
}
