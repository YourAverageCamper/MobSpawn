
package me.zeus.NagSpawner;


import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;



public class MobSpawnerCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender instanceof Player)
        {
            if (sender.hasPermission("nagspawner.mobspawner"))
            {
                if (args.length >= 1)
                {
                    Block b = ((Player) sender).getTargetBlock(null, 50);
                    if (b != null && b.getType() != null && b.getType().equals(Material.MOB_SPAWNER))
                    {
                        CreatureSpawner spawner = (CreatureSpawner) b.getState();
                        for (EntityType e : EntityType.values())
                        {
                            if (args[0].equals(e.toString().replace("_", "").toLowerCase()))
                            {
                                spawner.setSpawnedType(e);
                                spawner.update();
                                sender.sendMessage("§7[§eNagSpawner§7]§a Set spawner type to: " + args[0]);
                            }
                        }
                    }

                } else
                {
                    sender.sendMessage("§7[§eNagSpawner§7]§4 You must specify an entity to spawn!");
                    return false;
                }
            } else
            {
                sender.sendMessage("§7[§eNagSpawner§7]§4 You don't have permission to change mob spawners!");
                return false;
            }
        } else
        {
            sender.sendMessage("§7[§eNagSpawner§7]§4 You must be a player to change mob spawners!");
            return false;
        }
        return false;
    }
}
