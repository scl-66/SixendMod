package net.sixtydegrees.sixend.block;

import net.sixtydegrees.sixend.Sixend;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

public class ModBlockIds {
    private static ResourceKey<Block> create(String name) {
        Identifier id = Sixend.id(name);
        return ResourceKey.create(Registries.BLOCK, id);
    }
}
