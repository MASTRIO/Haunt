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
    int messageType = (int) ((Math.random() * ((10 - 1) + 1)) + 1);
    switch (messageType) {

      case 1 -> {

        event.setJoinMessage(ChatColor.YELLOW + event.getPlayer().getName() + " has entered the haunt");

      }

      case 2 -> {

        event.setJoinMessage(ChatColor.YELLOW + event.getPlayer().getName() + " is kinda sus ngl");

      }

      case 3 -> {

        event.setJoinMessage(ChatColor.YELLOW + event.getPlayer().getName() + " vented in electrical");

      }

      case 4 -> {

        event.setJoinMessage(ChatColor.YELLOW + event.getPlayer().getName() + " joined the Discord VC");

      }

      case 5 -> {

        event.setJoinMessage(ChatColor.YELLOW + "Welcome " + event.getPlayer().getName() + " to the haunt, may this life be your last...");

      }

      case 6 -> {

        event.setJoinMessage(ChatColor.YELLOW + event.getPlayer().getName() + " is about to have a bad time");

      }

      case 7 -> {

        event.setJoinMessage(ChatColor.YELLOW + event.getPlayer().getName() + " was the impostor");

      }

      case 8 -> {

        event.setJoinMessage(ChatColor.YELLOW + event.getPlayer().getName() + event.getPlayer().getName() + event.getPlayer().getName() + event.getPlayer().getName() + event.getPlayer().getName() + event.getPlayer().getName() + event.getPlayer().getName() + event.getPlayer().getName() + event.getPlayer().getName() + event.getPlayer().getName());

      }

      case 9 -> {

        event.setJoinMessage(ChatColor.YELLOW + event.getPlayer().getName() + " regrets joining this server");

      }

      case 10 -> {

        event.setJoinMessage(ChatColor.YELLOW + event.getPlayer().getName() + " is not subscribed to Technoblade >:(");

      }

    }

    // Add player to player list
    Haunt.players.put(Haunt.players.size() + 1, event.getPlayer().getUniqueId());

  }

}
