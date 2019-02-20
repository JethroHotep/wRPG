package me.dayton.wRPG.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.dayton.wRPG.UI.Help.RecipesUI;

public class RecipesCMD implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		Player p = Bukkit.getPlayer(sender.getName());
		if (cmd.getName().equalsIgnoreCase("recipes")) {
			if (sender.hasPermission("wrpg.recipes") || sender.hasPermission("wrpg.*")) {
				p.openInventory(RecipesUI.crUI(p));
			}
		}
		return false;
	}
}
