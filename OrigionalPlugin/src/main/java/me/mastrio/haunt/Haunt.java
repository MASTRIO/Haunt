package me.mastrio.haunt;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mastrio.haunt.Commands.ResetPlayersCommand;
import me.mastrio.haunt.Events.*;
import me.mastrio.haunt.Inventories.CampfireGUI;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.HashMap;
import java.util.UUID;

public class Haunt extends JavaPlugin implements SlimefunAddon {

  // Variables
  static String loadingBar = "-----------------------------------------";
  public static HashMap<Integer, UUID> players = new HashMap<>();
  public static HashMap<UUID, Boolean> hasJoinedBefore = new HashMap<>();

  // On Enable
  @Override
  public void onEnable() {

    // Welcome!
    System.out.println(loadingBar + "\nWelcome to the haunt, may this life be your last...");

    // Register Catagories
    System.out.println("Registering Slimefun catagories");
    NamespacedKey hauntCategoryId = new NamespacedKey(this, "Haunt");
    CustomItem hauntCategoryItem = new CustomItem(Material.WITHER_SKELETON_SKULL, "Haunt");
    Category hauntCatagory = new Category(hauntCategoryId, hauntCategoryItem);

    // Register Custom Items
    System.out.println("Registering Custom items");
    SlimefunItem bonfireItem = new SlimefunItem(hauntCatagory, new SlimefunItemStack("BONFIRE", Material.CAMPFIRE, "Bonfire", "", "Like a normal campfire,", "but it applies a light healing effect"), RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
      null, new ItemStack(Material.STONE_SLAB), null,
      new ItemStack(Material.STONE_SLAB), new ItemStack(Material.CAMPFIRE), new ItemStack(Material.STONE_SLAB),
      null, new ItemStack(Material.STONE_SLAB), null
    });

    // Register Events
    System.out.println("Registering Events");
    getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
    getServer().getPluginManager().registerEvents(new PlayerMove(), this);
    getServer().getPluginManager().registerEvents(new PlayerRightClick(), this);
    getServer().getPluginManager().registerEvents(new PlayerDeath(), this);
    getServer().getPluginManager().registerEvents(new BlockPlaced(), this);
    getServer().getPluginManager().registerEvents(new CampfireGUI(), this);

    // Register Commands
    System.out.println("Registering Commands");
    this.getCommand("resetplayers").setExecutor(new ResetPlayersCommand());

    // Recipe Managers
    System.out.println("Initializing CampfireRecipeManager");

    // GUI's
    System.out.println("Initializing CampfireGUI");

    // Close
    System.out.println(loadingBar);

  }

  // On Disable
  @Override
  public void onDisable() {

    // Bye Bye
    System.out.println(loadingBar + "\nI'll be waiting for your return...\n" + loadingBar);

  }

  // Boring Slimefun thing
  @Override
  public JavaPlugin getJavaPlugin() {
    return this;
  }

  // Bug tracker stuff
  @Override
  public String getBugTrackerURL() {
    return null;
  }

}
