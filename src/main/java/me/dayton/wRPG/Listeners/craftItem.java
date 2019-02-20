package me.dayton.wRPG.Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

public class craftItem implements Listener {

	@EventHandler
	public void onCraftItem(PrepareItemCraftEvent e) {
		Recipe recipe = e.getRecipe();
		if( recipe==null ) {
			return;  // ignore non-recipe events (usually in progress)
		}
		ItemStack stack = recipe.getResult();
		Material itemType = stack.getType();
		
		// Instead of the old datavalue api, there are separate ids now:
		if (itemType == Material.MOSSY_STONE_BRICKS ) {
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
