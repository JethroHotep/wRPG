package me.dayton.wRPG.UI.Commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.dayton.wRPG.Utils;
import me.dayton.wRPG.UI.MainUI;
import me.dayton.wRPG.UI.Help.RecipesUI;

public class CommandsUI {
	public static Inventory cmd;
	public static String cmdName;
	public static int cmdRows = 2 * 9;

	public static void initalize() {
		cmdName = Utils.chat("&8cmd");
		cmd = Bukkit.createInventory(null, cmdRows);
	}

	public static Inventory cmdUI(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, cmdRows, cmdName);
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 1, " ");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 2, " ");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 3, " ");
		Utils.createItem(cmd, "BLACK_BED", 1, 4, "&8/&7bed", "&7Takes you to your bed");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 5, " ");
		Utils.createItem(cmd, "CRAFTING_TABLE", 1, 6, "&8/&7recipes", "&7Opens crafting recipes menu");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 7, " ");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 8, " ");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 9, " ");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 10, " ");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 11, " ");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 12, " ");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 13, " ");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 14, " ");
		Utils.createItem(cmd, "GRAY_STAINED_GLASS_PANE", 1, 14, "&7Go back");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 15, " ");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 16, " ");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 17, " ");
		Utils.createItem(cmd, "BLACK_STAINED_GLASS_PANE", 1, 18, " ");

		toReturn.setContents(cmd.getContents());
		return toReturn;
	}

	public static void clicked(Player p, int slot, ItemStack clicked, Inventory cmdUI) {
		// If player clicks "bed"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&8/&7bed"))) {
			if (p.getBedSpawnLocation() == null) {
				p.sendMessage(Utils.chat("&8[&bwRPG&8]&c Your bed isnt set or it's obstructed!"));
				p.closeInventory();
			} else {
				p.teleport(p.getBedSpawnLocation());
				p.sendMessage(Utils.chat("&8[&bwRPG&8]&7 Home, sweet home!"));
				p.closeInventory();
			}
		}
		// If player clicks "recipes"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&8/&7recipes"))) {
			p.openInventory(RecipesUI.crUI(p));
		}
		// If player clicks "Go back"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Go back"))) {
			p.openInventory(MainUI.mmUI(p));
		}
	}
}
