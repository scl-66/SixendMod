package net.sixtydegrees.sixend.registries;

import net.sixtydegrees.sixend.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DUSK_PETRO, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DUSK_CRUST, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DUSK_PETRO, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DUSK_CRUST, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DUSK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LUCENT_PETRO, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LUCENT_CRUST, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_LUCENT_PETRO, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_LUCENT_CRUST, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LUCENT_PLANKS, 5, 20);
    }
}
