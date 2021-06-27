package me.mastrio.haunt.Commands;

import me.mastrio.haunt.Haunt;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetSanityCommand implements CommandExecutor {

  // Run Command
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    if (sender instanceof Player) {

      Player player = (Player) sender;

      if (Haunt.sanityMeter.get(player.getUniqueId()) >= 100) {

        player.sendMessage(ChatColor.GREEN + "Your sanity is at " + Haunt.sanityMeter.get(player.getUniqueId()));

      } else if (Haunt.sanityMeter.get(player.getUniqueId()) >= 50) {

        player.sendMessage(ChatColor.YELLOW + "Your sanity is at " + Haunt.sanityMeter.get(player.getUniqueId()));

      } else {

        player.sendMessage(ChatColor.RED + "Your sanity is at " + Haunt.sanityMeter.get(player.getUniqueId()));

      }

    }

    return true;

  }

}
