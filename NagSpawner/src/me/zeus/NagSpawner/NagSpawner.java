
package me.zeus.NagSpawner;


import org.bukkit.plugin.java.JavaPlugin;



public class NagSpawner extends JavaPlugin {

    @Override
    public void onEnable()
    {
        getCommand("mobspawner").setExecutor(new MobSpawnerCommand());
        getCommand("spawnmob").setExecutor(new SpawnMobCommand());
        getCommand("nagspawner").setExecutor(new NagSpawnerCommand());
    }

}
