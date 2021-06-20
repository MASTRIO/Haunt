package me.mastrio.haunt.Events;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class PlayerSneak implements Listener {

  // Player Sneak
  @EventHandler
  public void onPlayerSneak(PlayerToggleSneakEvent event) {

    // Variables
    Location location = event.getPlayer().getLocation().clone().subtract(0, 1, 0);
    Block block = location.getBlock();

    // If block below is respawn anchor
    if (block.getType() == Material.RESPAWN_ANCHOR) {

      event.getPlayer().setBedSpawnLocation(event.getPlayer().getLocation());
      event.getPlayer().sendMessage(ChatColor.GREEN + "Horray, you managed to set your spawn... damn it");

    }

  }

}
