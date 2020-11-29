package cn.lzjsmc.craftingplus.items;

import cn.lzjsmc.craftingplus.group.CustomGroup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class ItemQuartzAxe extends AxeItem {
    public static IItemTier iItemTier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 297;
        }

        @Override
        public float getEfficiency() {
            return 6f;
        }

        @Override
        public float getAttackDamage() {
            return 1f;
        }

        @Override
        public int getHarvestLevel() {
            return 2;
        }

        @Override
        public int getEnchantability() {
            return 27;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.EMPTY;
        }
    };
    public ItemQuartzAxe() {
        super(iItemTier, 6, -3F, new Properties().group(CustomGroup.itemGroup));
        setRegistryName("quartz_axe");
    }
}
