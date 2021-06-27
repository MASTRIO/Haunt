package me.mastrio.haunt.Events;

import me.mastrio.haunt.Sanity.PlayerSanityManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath implements Listener {

  @EventHandler
  public void onPlayerDeath(PlayerDeathEvent event) {

    event.setDeathMessage(darknessDeathMessages(event.getEntity()));
    PlayerSanityManager.setSanity(event.getEntity(), 150);


  }

  // Darkness death messages
  public static String darknessDeathMessages(Player player) {

    int messageType = (int) ((Math.random() * ((10 - 1) + 1)) + 1);
    switch (messageType) {

      case 1 -> {

        return ChatColor.RED + "You don't want to be alone in the dark... " + player.getName();

      }

      case 2 -> {

        return ChatColor.RED + "AAAAHHH SCARY NOOOOOOOOOOO " + player.getName() + " YOU DIED";

      }

      case 3 -> {

        return ChatColor.RED + "Hey " + player.getName() + ", " + "AMONGUS!!!!!!!!!!!!";

      }

      case 4 -> {

        return ChatColor.RED + "The dark is a scary place... " + player.getName() + " found out the hard way";

      }

      case 5 -> {

        return ChatColor.RED + player.getName() + ", get haunted lol";

      }

      case 6 -> {

        return ChatColor.RED + "Hey " + player.getName() + ", you rage quit yet?";

      }

      case 7 -> {

        return ChatColor.RED + "Ah yes, the sweet sound of " + player.getName() + "'s death...";

      }

      case 8 -> {

        return ChatColor.RED + "*evil laugh* get wrecked " + player.getName();

      }

      case 9 -> {

        return ChatColor.RED + player.getName() + " self reported";

      }

      case 10 -> {

        return ChatColor.RED + "Don't stray too far out of the light " + player.getName() + "...";

      }

    }

    return "HAHA U DIED LOL";

  }

}
