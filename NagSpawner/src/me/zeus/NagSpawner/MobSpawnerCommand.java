
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
                        switch (args[0])
                        {
                        case "cow":
                            spawner.setSpawnedType(EntityType.COW);
                            spawner.update();
                            break;
                        case "pig":
                            spawner.setSpawnedType(EntityType.PIG);
                            spawner.update();
                            break;
                        case "chicken":
                            spawner.setSpawnedType(EntityType.CHICKEN);
                            spawner.update();
                            break;
                        case "sheep":
                            spawner.setSpawnedType(EntityType.SHEEP);
                            spawner.update();
                            break;
                        case "wolf":
                            spawner.setSpawnedType(EntityType.WOLF);
                            spawner.update();
                            break;
                        case "arrow":
                            spawner.setSpawnedType(EntityType.ARROW);
                            spawner.update();
                            break;
                        case "bat":
                            spawner.setSpawnedType(EntityType.BAT);
                            spawner.update();
                            break;
                        case "blaze":
                            spawner.setSpawnedType(EntityType.BLAZE);
                            spawner.update();
                            break;
                        case "cavespider":
                            spawner.setSpawnedType(EntityType.CAVE_SPIDER);
                            spawner.update();
                            break;
                        case "creeper":
                            spawner.setSpawnedType(EntityType.CREEPER);
                            spawner.update();
                            break;
                        case "endercrystal":
                            spawner.setSpawnedType(EntityType.ENDER_CRYSTAL);
                            spawner.update();
                            break;
                        case "enderdragon":
                            spawner.setSpawnedType(EntityType.ENDER_DRAGON);
                            spawner.update();
                            break;
                        case "enderman":
                            spawner.setSpawnedType(EntityType.ENDERMAN);
                            spawner.update();
                            break;
                        case "ghast":
                            spawner.setSpawnedType(EntityType.GHAST);
                            spawner.update();
                            break;
                        case "giant":
                            spawner.setSpawnedType(EntityType.GIANT);
                            spawner.update();
                            break;
                        case "golem":
                            spawner.setSpawnedType(EntityType.IRON_GOLEM);
                            spawner.update();
                            break;
                        case "snowman":
                            spawner.setSpawnedType(EntityType.SNOWMAN);
                            spawner.update();
                            break;
                        case "magmacube":
                            spawner.setSpawnedType(EntityType.MAGMA_CUBE);
                            spawner.update();
                            break;
                        case "slime":
                            spawner.setSpawnedType(EntityType.SLIME);
                            spawner.update();
                            break;
                        case "ocelot":
                            spawner.setSpawnedType(EntityType.OCELOT);
                            spawner.update();
                            break;
                        case "pigman":
                            spawner.setSpawnedType(EntityType.PIG_ZOMBIE);
                            spawner.update();
                            break;
                        case "tnt":
                            spawner.setSpawnedType(EntityType.PRIMED_TNT);
                            spawner.update();
                            break;
                        case "spider":
                            spawner.setSpawnedType(EntityType.SPIDER);
                            spawner.update();
                            break;
                        case "squid":
                            spawner.setSpawnedType(EntityType.SQUID);
                            spawner.update();
                            break;
                        case "villager":
                            spawner.setSpawnedType(EntityType.VILLAGER);
                            spawner.update();
                            break;
                        case "witch":
                            spawner.setSpawnedType(EntityType.WITCH);
                            spawner.update();
                            break;
                        case "wither":
                            spawner.setSpawnedType(EntityType.WITHER);
                            spawner.update();
                            break;
                        }
                        sender.sendMessage("§7[§eNagSpawner§7]§a Set spawner type to: " + args[0]);
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
