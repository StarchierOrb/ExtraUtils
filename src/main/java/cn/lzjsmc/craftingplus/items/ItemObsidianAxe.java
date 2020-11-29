package cn.lzjsmc.craftingplus.items;

import cn.lzjsmc.craftingplus.group.CustomGroup;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;

public class ItemObsidianAxe extends AxeItem {
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
            return 3.5f;
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
    public ItemObsidianAxe() {
        super(iItemTier, 5, -3.1f, new Properties().group(CustomGroup.itemGroup));
        setRegistryName("obsidian_axe");
    }
}
