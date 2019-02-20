package me.dayton.wRPG.UI.Rules;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.dayton.wRPG.Utils;
import me.dayton.wRPG.UI.MainUI;

public class RulesUI {
	public static Inventory rules;
	public static String rulesName;
	public static int rulesRows = 2 * 9;

	public static void initalize() {
		rulesName = Utils.chat("&8Rules");
		rules = Bukkit.createInventory(null, rulesRows);
	}

	public static Inventory rulesUI(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, rulesRows, rulesName);
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 1, " ");
		Utils.createItem(rules, "BOOK", 1, 2, "&7wRPG", "&d- No Hacked Clients", "&d- No X-Ray", "&d- Raiding is allowed", "&d- Griefing is allowed", "&d- No swearing", "&d- No chat spam");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 3, " ");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 4, " ");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 5, " ");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 6, " ");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 7, " ");
		Utils.createItem(rules, "BOOK", 1, 8, "&7wRPG", "&d- No Hacked Clients", "&d- No X-Ray", "&d- Raiding is allowed", "&d- Griefing is allowed", "&d- No swearing", "&d- No chat spam");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 9, " ");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 10, " ");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 11, " ");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 12, " ");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 13, " ");
		Utils.createItem(rules, "GRAY_STAINED_GLASS_PANE", 1, 14, "&7Go back");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 15, " ");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 16, " ");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 17, " ");
		Utils.createItem(rules, "BLACK_STAINED_GLASS_PANE", 1, 18, " ");

		toReturn.setContents(rules.getContents());
		return toReturn;
	}

	public static void clicked(Player p, int slot, ItemStack clicked, Inventory rulesUI) {
		// If player clicks "Recipes"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7wRPG"))) {
			p.closeInventory();
		}
		// If player clicks "Go back"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Go back"))) {
			p.openInventory(MainUI.mmUI(p));
		}
	}
}
