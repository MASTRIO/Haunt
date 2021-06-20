package me.mastrio.haunt.Events;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

  // On Player Join
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {

    // Welcome player
    event.getPlayer().sendMessage(ChatColor.RED + "Welcome " + event.getPlayer().getName() + " to the haunt!");

  }

}
