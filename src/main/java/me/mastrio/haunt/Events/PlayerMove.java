package me.mastrio.haunt.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener {

  // Player move event
  @EventHandler
  public void onPlayerMove(PlayerMoveEvent event) {

    // Variables
    Location location = event.getPlayer().getLocation().clone().subtract(0, 1, 0);
    Block block = location.getBlock();
    int theBlock = 15;

    // If light level too low, die
    if (!(block.getType() == Material.AIR || block.getType() == Material.CAVE_AIR || block.getType() == Material.VOID_AIR)) {

      if (location != null) {

        theBlock = location.getBlock().getLightLevel();

      }

      if (!(theBlock == 0)) {

        event.getPlayer().sendMessage(String.valueOf(block.getLightLevel()));
        event.getPlayer().sendMessage(ChatColor.RED + "The dark is a scary place...");
        event.getPlayer().setHealth(0);

      }

    }

  }

}
