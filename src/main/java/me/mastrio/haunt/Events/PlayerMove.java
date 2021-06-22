package me.mastrio.haunt.Events;

import me.mastrio.haunt.Haunt;
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
    Location location = event.getPlayer().getLocation().clone();
    Block block = location.getBlock();

    // If light level too low, die
    if (block.getType() != Material.AIR || block.getType() != Material.CAVE_AIR || block.getType() != Material.VOID_AIR) {

      if (block.getLightFromSky() != 15) {

        if (block.getLightFromBlocks() <= 3) {

          Haunt.darknessDeathMessages(event.getPlayer());

          Haunt.randomNumber = (int) ((Math.random() * ((3 - 1) + 1)) + 1);
          if (Haunt.randomNumber == 1) {

            event.getPlayer().setHealth(event.getPlayer().getHealth() - 1);

          }

        }

      }

    }

    // If sprinting
    if (event.getPlayer().isSprinting()) {

      Haunt.randomNumber = (int) ((Math.random() * ((3 - 1) + 1)) + 1);
      if (Haunt.randomNumber == 1) {

        event.getPlayer().setFoodLevel(event.getPlayer().getFoodLevel() - 1);

      }

    }

  }

}
