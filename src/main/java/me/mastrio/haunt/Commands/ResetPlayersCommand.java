package me.mastrio.haunt.Commands;

import me.mastrio.haunt.Haunt;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ResetPlayersCommand implements CommandExecutor {

  // Run Command
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    Bukkit.broadcastMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Reset stats for all players, lol");

    for (int playerToGet = Haunt.players.size(); playerToGet >= 1; playerToGet--) {

      Bukkit.getPlayer(Haunt.players.get(playerToGet)).setFoodLevel(20);
      Bukkit.getPlayer(Haunt.players.get(playerToGet)).setFireTicks(0);
      Bukkit.getPlayer(Haunt.players.get(playerToGet)).setHealth(20);
      Bukkit.getPlayer(Haunt.players.get(playerToGet)).setLevel(0);
      Haunt.hasJoinedBefore.put(Haunt.players.get(playerToGet), false);
      Haunt.sanityMeter.put(Haunt.players.get(playerToGet), 150);

    }

    return true;

  }

}
