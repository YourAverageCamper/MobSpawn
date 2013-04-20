
package me.zeus.NagSpawner;


import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;



public class SpawnMobCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender instanceof Player)
        {
            if (sender.hasPermission("nagspawner.mobspawn"))
            {
                if (args.length >= 2)
                {
                    Player p = (Player) sender;
                    Location loc = p.getTargetBlock(null, 50).getLocation();
                    Location newLoc = new Location(loc.getWorld(), loc.getX(), loc.getY() + 3, loc.getZ());
                    for (EntityType et : EntityType.values())
                    {
                        if (args[0].equalsIgnoreCase(et.toString().replace("_", "")))
                        {
                            try
                            {
                                int abc = 0;
                                while (abc < Integer.parseInt(args[1]))
                                {
                                    abc++;
                                    p.getWorld().spawnEntity(newLoc, et);
                                }
                            } catch (NumberFormatException nfe)
                            {
                                sender.sendMessage("§7[§eNagSpawner§7] §4Not a valid number!");
                                return false;
                            }
                        }
                    }
                } else
                {
                    sender.sendMessage("§7[§eNagSpawner§7] §4Not enough args!");
                    return false;
                }
            } else
            {
                sender.sendMessage("§7[§eNagSpawner§7] §4 You don't have permission to spawn mobs!");
                return false;
            }
        } else
        {
            sender.sendMessage("§7[§eNagSpawner§7] §4 You must be a player to spawn mobs!");
            return false;
        }
        return false;
    }
}
