package io.github.lordjirix.tlxfuel.item;

import io.github.lordjirix.tlxfuel.Tlxfuel;
import io.github.lordjirix.tlxfuel.item.custom.FuelItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Tlxfuel.MODID);


    public static final DeferredItem<Item> CONSOLIDATED_COAL = ITEMS.register("consolidated_coal",
            () -> new FuelItem(new Item.Properties(), 2000){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.tlxfuel.consolidated_coal.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            
            });
    public static final DeferredItem<Item> GILDNED_COAL = ITEMS.register("gildned_coal",
            () -> new FuelItem(new Item.Properties(), 2400){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.tlxfuel.gildned_coal.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }

            });

    public static final DeferredItem<Item> CHARGED_COAL = ITEMS.register("charged_coal",
            () -> new FuelItem(new Item.Properties().rarity(Rarity.UNCOMMON), 4200){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.tlxfuel.charged_coal.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }

            });

    public static final DeferredItem<Item> MAGNETIC_COAL = ITEMS.register("magnetic_coal",
            () -> new FuelItem(new Item.Properties().rarity(Rarity.UNCOMMON), 4800){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.tlxfuel.magnetic_coal.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }

            });

    public static final DeferredItem<Item> BIOFUEL = ITEMS.register("biofuel",
            () -> new FuelItem(new Item.Properties().rarity(Rarity.COMMON), 1600){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.tlxfuel.biofuel.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }

            });

    public static final DeferredItem<Item> COAL_BUCKET = ITEMS.register("coal_bucket",
            () -> new FuelItem(new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1), 3200){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.tlxfuel.coal_bucket.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }

            });

    public static final DeferredItem<Item> CHARCOAL_BUCKET = ITEMS.register("charcoal_bucket",
            () -> new FuelItem(new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1), 3200){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.tlxfuel.charcoal_bucket.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }

            });

    public static final DeferredItem<Item> BIOFUEL_BUCKET = ITEMS.register("biofuel_bucket",
            () -> new FuelItem(new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1), 3200){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.tlxfuel.biofuel_bucket.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }

            });

    public static final DeferredItem<Item> BURNING_COIL_I = ITEMS.register("burning_coil_i",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.tlxfuel.burning_coil_i.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }

            });



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
