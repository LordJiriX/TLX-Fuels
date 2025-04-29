package io.github.lordjirix.tlxfuel.block;

import io.github.lordjirix.tlxfuel.Tlxfuel;
import io.github.lordjirix.tlxfuel.item.ModItems;
import net.minecraft.world.item.BlockItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;



public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Tlxfuel.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Tlxfuel.MODID);

    public static final DeferredBlock<Block> CONSOLIDATED_COAL_BLOCK = BLOCKS.registerSimpleBlock("consolidated_coal_block", BlockBehaviour.Properties.of().destroyTime(2.0f).requiresCorrectToolForDrops().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> CONSOLIDATED_COAL_ITEM = ITEMS.registerSimpleBlockItem("consolidated_coal_block", CONSOLIDATED_COAL_BLOCK);

    public static final DeferredBlock<Block> GILDNED_COAL_BLOCK = BLOCKS.registerSimpleBlock("gildned_coal_block", BlockBehaviour.Properties.of().destroyTime(2.2f).requiresCorrectToolForDrops().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> GILDNED_COAL_ITEM = ITEMS.registerSimpleBlockItem("gildned_coal_block", GILDNED_COAL_BLOCK);

    public static final DeferredBlock<Block> CHARGED_COAL_BLOCK = BLOCKS.registerSimpleBlock("charged_coal_block", BlockBehaviour.Properties.of().destroyTime(2.2f).requiresCorrectToolForDrops().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> CHARGED_COAL_ITEM = ITEMS.registerSimpleBlockItem("charged_coal_block", CHARGED_COAL_BLOCK);

    public static final DeferredBlock<Block> MAGNETIC_COAL_BLOCK = BLOCKS.registerSimpleBlock("magnetic_coal_block", BlockBehaviour.Properties.of().destroyTime(2.2f).requiresCorrectToolForDrops().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> MAGNETIC_COAL_ITEM = ITEMS.registerSimpleBlockItem("magnetic_coal_block", MAGNETIC_COAL_BLOCK);




    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }

}
