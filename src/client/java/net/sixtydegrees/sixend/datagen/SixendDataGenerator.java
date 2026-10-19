package net.sixtydegrees.sixend.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;


public class SixendDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(SixendModelProvider::new);
        pack.addProvider(SixendBlockLootTableProvider::new);
        pack.addProvider(SixendBlockTagsProvider::new);
        pack.addProvider(SixendItemTagsProvider::new);
    }
}
