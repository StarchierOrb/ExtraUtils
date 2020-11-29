package cn.lzjsmc.craftingplus.group;

import cn.lzjsmc.craftingplus.items.ItemQuartzDust;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class cpgroup extends ItemGroup {
    public cpgroup() {
        super("craftingplus_group");
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemQuartzDust.quartz_dust , 1);
    }
}

