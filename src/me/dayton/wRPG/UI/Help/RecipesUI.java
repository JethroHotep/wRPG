package me.dayton.wRPG.UI.Help;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.dayton.wRPG.Utils;
import me.dayton.wRPG.UI.MainUI;
import me.dayton.wRPG.UI.Help.Recipes.crBuildingsUI;
import me.dayton.wRPG.UI.Help.Recipes.crMaterialsUI;
import me.dayton.wRPG.UI.Help.Recipes.crToolsUI;

public class RecipesUI {
	public static Inventory cr;
	public static String crName;
	public static int crRows = 2 * 9;

	public static void initalize() {
		crName = Utils.chat("&8Custom Crafting Recipes");
		cr = Bukkit.createInventory(null, crRows);
	}

	public static Inventory crUI(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, crRows, crName);
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 1, " ");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 2, " ");
		Utils.createItem(cr, "STONE_PICKAXE", 1, 3, "&7Tools", "&7View tool crafting");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 4, " ");
		Utils.createItem(cr, "OAK_LOG", 1, 5, "&7Building Blocks", "&7View building blocks");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 6, " ");
		Utils.createItem(cr, "BUCKET", 1, 7, "&7Materials", "&7View materials");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 8, " ");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 9, " ");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 10, " ");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 11, " ");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 12, " ");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 13, " ");
		Utils.createItem(cr, "GRAY_STAINED_GLASS_PANE", 1, 14, "&7Go back");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 15, " ");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 16, " ");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 17, " ");
		Utils.createItem(cr, "BLACK_STAINED_GLASS_PANE", 1, 18, " ");
		

		toReturn.setContents(cr.getContents());
		return toReturn;
	}

	public static void clicked(Player p, int slot, ItemStack clicked, Inventory crUI) {
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Tools"))) {
			p.openInventory(crToolsUI.ToolsUI(p));
		}
		
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Building Blocks"))) {
			p.openInventory(crBuildingsUI.BuildingsUI(p));
		}
		
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Materials"))) {
			p.openInventory(crMaterialsUI.MaterialsUI(p));
		}
		
		// If player clicks "Go back"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Go back"))) {
			p.openInventory(MainUI.mmUI(p));
		}
	}
}
