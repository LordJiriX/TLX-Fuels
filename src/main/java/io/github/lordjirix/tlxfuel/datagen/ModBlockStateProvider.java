package io.github.lordjirix.tlxfuel.datagen;

import io.github.lordjirix.tlxfuel.Tlxfuel;
import io.github.lordjirix.tlxfuel.block.ModBlocks;
import net.minecraft.data.PackOutput;

import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Tlxfuel.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CONSOLIDATED_COAL_BLOCK);
        blockWithItem(ModBlocks.GILDNED_COAL_BLOCK);
        blockWithItem(ModBlocks.CHARGED_COAL_BLOCK);
        blockWithItem(ModBlocks.MAGNETIC_COAL_BLOCK);


    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}