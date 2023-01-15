package damascus.damascus;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterials {

    public static final Hammer HAMMER = new Hammer();

    private static class Hammer implements ToolMaterial {

        @Override
        public int getDurability() {
            return 500;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 0;
        }

        @Override
        public float getAttackDamage() {
            return 3;
        }

        @Override
        public int getMiningLevel() {
            return 0;
        }

        @Override
        public int getEnchantability() {
            return 0;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(itemDefenitions.TUNGSTEN_INGOT);
        }
    }
}
