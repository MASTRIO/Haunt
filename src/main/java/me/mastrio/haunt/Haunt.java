package me.mastrio.haunt;

import me.mastrio.haunt.Commands.GetSanityCommand;
import me.mastrio.haunt.Commands.ResetPlayersCommand;
import me.mastrio.haunt.Events.*;
import me.mastrio.haunt.Inventories.CampfireGUI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.HashMap;
import java.util.UUID;

public class Haunt extends JavaPlugin {

  // Variables
  static String loadingBar = "-----------------------------------------";
  public static HashMap<Integer, UUID> players = new HashMap<>();
  public static HashMap<UUID, Integer> sanityMeter = new HashMap<>();
  public static HashMap<UUID, Boolean> hasJoinedBefore = new HashMap<>();

  // On Enable
  @Override
  public void onEnable() {

    // Welcome!
    System.out.println(loadingBar + "\nWelcome to the haunt, may this life be your last...");

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
    this.getCommand("sanity").setExecutor(new GetSanityCommand());

    // Set Sanity
    System.out.println("Setting up sanity meters");

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

}
