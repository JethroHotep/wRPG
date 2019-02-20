package me.dayton.wRPG.Recipes;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import me.dayton.wRPG.Utils;
import me.dayton.wRPG.wRPG;

public class Furnace {
	
	Plugin plugin = wRPG.getPlugin(wRPG.class);
	
	@SuppressWarnings("deprecation")
	public void frDiamond() {
		ItemStack result = new ItemStack(Material.DIAMOND);
        FurnaceRecipe recipe = new FurnaceRecipe(result, Material.CYAN_DYE);
        recipe.setCookingTime(600);
        recipe.setExperience(0);
        plugin.getServer().addRecipe(recipe);
	}
	
	@SuppressWarnings("deprecation")
	public void frCompressedDiamond() {
		ItemStack result = new ItemStack(Material.ENDER_EYE);
		ItemMeta resultM = result.getItemMeta();
		resultM.setDisplayName(Utils.chat("&dUltra Hardened Diamond"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Advanced Crafting Material"));
		resultM.setLore(lore);
		resultM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		result.setItemMeta(resultM);
        FurnaceRecipe recipe = new FurnaceRecipe(result, Material.ENDER_PEARL);
        recipe.setCookingTime(1200);
        recipe.setExperience(0);
        plugin.getServer().addRecipe(recipe);
	}
	
	@SuppressWarnings("deprecation")
	public void frIron() {
		ItemStack result = new ItemStack(Material.IRON_INGOT);
		ItemMeta resultM = result.getItemMeta();
		resultM.setDisplayName(Utils.chat("&7Iron Ingot"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Basic Crafting Material"));
		resultM.setLore(lore);
		resultM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		result.setItemMeta(resultM);
        FurnaceRecipe recipe = new FurnaceRecipe(result, Material.LIGHT_GRAY_DYE);
        recipe.setExperience(0);
        plugin.getServer().addRecipe(recipe);
	}
}
