
package me.zeus.NagSpawner;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;



public class NagSpawnerCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        sender.sendMessage("§l§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=");
        sender.sendMessage("§aNagSpawner HELP: ");
        sender.sendMessage("§6 - /mobspawner <type>  -- changes type of mob spawned from     spawner");
        sender.sendMessage("§6 - /spawnmob <type> <amount> -- spawns specified mob and     amount");
        sender.sendMessage("§6 - /nagspawner -- displays help window (this)");
        sender.sendMessage("§l§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=§0=§e=");
        return false;
    }

}
