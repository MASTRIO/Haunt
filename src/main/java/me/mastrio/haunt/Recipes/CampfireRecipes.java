package me.mastrio.haunt.Recipes;

import me.mastrio.haunt.Inventories.CampfireGUI;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CampfireRecipes {

  // Variables
  static ItemStack[] slot;
  static ItemStack outputSlot;

  // Craft
  public static void craft(Inventory inventory) {

    // Set Variables
    slot = new ItemStack[] {inventory.getItem(2), inventory.getItem(3), inventory.getItem(4), inventory.getItem(11), inventory.getItem(12), inventory.getItem(13), inventory.getItem(20), inventory.getItem(21), inventory.getItem(22)};
    outputSlot = inventory.getItem(16);

    // Cycle recipes
    test();

  }

  // Complete Craft
  static void completeCraft(ItemStack item) {

    if (outputSlot.getType() == null || outputSlot.getType() == Material.AIR) {

      CampfireGUI.campfireGUI.setItem(16, item);

    }

  }

  // * Recipes
  // Test
  static void test() {

    if (slot[0].getType() == Material.CAMPFIRE) {

      completeCraft(new ItemStack(Material.DRAGON_HEAD));

    }

  }

}
