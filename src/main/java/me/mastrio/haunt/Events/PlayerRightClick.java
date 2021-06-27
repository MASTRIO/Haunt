package me.mastrio.haunt.Events;

import me.mastrio.haunt.Inventories.CampfireGUI;
import me.mastrio.haunt.Sanity.PlayerSanityManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class PlayerRightClick implements Listener {

  // Player right click
  @EventHandler
  public void onRightClick(PlayerInteractEvent event) {

    // Right click block
    if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {

      // If block is bed
      if (event.getClickedBlock().getType() == Material.RED_BED || event.getClickedBlock().getType() == Material.LIME_BED || event.getClickedBlock().getType() == Material.BLACK_BED || event.getClickedBlock().getType() == Material.PINK_BED || event.getClickedBlock().getType() == Material.GREEN_BED || event.getClickedBlock().getType() == Material.GRAY_BED || event.getClickedBlock().getType() == Material.ORANGE_BED || event.getClickedBlock().getType() == Material.BLUE_BED || event.getClickedBlock().getType() == Material.CYAN_BED || event.getClickedBlock().getType() == Material.LIGHT_BLUE_BED || event.getClickedBlock().getType() == Material.MAGENTA_BED || event.getClickedBlock().getType() == Material.PURPLE_BED || event.getClickedBlock().getType() == Material.WHITE_BED || event.getClickedBlock().getType() == Material.BROWN_BED || event.getClickedBlock().getType() == Material.LIGHT_GRAY_BED) {

        event.getPlayer().sendMessage(ChatColor.GOLD + "No sleep, you have to survive the night like an epic chad gamer");
        event.getPlayer().setFireTicks(20);
        PlayerSanityManager.decreaseSanity(event.getPlayer(), 5);
        event.setCancelled(true);

      }

      /*
      // Campfire GUI
      if (event.getClickedBlock().getType() == Material.CAMPFIRE || event.getClickedBlock().getType() == Material.SOUL_CAMPFIRE) {

        // If player if sneaking
        if (event.getPlayer().isSneaking()) {

          event.getPlayer().sendMessage("You clicked on the campfire, poggers"); // TEMP
          CampfireGUI campfireMenu = new CampfireGUI();
          campfireMenu.openInventory(event.getPlayer());

        }

      }
      */

      // Campfire Healing
      if (event.getClickedBlock().getType() == Material.CAMPFIRE) {

        // If player holding Birch Wood
        if (event.getPlayer().getInventory().getItemInMainHand().equals(new ItemStack(Material.BIRCH_WOOD))) {

          event.setCancelled(true);
          event.getPlayer().getInventory().remove(new ItemStack(Material.BIRCH_WOOD, 1));
          event.getPlayer().setHealth(event.getPlayer().getHealth() + 1);
          PlayerSanityManager.increaseSanity(event.getPlayer(), 10);

        }

      }

    }

  }

}
