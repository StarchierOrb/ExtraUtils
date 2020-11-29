package cn.lzjsmc.craftingplus.items;

import cn.lzjsmc.craftingplus.group.CustomGroup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.crafting.Ingredient;

public class ItemQuartzPick extends PickaxeItem {
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
    public ItemQuartzPick() {
        super(iItemTier, 2, -2.8F, new Properties().group(CustomGroup.itemGroup));
        setRegistryName("quartz_pickaxe");
    }
}
