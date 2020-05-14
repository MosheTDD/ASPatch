package me.moshe.aspatch.listeners;

import me.moshe.aspatch.ASPatch;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {
    private ASPatch plugin;
    public PlayerInteractListener(ASPatch plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        if(e.getPlayer().hasPermission("aspatch.bypass"))return;
        if (e.getItem() != null) {
            if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (e.getItem().getType() == Material.ARMOR_STAND) {
                    e.setCancelled(true);
                    return;
                }
            }
        }
    }

    @EventHandler
    public void onStandInteract(PlayerArmorStandManipulateEvent e){
        if(e.getPlayer().hasPermission("aspatch.bypass"))return;
        e.setCancelled(true);
    }
}
