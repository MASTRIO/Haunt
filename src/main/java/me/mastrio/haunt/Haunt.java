package me.mastrio.haunt;

import me.mastrio.haunt.Commands.ResetPlayersCommand;
import me.mastrio.haunt.Events.PlayerJoin;
import me.mastrio.haunt.Events.PlayerMove;
import me.mastrio.haunt.Events.PlayerRightClick;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.HashMap;
import java.util.UUID;

public class Haunt extends JavaPlugin {

  // Variables
  static String loadingBar = "-----------------------------------------";
  public static HashMap<Integer, UUID> players = new HashMap<>();

  // On Enable
  @Override
  public void onEnable() {

    // Welcome!
    System.out.println(loadingBar + "\nWelcome to the haunt, may this life be your last...\n" + loadingBar);

    // Register Events
    getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
    getServer().getPluginManager().registerEvents(new PlayerMove(), this);
    getServer().getPluginManager().registerEvents(new PlayerRightClick(), this);

    // Register Commands
    this.getCommand("resetplayers").setExecutor(new ResetPlayersCommand());

  }

  // On Disable
  @Override
  public void onDisable() {

    // Bye Bye
    System.out.println(loadingBar + "\nI'll be waiting for your return...\n" + loadingBar);

  }
}
