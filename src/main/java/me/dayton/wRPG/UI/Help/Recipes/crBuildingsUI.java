package me.dayton.wRPG.UI.Help.Recipes;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.dayton.wRPG.Utils;
import me.dayton.wRPG.UI.Help.RecipesUI;

public class crBuildingsUI {
	public static Inventory crBuildings;
	public static String crBuildingsName;
	public static int crBuildingsRows = 2 * 9;

	public static void initalize() {
		crBuildingsName = Utils.chat("&8Building Blocks Crafting Recipes");
		crBuildings = Bukkit.createInventory(null, crBuildingsRows);
	}

	public static Inventory BuildingsUI(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, crBuildingsRows, crBuildingsName);

		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 1, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 2, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 3, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 4, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 5, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 6, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 7, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 8, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 9, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 10, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 11, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 12, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 13, " ");
		Utils.createItem(crBuildings, "GRAY_STAINED_GLASS_PANE", 1, 14, "&7Go back");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 15, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 16, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 17, " ");
		Utils.createItem(crBuildings, "BLACK_STAINED_GLASS_PANE", 1, 18, " ");

		toReturn.setContents(crBuildings.getContents());
		return toReturn;
	}

	public static void clicked(Player p, int slot, ItemStack clicked, Inventory crBuildingsUI) {
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat(""))) {
			
		}
		// If player clicks "Go back"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Go back"))) {
			p.openInventory(RecipesUI.crUI(p));
		}
	}
}
