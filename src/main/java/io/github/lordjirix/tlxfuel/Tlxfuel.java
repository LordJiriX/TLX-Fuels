package io.github.lordjirix.tlxfuel;

import com.mojang.logging.LogUtils;
import io.github.lordjirix.tlxfuel.block.ModBlocks;
import io.github.lordjirix.tlxfuel.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;


@Mod(Tlxfuel.MODID)
public class Tlxfuel {

    public static final String MODID = "tlxfuel";

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);





    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TLX_FUELS_TAB = CREATIVE_MODE_TABS.register("tlx-fuels_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.tlxfuel")).icon(() -> ModItems.CONSOLIDATED_COAL.get().getDefaultInstance()).displayItems((parameters, output) -> {
        output.accept(ModItems.CONSOLIDATED_COAL.get());
        output.accept(ModItems.GILDNED_COAL.get());
        output.accept(ModItems.CHARGED_COAL.get());
        output.accept(ModItems.MAGNETIC_COAL.get());
        output.accept(ModItems.BIOFUEL.get());
        output.accept(ModItems.COAL_BUCKET.get());
        output.accept(ModItems.CHARCOAL_BUCKET.get());
        output.accept(ModItems.BIOFUEL_BUCKET.get());
        output.accept(ModItems.BURNING_COIL.get());
        output.accept(ModItems.ASHED_COIL.get());
        output.accept(ModBlocks.CONSOLIDATED_COAL_BLOCK.get());
        output.accept(ModBlocks.GILDNED_COAL_BLOCK.get());
        output.accept(ModBlocks.CHARGED_COAL_BLOCK.get());
        output.accept(ModBlocks.MAGNETIC_COAL_BLOCK.get());
        output.accept(ModBlocks.BIOFUEL_BLOCK.get());

    }).build());

    public Tlxfuel(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);

        BLOCKS.register(modEventBus);

        ITEMS.register(modEventBus);

        CREATIVE_MODE_TABS.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {



    }

    

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

        LOGGER.info("TLX server setup");
    }


    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            LOGGER.info("TLX client setup");

        }
    }
}
