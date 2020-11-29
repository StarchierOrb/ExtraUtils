package cn.lzjsmc.craftingplus.items;

import cn.lzjsmc.craftingplus.group.CustomGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.ObjectHolder;

public class ItemHammer extends Item {
    @ObjectHolder("craftingplus:hammer")
    public static final Item item = null;

    public ItemHammer() {
        super(new Properties().maxStackSize(1).group(CustomGroup.itemGroup).maxDamage(30));
        setRegistryName("hammer");
    }

    @Override
    public boolean hasContainerItem() {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        ItemStack i = new ItemStack(this);
        i.setDamage(itemstack.getDamage() + 1);
        if (i.getDamage() >= i.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return i;
    }

}
