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

public class Materials {
	Plugin plugin = wRPG.getPlugin(wRPG.class);

	@SuppressWarnings("deprecation")
	public void crHardenedDiamond() {
		
		ItemStack hDiamond = new ItemStack(Material.ENDER_PEARL, 1);
		ItemMeta hDiamondM = hDiamond.getItemMeta();
		hDiamondM.setDisplayName(Utils.chat("&dHardened Diamond"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7A Hardened Diamond used for crafting"));
		hDiamondM.setLore(lore);
		hDiamondM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		hDiamond.setItemMeta(hDiamondM);
			
		ShapedRecipe hardDiamond = new ShapedRecipe(hDiamond);
		
		hardDiamond.shape("DD", "DD");
		
		hardDiamond.setIngredient('D', Material.DIAMOND);
		
		plugin.getServer().addRecipe(hardDiamond);
	}
	
	@SuppressWarnings("deprecation")
	public void crStick() {
		
		ItemStack rstick = new ItemStack(Material.STICK, 2);
		ItemMeta rstickM = rstick.getItemMeta();
		rstickM.setDisplayName(Utils.chat("&7Stick"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Basic Crafting Material"));
		rstickM.setLore(lore);
		rstickM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		rstick.setItemMeta(rstickM);
			
		ShapedRecipe stick = new ShapedRecipe(rstick);
		
		stick.shape(" S", "S ");
		stick.shape("S ", " S");
		
		stick.setIngredient('S', Material.RABBIT_FOOT);
		
		plugin.getServer().addRecipe(stick);
	}
	
	@SuppressWarnings("deprecation")
	public void crFurnace() {
		
		ItemStack rFurnace = new ItemStack(Material.FURNACE, 1);
		ItemMeta rFurnaceM = rFurnace.getItemMeta();
		rFurnaceM.setDisplayName(Utils.chat("&7Furnace"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Used to smelt Ores and Cook food"));
		rFurnaceM.setLore(lore);
		rFurnaceM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		rFurnace.setItemMeta(rFurnaceM);
			
		ShapedRecipe furnace = new ShapedRecipe(rFurnace);
		
		furnace.shape("SS", "SS");
		
		furnace.setIngredient('S', Material.STONE);
		
		plugin.getServer().addRecipe(furnace);
	}
	
	@SuppressWarnings("deprecation")
	public void crIronFrag() {
		
		ItemStack rIron = new ItemStack(Material.LIGHT_GRAY_DYE, 1);
		ItemMeta rIronM = rIron.getItemMeta();
		rIronM.setDisplayName(Utils.chat("&7Iron Fragments"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be smelted into Iron Ingots"));
		rIronM.setLore(lore);
		rIronM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		rIron.setItemMeta(rIronM);
			
		ShapedRecipe iron = new ShapedRecipe(rIron);
		
		iron.shape(" I", "I ");
		iron.shape("I ", " I");
		
		iron.setIngredient('I', Material.COAL);
		
		plugin.getServer().addRecipe(iron);
	}
}
