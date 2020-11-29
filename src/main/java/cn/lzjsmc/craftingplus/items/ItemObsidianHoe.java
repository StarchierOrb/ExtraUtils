package cn.lzjsmc.craftingplus.items;

import cn.lzjsmc.craftingplus.group.CustomGroup;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;

public class ItemObsidianHoe extends HoeItem {
    public static IItemTier iItemTier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 2135;
        }

        @Override
        public float getEfficiency() {
            return 9f;
        }

        @Override
        public float getAttackDamage() {
            return 3f;
        }

        @Override
        public int getHarvestLevel() {
            return 4;
        }

        @Override
        public int getEnchantability() {
            return 14;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromStacks(new ItemStack(Items.OBSIDIAN));
        }
    };
    public ItemObsidianHoe() {
        super(iItemTier, -3F, new Properties().group(CustomGroup.itemGroup));
        setRegistryName("obsidian_hoe");
    }
}