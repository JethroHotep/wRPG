package me.dayton.wRPG.Recipes;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import me.dayton.wRPG.Utils;
import me.dayton.wRPG.wRPG;

public class Building {
	Plugin plugin = wRPG.getPlugin(wRPG.class);
	
	@SuppressWarnings("deprecation")
	public void crWoodSlab() {
		
		ItemStack rWoodSlab = new ItemStack(Material.OAK_SLAB, 2);
		ItemMeta rWoodSlabM = rWoodSlab.getItemMeta();
		rWoodSlabM.setDisplayName(Utils.chat("&7Oak Slab"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Basic Building Material"));
		rWoodSlabM.setLore(lore);
		rWoodSlabM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		rWoodSlab.setItemMeta(rWoodSlabM);
			
		ShapedRecipe woodplank = new ShapedRecipe(rWoodSlab);
		
		woodplank.shape("SS", "SS");
		
		woodplank.setIngredient('S', Material.STICK);
		
		plugin.getServer().addRecipe(woodplank);
	}
	
	@SuppressWarnings("deprecation")
	public void crStoneSlab() {
		
		ItemStack rStoneSlab = new ItemStack(Material.STONE_SLAB, 2);
		ItemMeta rStoneSlabM = rStoneSlab.getItemMeta();
		rStoneSlabM.setDisplayName(Utils.chat("&7Stone Slab"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Basic Building Material"));
		rStoneSlabM.setLore(lore);
		rStoneSlabM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		rStoneSlab.setItemMeta(rStoneSlabM);
			
		ShapedRecipe stoneslab = new ShapedRecipe(rStoneSlab);
		
		stoneslab.shape("SS", "SS");
		
		stoneslab.setIngredient('S', Material.GRAY_DYE);
		
		plugin.getServer().addRecipe(stoneslab);
	}
	
	@SuppressWarnings("deprecation")
	public void crStone() {
		
		ItemStack rStone = new ItemStack(Material.STONE, 2);
		ItemMeta rStoneM = rStone.getItemMeta();
		rStoneM.setDisplayName(Utils.chat("&7Stone"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Basic Building Material"));
		rStoneM.setLore(lore);
		rStoneM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		rStone.setItemMeta(rStoneM);
			
		ShapedRecipe stone = new ShapedRecipe(rStone);
		
		stone.shape("SS", "SS");
		
		stone.setIngredient('S', Material.STONE_SLAB);
		
		plugin.getServer().addRecipe(stone);
	}
	
	@SuppressWarnings("deprecation")
	public void crWoodPlank() {
		
		ItemStack crWoodPlank = new ItemStack(Material.OAK_PLANKS, 2);
		ItemMeta crWoodPlankM = crWoodPlank.getItemMeta();
		crWoodPlankM.setDisplayName(Utils.chat("&7Oak Plank"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Basic Building Material"));
		crWoodPlankM.setLore(lore);
		crWoodPlankM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		crWoodPlank.setItemMeta(crWoodPlankM);
			
		ShapedRecipe woodPlank = new ShapedRecipe(crWoodPlank);
		
		woodPlank.shape("SS", "SS");
		
		woodPlank.setIngredient('S', Material.OAK_SLAB);
		
		plugin.getServer().addRecipe(woodPlank);
	}
	
	@SuppressWarnings("deprecation")
	public void crWoodDoor() {
		
		ItemStack rWoodDoor = new ItemStack(Material.OAK_DOOR, 1);
		ItemMeta rWoodDoorM = rWoodDoor.getItemMeta();
		rWoodDoorM.setDisplayName(Utils.chat("&7Door"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Basic BUilding Material"));
		rWoodDoorM.setLore(lore);
		rWoodDoorM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		rWoodDoor.setItemMeta(rWoodDoorM);
			
		ShapedRecipe woodDoor = new ShapedRecipe(rWoodDoor);
		
		woodDoor.shape(" S", " S");
		woodDoor.shape("S ", "S ");
		
		woodDoor.setIngredient('S', Material.OAK_PLANKS);
		
		plugin.getServer().addRecipe(woodDoor);
	}
	
	@SuppressWarnings("deprecation")
	public void crChest() {
		
		ItemStack rChest = new ItemStack(Material.CHEST, 1);
		ItemMeta rChestM = rChest.getItemMeta();
		rChestM.setDisplayName(Utils.chat("&7Chest"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Used to store items"));
		rChestM.setLore(lore);
		rChestM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		rChest.setItemMeta(rChestM);
			
		ShapedRecipe chest = new ShapedRecipe(rChest);
		
		chest.shape("SS", "SS");
		
		chest.setIngredient('S', Material.OAK_PLANKS);
		
		plugin.getServer().addRecipe(chest);
	}
	
	
}
