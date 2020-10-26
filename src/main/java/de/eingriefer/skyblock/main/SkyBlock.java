package de.eingriefer.skyblock.main;

import de.eingriefer.skyblock.events.PickupListener;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SkyBlock extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();

        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new PickupListener(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}
