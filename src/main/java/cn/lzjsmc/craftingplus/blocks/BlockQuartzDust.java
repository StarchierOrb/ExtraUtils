package cn.lzjsmc.craftingplus.blocks;

import cn.lzjsmc.craftingplus.items.ItemQuartzDust;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ObjectHolder;

import java.util.Collections;
import java.util.List;

public class BlockQuartzDust extends Block {
    public BlockQuartzDust() {
        super(Block.Properties.create(Material.IRON).sound(SoundType.STONE)
        .hardnessAndResistance(1F, 4F).harvestLevel(2).harvestTool(ToolType.PICKAXE));
        setRegistryName("quartz_dust_block");
    }

    @ObjectHolder("craftingplus:quartz_dust_block")
    public static final Block quartz_dust_block = null;

    @Override
    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(ItemQuartzDust.quartz_dust, 5));
    }
}
