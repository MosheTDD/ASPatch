package me.moshe.aspatch;

import me.moshe.aspatch.listeners.PlayerInteractListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ASPatch extends JavaPlugin {

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new PlayerInteractListener(this), this);
    }
}
