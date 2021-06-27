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

    // Variables
    boolean stick = false;

    // Scanner
    for (int slotNumber = 0; slotNumber <= 23; slotNumber++) {

      if (player.getInventory().getItem(slotNumber).getType() == Material.STICK) {

        stick = true;

      }

    }

    // Output
    if (stick) {

      player.getInventory().removeItem(new ItemStack(Material.STICK, 1));
      player.getInventory().addItem(new ItemStack(Material.TORCH, 1));

    }

  }

  // Fire Charge
  public void fireCharge() {

    // Variables
    boolean stone = false;
    boolean sticks = false;

    // Scanner
    for (int slotNumber = 0; slotNumber <= 23; slotNumber++) {

      if (player.getInventory().getItem(slotNumber).getType() == Material.STONE) {

        stone = true;

      }

      if (player.getInventory().getItem(slotNumber).getType() == Material.STICK && player.getInventory().getItem(slotNumber).getAmount() >= 4) {

        sticks = true;

      }

    }

    // Output
    if (stone && sticks) {

      player.getInventory().removeItem(new ItemStack(Material.STONE, 1));
      player.getInventory().removeItem(new ItemStack(Material.STICK, 4));
      player.getInventory().addItem(new ItemStack(Material.TORCH, 1));

    }

  }

}
