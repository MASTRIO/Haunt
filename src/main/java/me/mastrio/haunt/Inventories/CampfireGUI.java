package me.mastrio.haunt.Inventories;

import me.mastrio.haunt.Recipes.CampfireRecipeManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Collections;

public class CampfireGUI implements Listener {

  // Variables
  public static Inventory campfireGUI;

  // Constructor
  public CampfireGUI() {

    // Creates the campfire GUI
    campfireGUI = Bukkit.createInventory(null, 27, "Campfire");

    // Put the items into the inventory
    initializeItems();

  }

  // You can call this whenever you want to put the items in
  public void initializeItems() {

    // Row 1
    campfireGUI.addItem(createCampfireRecipe(Material.TORCH, 1, "Torch", "An easy way to craft torches", "Stick x1"));
    campfireGUI.addItem(createCampfireRecipe(Material.FIRE_CHARGE, 3, "Fire Charge", "A perfect temporary torch", "Stone x1, Sticks x4"));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));

    // Row 2
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));
    campfireGUI.addItem(new ItemStack(Material.AIR));

    // Row 3
    campfireGUI.addItem(newGUIitem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, "", ""));
    campfireGUI.addItem(newGUIitem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, "", ""));
    campfireGUI.addItem(newGUIitem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, "", ""));
    campfireGUI.addItem(newGUIitem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, "", ""));
    campfireGUI.addItem(newGUIitem(Material.RED_STAINED_GLASS_PANE, "Close", ""));
    campfireGUI.addItem(newGUIitem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, "", ""));
    campfireGUI.addItem(newGUIitem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, "", ""));
    campfireGUI.addItem(newGUIitem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, "", ""));
    campfireGUI.addItem(newGUIitem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, "", ""));

  }

  // GUI Item
  protected ItemStack newGUIitem(final Material material, final String name, final String lore) {

    final ItemStack item = new ItemStack(material, 1);
    final ItemMeta meta = item.getItemMeta();

    // Set the name of the item
    meta.setDisplayName(name);

    // Set the lore of the item
    meta.setLore(Arrays.asList(lore));

    item.setItemMeta(meta);

    return item;

  }

  // Create Campfire Recipe
  protected ItemStack createCampfireRecipe(Material icon, int amount, String recipeName, String description, String materialsNeeded) {

    final ItemStack item = new ItemStack(icon, amount);
    final ItemMeta meta = item.getItemMeta();

    // Set the name of the item
    meta.setDisplayName(recipeName);

    // Set the lore of the item
    meta.setLore(Collections.singletonList(description + "\n\nMaterials Required:\n" + materialsNeeded));

    item.setItemMeta(meta);

    return item;

  }

  // You can open the inventory with this
  public void openInventory(final HumanEntity player) {

    player.openInventory(campfireGUI);

  }

  // Check for clicks on items
  @EventHandler
  public void onInventoryClick(final InventoryClickEvent event) {

    // Cancel stuff
    if (event.getInventory() != campfireGUI) return;
    event.setCancelled(true);
    final ItemStack clickedItem = event.getCurrentItem();
    if (clickedItem == null || clickedItem.getType().isAir()) return;
    final Player player = (Player) event.getWhoClicked();

    // TEMP
    player.sendMessage("You clicked at slot " + event.getRawSlot());

    // Close inventory
    if (event.getRawSlot() == 22) {

      event.getWhoClicked().closeInventory();

    }

    // Recipe Manager
    CampfireRecipeManager recipeManager = new CampfireRecipeManager(event.getWhoClicked());

    switch (event.getRawSlot()) {

      // Torch
      case 0 -> {

        recipeManager.torch();

      }

      // Fire Charge
      case 1 -> {

        recipeManager.fireCharge();

      }

    }

  }

  // Cancel dragging in our inventory
  @EventHandler
  public void onInventoryClick(final InventoryDragEvent event) {

    if (event.getInventory().equals(campfireGUI)) {

      event.setCancelled(true);

    }

  }

}
