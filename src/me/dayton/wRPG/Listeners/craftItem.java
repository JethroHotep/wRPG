package me.dayton.wRPG.Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

public class craftItem implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onCraftItem(PrepareItemCraftEvent e) {
		Material itemType = e.getRecipe().getResult().getType();
		Byte itemData = e.getRecipe().getResult().getData().getData();
		if (itemType == Material.STONE_BRICKS && itemData == 1) {
			e.getInventory().setResult(new ItemStack(Material.AIR));
		}

		if (itemType == Material.OAK_PRESSURE_PLATE) {
			e.getInventory().setResult(new ItemStack(Material.AIR));
		}

		if (itemType == Material.STONE_BUTTON) {

			e.getInventory().setResult(new ItemStack(Material.AIR));
		}

		if (itemType == Material.CRAFTING_TABLE) {
			e.getInventory().setResult(new ItemStack(Material.AIR));
		}
	}
}
