package me.dayton.wRPG.Listeners;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.dayton.wRPG.Utils;

public class blockDrop implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onBlockDrop(BlockBreakEvent e) {
		Player p = e.getPlayer();

		ItemStack rf1 = new ItemStack(Material.RABBIT_FOOT, 2);
		ItemMeta rf1M = rf1.getItemMeta();
		rf1M.setDisplayName(Utils.chat("&7Stripped Oak Log"));
		ArrayList<String> crafting = new ArrayList<String>();
		crafting.add(Utils.chat("&7Basic Crafting Material"));
		rf1M.setLore(crafting);
		rf1M.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		rf1.setItemMeta(rf1M);
		
		ItemStack st1 = new ItemStack(Material.GRAY_DYE, 3);
		ItemMeta st1M = st1.getItemMeta();
		st1M.setDisplayName(Utils.chat("&7Small pebble"));
		st1M.setLore(crafting);
		st1M.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		st1.setItemMeta(st1M);
		
		ItemStack ss1 = new ItemStack(Material.STONE_SLAB, 4);
		ItemMeta ss1M = ss1.getItemMeta();
		ss1M.setDisplayName(Utils.chat("&7Stone Slab"));
		ArrayList<String> building = new ArrayList<String>();
		building.add(Utils.chat("&7Basic Building Material"));
		ss1M.setLore(building);
		ss1M.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		ss1.setItemMeta(ss1M);
		
		ItemStack os1 = new ItemStack(Material.OAK_SLAB, 4);
		ItemMeta os1M = os1.getItemMeta();
		os1M.setDisplayName(Utils.chat("&7Oak Slab"));
		os1M.setLore(building);
		os1M.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		os1.setItemMeta(os1M);

		if(e.getBlock().getType().equals(Material.OAK_LOG)) {
			e.setCancelled(true);
			p.getItemInHand().setDurability((short) (p.getItemInHand().getDurability() + 1));
			e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), rf1);
			e.getBlock().setType(Material.AIR);
		}
		if(e.getBlock().getType().equals(Material.STONE)) {
			e.setCancelled(true);
			p.getItemInHand().setDurability((short) (p.getItemInHand().getDurability() + 1));
			e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), st1);
			e.getBlock().setType(Material.AIR);
		}
		if(e.getBlock().getType().equals(Material.FURNACE)) {
			e.setCancelled(true);
			p.getItemInHand().setDurability((short) (p.getItemInHand().getDurability() + 1));
			e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), ss1);
			e.getBlock().setType(Material.AIR);
		}
		if(e.getBlock().getType().equals(Material.CRAFTING_TABLE)) {
			e.setCancelled(true);
			p.getItemInHand().setDurability((short) (p.getItemInHand().getDurability() + 1));
			e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), os1);
			e.getBlock().setType(Material.AIR);
		}
	}

}
