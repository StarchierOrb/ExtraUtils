package cn.lzjsmc.craftingplus;

import cn.lzjsmc.craftingplus.blocks.BlockQuartzDust;
import cn.lzjsmc.craftingplus.group.CustomGroup;
import cn.lzjsmc.craftingplus.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("craftingplus")
public class CraftingPlus {
    public CraftingPlus() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> evt) {
            // register a new block here
            evt.getRegistry().registerAll(
                    new BlockQuartzDust()
            );
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> evt) {
            evt.getRegistry().registerAll(
                    new ItemQuartzDust(),
                    new ItemHammer(),
                    new ItemQuartzPick(),
                    new ItemQuartzAxe(),
                    new ItemQuartzSword(),
                    new ItemQuartzShovel(),
                    new ItemQuartzHoe(),
                    new ItemEmeraldAxe(),
                    new ItemEmeraldPick(),
                    new ItemEmeraldShovel(),
                    new ItemEmeraldSword(),
                    new ItemEmeraldHoe(),
                    new ItemObsidianPick(),
                    new ItemObsidianAxe(),
                    new ItemObsidianShovel(),
                    new ItemObsidianSword(),
                    new ItemObsidianHoe(),
                    new BlockItem(BlockQuartzDust.quartz_dust_block, new Item.Properties().group(CustomGroup.itemGroup)).setRegistryName(BlockQuartzDust.quartz_dust_block.getRegistryName())
            );
        }
    }
}
