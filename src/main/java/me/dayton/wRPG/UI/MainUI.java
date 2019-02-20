package me.dayton.wRPG.UI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.dayton.wRPG.Utils;
import me.dayton.wRPG.UI.Commands.CommandsUI;
import me.dayton.wRPG.UI.Help.HelpUI;
import me.dayton.wRPG.UI.Rules.RulesUI;

public class MainUI {
	public static Inventory mm;
	public static String mmName;
	public static int mmRows = 1 * 9;

	public static void initalize() {
		mmName = Utils.chat("&8Main Menu");
		mm = Bukkit.createInventory(null, mmRows);
	}

	public static Inventory mmUI(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, mmRows, mmName);
		Utils.createItem(mm, "BLACK_STAINED_GLASS_PANE", 1, 1, " ");
		Utils.createItem(mm, "BOOK", 1, 2, "&7Commands", "&7View server commands");
		Utils.createItem(mm, "BLACK_STAINED_GLASS_PANE", 1, 3, " ");
		Utils.createItem(mm, "CRAFTING_TABLE", 1, 4, "&7Guides", "&7View server guides");
		Utils.createItem(mm, "BLACK_STAINED_GLASS_PANE", 1, 5, " ");
		Utils.createItem(mm, "COMPASS", 1, 6, "&7Statistics", "&7View player statistics");
		Utils.createItem(mm, "BLACK_STAINED_GLASS_PANE", 1, 7, " ");
		Utils.createItem(mm, "WOODEN_SWORD", 1, 8, "&7Rules", "&7View server rules");
		Utils.createItem(mm, "BLACK_STAINED_GLASS_PANE", 1, 9, " ");

		toReturn.setContents(mm.getContents());
		return toReturn;
	}

	public static void clicked(Player p, int slot, ItemStack clicked, Inventory mmUI) {
		// If player clicks "Commands"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Commands"))) {
			p.openInventory(CommandsUI.cmdUI(p));
		}
		// If player clicks "Guides"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Guides"))) {
			p.openInventory(HelpUI.helpUI(p));
		}
		// If player clicks "Statistics"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Statistics"))) {
			p.sendMessage(Utils.chat("&8[&bwRPG&8]&7 Feature coming soon!"));
			p.closeInventory();
		}
		// If player clicks "Rules"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Rules"))) {
			p.openInventory(RulesUI.rulesUI(p));
		}
	}
}
