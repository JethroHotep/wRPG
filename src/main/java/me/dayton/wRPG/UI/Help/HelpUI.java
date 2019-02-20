package me.dayton.wRPG.UI.Help;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.dayton.wRPG.Utils;
import me.dayton.wRPG.UI.MainUI;

public class HelpUI {
	public static Inventory help;
	public static String helpName;
	public static int helpRows = 2 * 9;

	public static void initalize() {
		helpName = Utils.chat("&8Help Menu");
		help = Bukkit.createInventory(null, helpRows);
	}

	public static Inventory helpUI(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, helpRows, helpName);

		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 1, " ");
		Utils.createItem(help, "CRAFTING_TABLE", 1, 2, "&7Recipes", "&7View custom crafting recipes");
		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 3, " ");
		Utils.createItem(help, "ENCHANTED_BOOK", 1, 4, "&7Tips & Tricks", "&7View useful information");
		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 5, " ");
		Utils.createItem(help, "WITHER_SKELETON_SKULL", 1, 6, "&7Mobs", "&7View information about custom mobs");
		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 7, " ");
		Utils.createItem(help, "FLINT", 1, 8, "&7Discord", "&7Link to our discord server!");
		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 9, " ");
		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 10, " ");
		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 11, " ");
		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 12, " ");
		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 13, " ");
		Utils.createItem(help, "GRAY_STAINED_GLASS_PANE", 1, 14, "&7Go back");
		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 15, " ");
		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 16, " ");
		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 17, " ");
		Utils.createItem(help, "BLACK_STAINED_GLASS_PANE", 1, 18, " ");

		toReturn.setContents(help.getContents());
		return toReturn;
	}

	public static void clicked(Player p, int slot, ItemStack clicked, Inventory helpUI) {
		// If player clicks "Tips and Trick"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Discord"))) {
			p.sendMessage("configuitl discord message");
		}
		// If player clicks "Tips and Trick"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Mobs"))) {
			p.sendMessage("Open mobUI");
		}
		// If player clicks "Tips and Trick"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Tips & Tricks"))) {
			p.sendMessage("Open ttUI");
		}
		// If player clicks "Recipes"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Recipes"))) {
			p.openInventory(RecipesUI.crUI(p));
		}
		// If player clicks "Go back"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Go back"))) {
			p.openInventory(MainUI.mmUI(p));
		}
	}
}
