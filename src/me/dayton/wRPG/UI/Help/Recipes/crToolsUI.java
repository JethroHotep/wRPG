package me.dayton.wRPG.UI.Help.Recipes;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.dayton.wRPG.Utils;
import me.dayton.wRPG.UI.Help.RecipesUI;

public class crToolsUI {
	public static Inventory crTools;
	public static String crToolsName;
	public static int crToolsRows = 2 * 9;

	public static void initalize() {
		crToolsName = Utils.chat("&8Tools Crafting Recipes");
		crTools = Bukkit.createInventory(null, crToolsRows);
	}

	public static Inventory ToolsUI(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, crToolsRows, crToolsName);

		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 1, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 2, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 3, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 4, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 5, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 6, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 7, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 8, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 9, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 10, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 11, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 12, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 13, " ");
		Utils.createItem(crTools, "GRAY_STAINED_GLASS_PANE", 1, 14, "&7Go back");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 15, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 16, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 17, " ");
		Utils.createItem(crTools, "BLACK_STAINED_GLASS_PANE", 1, 18, " ");

		toReturn.setContents(crTools.getContents());
		return toReturn;
	}

	public static void clicked(Player p, int slot, ItemStack clicked, Inventory crToolsUI) {
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat(""))) {

		}
		// If player clicks "Go back"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Go back"))) {
			p.openInventory(RecipesUI.crUI(p));
		}
	}
}
