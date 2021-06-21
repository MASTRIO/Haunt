package me.mastrio.haunt.Events;

import me.mastrio.haunt.Haunt;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

  // On Player Join
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {

    // Welcome player
    event.setJoinMessage(event.getPlayer().getDisplayName() + " has entered the haunt");
    event.getPlayer().sendMessage(ChatColor.RED + "You feel haunted by an unknown presence...");

    // Add player to player list
    Haunt.players.put(Haunt.players.size() + 1, event.getPlayer().getUniqueId());

  }

}
