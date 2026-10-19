package net.sixtydegrees.sixend.item;

import net.sixtydegrees.sixend.Sixend;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemIds {
    public static final ResourceKey<Item> PYLON = create("pylon");
    public static final ResourceKey<Item> PYLON_FRAME = create("pylon_frame");
    public static final ResourceKey<Item> CHORUS_PETALS = create("chorus_petals");

    public static ResourceKey<Item> create(String name) {
        // Create the item key.
        return ResourceKey.create(Registries.ITEM, Sixend.id(name));
    }
}
