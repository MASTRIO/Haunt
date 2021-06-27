package me.mastrio.haunt.Sanity;

import me.mastrio.haunt.Haunt;
import org.bukkit.entity.Player;

public class PlayerSanityManager {

  // Increase sanity
  public static void increaseSanity(Player player, int amount) {

    Haunt.sanityMeter.put(player.getPlayer().getUniqueId(), (Haunt.sanityMeter.get(player.getUniqueId()) + amount));

  }

  // Decrease sanity
  public static void decreaseSanity(Player player, int amount) {

    Haunt.sanityMeter.put(player.getPlayer().getUniqueId(), (Haunt.sanityMeter.get(player.getUniqueId()) - amount));

  }

  // Set sanity
  public static void setSanity(Player player, int amount) {

    Haunt.sanityMeter.put(player.getPlayer().getUniqueId(), amount);

  }

  // Get sanity
  public static int getSanity(Player player) {

    return Haunt.sanityMeter.get(player.getUniqueId());

  }

}
