package cn.lzjsmc.craftingplus.items;

import cn.lzjsmc.craftingplus.group.CustomGroup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.crafting.Ingredient;

public class ItemObsidianPick extends PickaxeItem {
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
    public ItemObsidianPick() {
        super(iItemTier, 3, -3f, new Properties().group(CustomGroup.itemGroup));
        setRegistryName("obsidian_pickaxe");
    }
}
