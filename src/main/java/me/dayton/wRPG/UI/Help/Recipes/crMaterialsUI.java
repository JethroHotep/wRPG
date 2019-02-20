package me.dayton.wRPG.UI.Help.Recipes;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.dayton.wRPG.Utils;
import me.dayton.wRPG.UI.Help.RecipesUI;

public class crMaterialsUI {
	public static Inventory crMaterials;
	public static String crMaterialsName;
	public static int crMaterialsRows = 2 * 9;

	public static void initalize() {
		crMaterialsName = Utils.chat("&8Materials Crafting Recipes");
		crMaterials = Bukkit.createInventory(null, crMaterialsRows);
	}

	public static Inventory MaterialsUI(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, crMaterialsRows, crMaterialsName);

		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 1, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 2, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 3, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 4, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 5, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 6, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 7, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 8, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 9, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 10, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 11, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 12, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 13, " ");
		Utils.createItem(crMaterials, "GRAY_STAINED_GLASS_PANE", 1, 14, "&7Go back");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 15, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 16, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 17, " ");
		Utils.createItem(crMaterials, "BLACK_STAINED_GLASS_PANE", 1, 18, " ");

		toReturn.setContents(crMaterials.getContents());
		return toReturn;
	}

	public static void clicked(Player p, int slot, ItemStack clicked, Inventory crMaterialsUI) {
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat(""))) {
			
		}
		// If player clicks "Go back"; Do this
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Go back"))) {
			p.openInventory(RecipesUI.crUI(p));
		}
	}
}
