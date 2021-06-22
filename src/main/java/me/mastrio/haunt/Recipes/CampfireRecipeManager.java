package me.mastrio.haunt.Recipes;

import me.mastrio.haunt.Inventories.CampfireGUI;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CampfireRecipeManager {

  // Variables
  private final HumanEntity player;

  // Init
  public CampfireRecipeManager(HumanEntity user) {

    this.player = user;

  }

  // * Recipes
  // Torch
  public void torch() {

    for (int slotNumber = 0; slotNumber <= 23; slotNumber++) {

      if (player.getInventory().getItem(slotNumber).getType() == Material.STICK) {

        player.getInventory().removeItem(new ItemStack(Material.STICK, 1));
        player.getInventory().addItem(new ItemStack(Material.TORCH, 1));

      }

    }

  }

}
