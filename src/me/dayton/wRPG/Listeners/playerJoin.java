package me.dayton.wRPG.Listeners;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.dayton.wRPG.Utils;

public class playerJoin implements Listener{

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		ItemStack item = new ItemStack(Material.WOODEN_PICKAXE,1 );
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&7Poor Wooden Pickaxe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to mine &oStone"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
		
		ItemStack aitem = new ItemStack(Material.WOODEN_AXE,1 );
		ItemMeta ameta = aitem.getItemMeta();
		ameta.setDisplayName(Utils.chat("&7Poor Wooden Axe"));
		ArrayList<String> alore = new ArrayList<String>();
		alore.add(Utils.chat("&7Can be used to harvest &oLog"));
		ameta.setLore(alore);
		ameta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		aitem.setItemMeta(ameta);
		
		
		ItemStack sitem = new ItemStack(Material.WOODEN_SHOVEL,1 );
		ItemMeta smeta = sitem.getItemMeta();
		smeta.setDisplayName(Utils.chat("&7Poor Wooden Shovel"));
		ArrayList<String> slore = new ArrayList<String>();
		slore.add(Utils.chat("&7Can be used to &oExcavate"));
		smeta.setLore(slore);
		smeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		sitem.setItemMeta(smeta);
		
		ItemStack witem = new ItemStack(Material.WOODEN_SWORD,1 );
		ItemMeta wmeta = witem.getItemMeta();
		wmeta.setDisplayName(Utils.chat("&7Poor Wooden Sword"));
		ArrayList<String> wlore = new ArrayList<String>();
		wlore.add(Utils.chat("&7Can be used to &oAttack"));
		wmeta.setLore(wlore);
		wmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		witem.setItemMeta(wmeta);
		
		ItemStack food = new ItemStack(Material.BEETROOT, 32);
		ItemMeta foodM = food.getItemMeta();
		foodM.setDisplayName(Utils.chat("&7Beetroot"));
		ArrayList<String> foodLore = new ArrayList<String>();
		foodLore.add(Utils.chat("Disgusting but it's something..."));
		foodM.setLore(foodLore);
		foodM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		food.setItemMeta(foodM);
		
		if(!e.getPlayer().hasPlayedBefore()) {
			p.setMaxHealth(8);
			p.sendMessage(Utils.chat("&7Welcome " + p.getName() + " to &bwRPG&7!"));
			e.setJoinMessage(null);
			p.getInventory().addItem(item);
			p.getInventory().addItem(aitem);
			p.getInventory().addItem(sitem);
			p.getInventory().addItem(witem);
			p.getInventory().addItem(food);
		}
	}
	
}
