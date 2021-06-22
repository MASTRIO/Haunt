package me.mastrio.haunt.Events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlaced implements Listener {

  // On block placed
  @EventHandler
  public void onBlockPlaced(BlockPlaceEvent event) {

    // Stop the player from placing torches
    if (event.getBlock().getType() == Material.TORCH) {

      event.setCancelled(true);

    }

  }

}
