package me.dayton.wRPG.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.dayton.wRPG.UI.Rules.RulesUI;

public class RulesCMD implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		Player p = Bukkit.getPlayer(sender.getName());
		if (cmd.getName().equalsIgnoreCase("rules")) {
			if (sender.hasPermission("wrpg.rules") || sender.hasPermission("wrpg.*")) {
				p.openInventory(RulesUI.rulesUI(p));
			}
		}
		return false;
	}
}
