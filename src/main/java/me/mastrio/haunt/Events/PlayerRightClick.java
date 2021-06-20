package me.mastrio.haunt.Events;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerRightClick implements Listener {

  // Player right click
  @EventHandler
  public void onRightClick(PlayerInteractEvent event) {

    // Right click block
    if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {

      // If block is red bed
      if (event.getClickedBlock().getType() == Material.RED_BED || event.getClickedBlock().getType() == Material.LIME_BED || event.getClickedBlock().getType() == Material.BLACK_BED || event.getClickedBlock().getType() == Material.PINK_BED || event.getClickedBlock().getType() == Material.GREEN_BED || event.getClickedBlock().getType() == Material.GRAY_BED || event.getClickedBlock().getType() == Material.ORANGE_BED || event.getClickedBlock().getType() == Material.BLUE_BED || event.getClickedBlock().getType() == Material.CYAN_BED || event.getClickedBlock().getType() == Material.LIGHT_BLUE_BED || event.getClickedBlock().getType() == Material.MAGENTA_BED || event.getClickedBlock().getType() == Material.PURPLE_BED || event.getClickedBlock().getType() == Material.WHITE_BED || event.getClickedBlock().getType() == Material.BROWN_BED || event.getClickedBlock().getType() == Material.LIGHT_GRAY_BED) {

        event.getPlayer().sendMessage(ChatColor.GOLD + "You have to survive the night like an epic chad");
        event.setCancelled(true);

      }

    }

  }

}
