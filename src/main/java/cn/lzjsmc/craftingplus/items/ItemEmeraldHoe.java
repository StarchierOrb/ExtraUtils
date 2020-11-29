package cn.lzjsmc.craftingplus.items;

import cn.lzjsmc.craftingplus.group.CustomGroup;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public class ItemEmeraldHoe extends HoeItem {
    public static IItemTier iItemTier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 684;
        }

        @Override
        public float getEfficiency() {
            return 8f;
        }

        @Override
        public float getAttackDamage() {
            return 3f;
        }

        @Override
        public int getHarvestLevel() {
            return 3;
        }

        @Override
        public int getEnchantability() {
            return 16;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromStacks(new ItemStack(Items.EMERALD));
        }
    };
    public ItemEmeraldHoe() {
        super(iItemTier, -3F, new Properties().group(CustomGroup.itemGroup));
        setRegistryName("emerald_hoe");
    }
}
