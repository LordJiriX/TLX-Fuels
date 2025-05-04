package io.github.lordjirix.tlxfuel.datagen;

import io.github.lordjirix.tlxfuel.Tlxfuel;
import io.github.lordjirix.tlxfuel.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Tlxfuel.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.CONSOLIDATED_COAL.get());
        basicItem(ModItems.GILDNED_COAL.get());
        basicItem(ModItems.BURNING_COIL_I.get());
        basicItem(ModItems.COAL_BUCKET.get());
        basicItem(ModItems.CHARCOAL_BUCKET.get());
        basicItem(ModItems.CHARGED_COAL.get());
        basicItem(ModItems.MAGNETIC_COAL.get());
        basicItem(ModItems.BIOFUEL.get());
        basicItem(ModItems.BIOFUEL_BUCKET.get());

    }
}
