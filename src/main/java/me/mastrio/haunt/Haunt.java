package me.mastrio.haunt;

import me.mastrio.haunt.Events.PlayerJoin;
import me.mastrio.haunt.Events.PlayerMove;
import me.mastrio.haunt.Events.PlayerRightClick;
import me.mastrio.haunt.Events.PlayerSneak;
import org.bukkit.plugin.java.JavaPlugin;

public final class Haunt extends JavaPlugin {

  // Variables
  static String loadingBar = "-----------------------------------------";

  // On Enable
  @Override
  public void onEnable() {

    // Welcome!
    System.out.println(loadingBar + "\nWelcome to the haunt, may this life be your last...\n" + loadingBar);

    // Register Events
    getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
    getServer().getPluginManager().registerEvents(new PlayerMove(), this);
    getServer().getPluginManager().registerEvents(new PlayerRightClick(), this);
    getServer().getPluginManager().registerEvents(new PlayerSneak(), this);

  }

  // On Disable
  @Override
  public void onDisable() {

    // Bye Bye
    System.out.println(loadingBar + "\nI'll be waiting for your return...\n" + loadingBar);

  }
}
