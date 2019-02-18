package me.dayton.wRPG.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.dayton.wRPG.UI.MainUI;

public class HelpCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		Player p = Bukkit.getPlayer(sender.getName());
		if (cmd.getName().equalsIgnoreCase("help")) {
			if (sender.hasPermission("wrpg.help") || sender.hasPermission("wrpg.*")) {
				p.openInventory(MainUI.mmUI(p));
			}
		}
		return false;
	}
}