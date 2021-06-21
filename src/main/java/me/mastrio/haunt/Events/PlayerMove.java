package me.mastrio.haunt.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener {

  // Player move event
  @EventHandler
  public void onPlayerMove(PlayerMoveEvent event) {

    // Variables
    Location location = event.getPlayer().getLocation().clone();
    Block block = location.getBlock();

    // If light level too low, die
    if (block.getType() != Material.AIR || block.getType() != Material.CAVE_AIR || block.getType() != Material.VOID_AIR) {

      if (block.getLightFromSky() != 15) {

        if (block.getLightFromBlocks() <= 3) {

          event.getPlayer().sendMessage(ChatColor.RED + "You don't want to be alone in the dark...");
          event.getPlayer().setHealth(0);

        }

      }

    }

    // If sprinting
    if (event.getPlayer().isSprinting()) {

      event.getPlayer().setFoodLevel(event.getPlayer().getFoodLevel() - 1);

    }

  }

}
