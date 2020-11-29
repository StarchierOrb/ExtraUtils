package cn.lzjsmc.craftingplus.items;

import cn.lzjsmc.craftingplus.group.CustomGroup;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.registries.ObjectHolder;

import java.util.List;

public class ItemQuartzDust extends Item {
    public ItemQuartzDust() {
        super(new Properties().group(CustomGroup.itemGroup).maxStackSize(64));
        setRegistryName("quartz_dust");
    }

    @ObjectHolder("craftingplus:quartz_dust")
    public static final Item quartz_dust = null;

    @Override
    public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
        super.addInformation(itemstack, world, list, flag);
        list.add(new StringTextComponent("\u8BE5\u7269\u54C1\u53EF\u7528\u4E8E\u5236\u4F5C\u66F4\u5F3A\u529B\u7684\u5DE5\u5177"));
    }
}
