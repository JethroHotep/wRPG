package me.dayton.wRPG.Listeners;

import org.bukkit.entity.EnderPearl;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class blockEnderPearl implements Listener {

	@EventHandler
	public void enderPearlBlock(ProjectileLaunchEvent event) {
		if (event.getEntity() instanceof EnderPearl) {
			event.setCancelled(true);
		}
	}
}
