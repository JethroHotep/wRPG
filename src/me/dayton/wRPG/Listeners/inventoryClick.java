package me.dayton.wRPG.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.dayton.wRPG.UI.MainUI;
import me.dayton.wRPG.UI.Commands.CommandsUI;
import me.dayton.wRPG.UI.Help.HelpUI;
import me.dayton.wRPG.UI.Help.RecipesUI;
import me.dayton.wRPG.UI.Help.Recipes.crBuildingsUI;
import me.dayton.wRPG.UI.Help.Recipes.crMaterialsUI;
import me.dayton.wRPG.UI.Help.Recipes.crToolsUI;
import me.dayton.wRPG.UI.Rules.RulesUI;

public class inventoryClick implements Listener {
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		String title = e.getInventory().getTitle();
		
		if(title.equals(crToolsUI.crToolsName)) {
			if(e.getCurrentItem() == null) {
				return;
			} else if (title.equals(crToolsUI.crToolsName)) {
				crToolsUI.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
				e.setCancelled(true);
			}
			// Check for player click event in 'crMaterialsUI'
		}
		
		if(title.equals(crMaterialsUI.crMaterialsName)) {
			if(e.getCurrentItem() == null) {
				return;
			} else if (title.equals(crMaterialsUI.crMaterialsName)) {
				crMaterialsUI.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
				e.setCancelled(true);
			}
			// Check for player click event in 'crMaterialsUI'
		}
		
		if(title.equals(crBuildingsUI.crBuildingsName)) {
			if(e.getCurrentItem() == null) {
				return;
			} else if (title.equals(crBuildingsUI.crBuildingsName)) {
				crBuildingsUI.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
				e.setCancelled(true);
			}
			// Check for player click event in 'crBuildingsUI'
		}
		
		if(title.equals(RecipesUI.crName)) {
			if(e.getCurrentItem() == null) {
				return;
			} else if (title.equals(RecipesUI.crName)) {
				RecipesUI.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
				e.setCancelled(true);
			}
			// Check for player click event in 'CommandsUI'
		}
		
		if(title.equals(CommandsUI.cmdName)) {
			if(e.getCurrentItem() == null) {
				return;
			} else if (title.equals(CommandsUI.cmdName)) {
				CommandsUI.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
				e.setCancelled(true);
			}
			// Check for player click event in 'CommandsUI'
		}
		
		if (title.equals(RulesUI.rulesName)) {
			if(e.getCurrentItem() == null) {
				return;
			} else if (title.equals(RulesUI.rulesName)) {
				RulesUI.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
				e.setCancelled(true);
			}
			// Check for player click event in 'RulesUI'
		}
		
		if (title.equals(HelpUI.helpName)) {
			if (e.getCurrentItem() == null) {
				return;
			} else if (title.equals(HelpUI.helpName)) {
				HelpUI.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
				e.setCancelled(true);
			}
			// Check for player click event in 'HelpUI'
		}

		if (title.equals(MainUI.mmName)) {
			if (e.getCurrentItem() == null) {
				return;
			} else if (title.equals(MainUI.mmName)) {
				MainUI.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
				e.setCancelled(true);
			}
			// Check for player click event in MainUI'	
		}
	}
}
