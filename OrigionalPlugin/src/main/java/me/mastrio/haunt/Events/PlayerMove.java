package me.mastrio.haunt.Events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.Map;

public class PlayerMove implements Listener {

  // Player move event
  @EventHandler
  public void onPlayerMove(PlayerMoveEvent event) {

    // Variables
    Location location = event.getPlayer().getLocation().clone();
    Block block = location.getBlock();

    // If light level too low, die
    if (block.getType() != Material.AIR || block.getType() != Material.CAVE_AIR || block.getType() != Material.VOID_AIR) {

      if (event.getPlayer().getWorld().getTime() <= 23850 && event.getPlayer().getWorld().getTime() >= 12300) {

        if (block.getLightFromBlocks() <= 3) {

          // Lose health
          int chanceToLoseHealth = (int) ((Math.random() * ((5 - 1) + 1)) + 1);
          if (chanceToLoseHealth == 1) {

            event.getPlayer().setHealth(event.getPlayer().getHealth() - 1);

          }

          // Make the player actually die
          if (event.getPlayer().getHealth() <= 2) {

            event.getPlayer().setHealth(0);

          }

        }

      }

    }

    // If sprinting
    if (event.getPlayer().isSprinting()) {

      int chanceToLoseHunger = (int) ((Math.random() * ((3 - 1) + 1)) + 1);
      if (chanceToLoseHunger == 1) {

        event.getPlayer().setFoodLevel(event.getPlayer().getFoodLevel() - 1);

      }

    }

  }

}
