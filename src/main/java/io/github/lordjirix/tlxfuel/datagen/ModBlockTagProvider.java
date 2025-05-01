package io.github.lordjirix.tlxfuel.datagen;

import io.github.lordjirix.tlxfuel.Tlxfuel;
import io.github.lordjirix.tlxfuel.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Tlxfuel.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CONSOLIDATED_COAL_BLOCK.get())
                .add(ModBlocks.MAGNETIC_COAL_BLOCK.get())
                .add(ModBlocks.CHARGED_COAL_BLOCK.get())
                .add(ModBlocks.GILDNED_COAL_BLOCK.get())
                .add(ModBlocks.BIOFUEL_BLOCK.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHARGED_COAL_BLOCK.get())
                .add(ModBlocks.MAGNETIC_COAL_BLOCK.get())
                .add(ModBlocks.CONSOLIDATED_COAL_BLOCK.get())
                .add(ModBlocks.GILDNED_COAL_BLOCK.get())
                .add(ModBlocks.BIOFUEL_BLOCK.get());




    }
}
