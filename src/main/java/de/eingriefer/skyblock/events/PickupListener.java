package de.eingriefer.skyblock.events;

import de.eingriefer.skyblock.utils.ItemDescription;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PickupListener implements Listener {

    @EventHandler
    public void onPickup(PlayerPickupItemEvent e) {

        ItemStack item = e.getItem().getItemStack();
        ItemMeta meta = item.getItemMeta();
        meta.setLore(ItemDescription.getDescription(item.getType()));
        item.setItemMeta(meta);
        e.getItem().setItemStack(item);

    }

}
