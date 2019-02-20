package me.dayton.wRPG.Recipes;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import me.dayton.wRPG.Utils;
import me.dayton.wRPG.wRPG;

public class Tools {
	Plugin plugin = wRPG.getPlugin(wRPG.class);

	@SuppressWarnings("deprecation")
	public void crWoodAxe() {
		ItemStack item = new ItemStack(Material.WOODEN_AXE,1 );
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&7Poor Wooden Axe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to harvest &oLog"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
		
		ShapedRecipe woodAxe = new ShapedRecipe(item);
		
		woodAxe.shape("SW", " W");
		
		woodAxe.setIngredient('S', Material.STICK);
		woodAxe.setIngredient('W', Material.OAK_SLAB);
		
		plugin.getServer().addRecipe(woodAxe);
	}

	@SuppressWarnings("deprecation")
	public void crWoodHoe () {
		ItemStack item= new ItemStack(Material.WOODEN_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&7Poor Wooden Hoe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oTill"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe woodHoe = new ShapedRecipe(item);
		
		woodHoe.shape("WW", " S");
		
		woodHoe.setIngredient('S', Material.STICK);
		woodHoe.setIngredient('W', Material.OAK_SLAB);
		
		plugin.getServer().addRecipe(woodHoe);
	}
	
	@SuppressWarnings("deprecation")
	public void crWoodPickaxe() {
		
		ItemStack item = new ItemStack(Material.WOODEN_PICKAXE,1 );
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&7Poor Wooden Pickaxe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to mine &oStone"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe woodPickaxe = new ShapedRecipe(item);
		
		woodPickaxe.shape("WW", "SW");
		
		woodPickaxe.setIngredient('S', Material.STICK);
		woodPickaxe.setIngredient('W', Material.OAK_SLAB);
		
		plugin.getServer().addRecipe(woodPickaxe);
	}
	
	@SuppressWarnings("deprecation")
	public void crWoodShovel() {
		ItemStack item = new ItemStack(Material.WOODEN_SHOVEL,1 );
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&7Poor Wooden Shovel"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oExcavate"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe woodShovel = new ShapedRecipe(item);
		
		woodShovel.shape("W ", "S ");
		woodShovel.shape(" W", " S");
		
		woodShovel.setIngredient('S', Material.STICK);
		woodShovel.setIngredient('W', Material.OAK_SLAB);
		
		plugin.getServer().addRecipe(woodShovel);
	}
	
	@SuppressWarnings("deprecation")
	public void crWoodSword() {
		ItemStack item = new ItemStack(Material.WOODEN_SWORD,1 );
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&7Poor Wooden Sword"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oAttack"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe woodSword = new ShapedRecipe(item);
		
		woodSword.shape(" W", "SW");
		woodSword.shape("W ", "WS");
		
		woodSword.setIngredient('S', Material.STICK);
		woodSword.setIngredient('W', Material.OAK_SLAB);
		
		plugin.getServer().addRecipe(woodSword);
	}
	
	@SuppressWarnings("deprecation")
	public void crStoneAxe() {
		ItemStack item = new ItemStack(Material.STONE_AXE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&7Sturdy Stone Axe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to harvest &oLog"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe stoneAxe = new ShapedRecipe(item);
		
		stoneAxe.shape("SX", " X");
		
		stoneAxe.setIngredient('S', Material.STICK);
		stoneAxe.setIngredient('X', Material.STONE_SLAB);
		
		plugin.getServer().addRecipe(stoneAxe);
	}
	
	@SuppressWarnings("deprecation")
	public void crStoneHoe () {
		ItemStack item= new ItemStack(Material.STONE_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&7Sturdy Stone Hoe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oTill"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe stoneHoe = new ShapedRecipe(item);
		
		stoneHoe.shape("XX", " S");
		
		stoneHoe.setIngredient('S', Material.STICK);
		stoneHoe.setIngredient('X', Material.STONE_SLAB);
		
		plugin.getServer().addRecipe(stoneHoe);
	}
	
	@SuppressWarnings("deprecation")
	public void crStonePickaxe() {
		
		ItemStack item = new ItemStack(Material.STONE_PICKAXE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&7Sturdy Stone Pickaxe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to mine &oStone & Ores"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe stonePickaxe = new ShapedRecipe(item);
		
		stonePickaxe.shape("XX", "SX");
		
		stonePickaxe.setIngredient('S', Material.STICK);
		stonePickaxe.setIngredient('X', Material.STONE_SLAB);
		
		plugin.getServer().addRecipe(stonePickaxe);
	}
		
	@SuppressWarnings("deprecation")
	public void crStoneShovel() {
		ItemStack item = new ItemStack(Material.STONE_SHOVEL, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&7Sturdy Stone Shovel"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oExcavate"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe stoneShovel = new ShapedRecipe(item);
		
		stoneShovel.shape("X ", "S ");
		stoneShovel.shape(" X", " S");
		
		stoneShovel.setIngredient('S', Material.STICK);
		stoneShovel.setIngredient('X', Material.STONE_SLAB);
		
		plugin.getServer().addRecipe(stoneShovel);
	}
	
	@SuppressWarnings("deprecation")
	public void crStoneSword() {
		ItemStack item = new ItemStack(Material.STONE_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&7Sturdy Stone Sword"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oAttack"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe stoneSword = new ShapedRecipe(item);
		
		stoneSword.shape(" X", "SX");
		stoneSword.shape("X ", "XS");
		
		stoneSword.setIngredient('S', Material.STICK);
		stoneSword.setIngredient('X', Material.STONE_SLAB);
		
		plugin.getServer().addRecipe(stoneSword);
	}
	
	@SuppressWarnings("deprecation")
	public void crIronAxe() {
		ItemStack item = new ItemStack(Material.IRON_AXE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&fHardened Iron Axe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to harvest &oLog"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe ironAxe = new ShapedRecipe(item);
		
		ironAxe.shape("SI", " I");
		
		ironAxe.setIngredient('S', Material.STICK);
		ironAxe.setIngredient('I', Material.IRON_INGOT);
		
		plugin.getServer().addRecipe(ironAxe);
	}
	
	@SuppressWarnings("deprecation")
	public void crIronHoe () {
		ItemStack item= new ItemStack(Material.IRON_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&fHardened Iron Hoe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oTill"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe ironHoe = new ShapedRecipe(item);
		
		ironHoe.shape("II", " S");
		
		ironHoe.setIngredient('S', Material.STICK);
		ironHoe.setIngredient('I', Material.IRON_INGOT);
		
		plugin.getServer().addRecipe(ironHoe);
	}
	
	@SuppressWarnings("deprecation")
	public void crIronPickaxe() {
		
		ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&fHardened Iron Pickaxe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to mine &oStone & Ores"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe ironPickaxe = new ShapedRecipe(item);
		
		ironPickaxe.shape("II", "SI");
		
		ironPickaxe.setIngredient('S', Material.STICK);
		ironPickaxe.setIngredient('I', Material.IRON_INGOT);
		
		plugin.getServer().addRecipe(ironPickaxe);
	}
		
	@SuppressWarnings("deprecation")
	public void crIronShovel() {
		ItemStack item = new ItemStack(Material.IRON_SHOVEL, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&fHardened Iron Shovel"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oExcavate"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe ironShovel = new ShapedRecipe(item);
		
		ironShovel.shape("I ", "S ");
		ironShovel.shape(" I", " S");
		
		ironShovel.setIngredient('S', Material.STICK);
		ironShovel.setIngredient('I', Material.IRON_INGOT);
		
		plugin.getServer().addRecipe(ironShovel);
	}
	
	@SuppressWarnings("deprecation")
	public void crIronSword() {
		ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&fHardened Iron Sword"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oAttack"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe ironSword = new ShapedRecipe(item);
		
		ironSword.shape(" I", "SI");
		ironSword.shape("I ", "IS");
		
		ironSword.setIngredient('S', Material.STICK);
		ironSword.setIngredient('I', Material.IRON_INGOT);
		
		plugin.getServer().addRecipe(ironSword);
	}
	
	@SuppressWarnings("deprecation")
	public void crDiamondAxe() {
		ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&bDurable Diamond Axe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to harvest &oLog"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe diamondAxe = new ShapedRecipe(item);
		
		diamondAxe.shape("SD", " D");
		
		diamondAxe.setIngredient('S', Material.STICK);
		diamondAxe.setIngredient('D', Material.DIAMOND);
		
		plugin.getServer().addRecipe(diamondAxe);
	}
		
	@SuppressWarnings("deprecation")
	public void crDiamondPickaxe() {
		
		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&bDurable Diamond Pickaxe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to mine &oStone & Ores"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe diamondPickaxe = new ShapedRecipe(item);
		
		diamondPickaxe.shape("DD", "SD");
		
		diamondPickaxe.setIngredient('S', Material.STICK);
		diamondPickaxe.setIngredient('D', Material.DIAMOND);
		
		plugin.getServer().addRecipe(diamondPickaxe);
	}
	
	@SuppressWarnings("deprecation")
	public void crDiamondHoe () {
		ItemStack item= new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&dHardened Diamond Hoe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oTill"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe diamondHoe = new ShapedRecipe(item);
		
		diamondHoe.shape("DD", " S");
		
		diamondHoe.setIngredient('S', Material.STICK);
		diamondHoe.setIngredient('D', Material.DIAMOND);
		
		plugin.getServer().addRecipe(diamondHoe);
	}
	
	@SuppressWarnings("deprecation")
	public void crDiamondShovel() {
		ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&bDurable Diamond Shovel"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oExcavate"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe diamondShovel = new ShapedRecipe(item);
		
		diamondShovel.shape("D ", "S ");
		diamondShovel.shape(" D", " S");
		
		diamondShovel.setIngredient('S', Material.STICK);
		diamondShovel.setIngredient('D', Material.DIAMOND);
		
		plugin.getServer().addRecipe(diamondShovel);
	}
	
	@SuppressWarnings("deprecation")
	public void crDiamondSword() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&bDurable Diamond Sword"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oAttack"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe diamondSword = new ShapedRecipe(item);
		
		diamondSword.shape(" D", "SD");
		diamondSword.shape("D ", "DS");
		
		diamondSword.setIngredient('S', Material.STICK);
		diamondSword.setIngredient('D', Material.DIAMOND);
		
		plugin.getServer().addRecipe(diamondSword);
	}
	
	@SuppressWarnings("deprecation")
	public void crhDiamondAxe() {
		ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&dHardened Diamond Axe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to harvest &oLog"));
		meta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe hdiamondAxe = new ShapedRecipe(item);
		
		hdiamondAxe.shape("SE", " E");
		
		hdiamondAxe.setIngredient('S', Material.STICK);
		hdiamondAxe.setIngredient('E', Material.ENDER_PEARL);
		
		plugin.getServer().addRecipe(hdiamondAxe);
	}
	
	@SuppressWarnings("deprecation")
	public void crhDiamondHoe () {
		ItemStack item= new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&dHardened Diamond Hoe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oTill"));
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe hdiamondHoe = new ShapedRecipe(item);
		
		hdiamondHoe.shape("EE", " S");
		
		hdiamondHoe.setIngredient('S', Material.STICK);
		hdiamondHoe.setIngredient('E', Material.ENDER_PEARL);
		
		plugin.getServer().addRecipe(hdiamondHoe);
	}
	
	@SuppressWarnings("deprecation")
	public void crhDiamondPickaxe() {
		
		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&dHardened Diamond Pickaxe"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to mine &oStone & Ores"));
		meta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe hdiamondPickaxe = new ShapedRecipe(item);
		
		hdiamondPickaxe.shape("EE", "SE");
		
		hdiamondPickaxe.setIngredient('S', Material.STICK);
		hdiamondPickaxe.setIngredient('E', Material.ENDER_PEARL);
		
		plugin.getServer().addRecipe(hdiamondPickaxe);
	}
		
	@SuppressWarnings("deprecation")
	public void crhDiamondShovel() {
		ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&dHardened Diamond Shovel"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oExcavate"));
		meta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe hdiamondShovel = new ShapedRecipe(item);
		
		hdiamondShovel.shape("E ", "S ");
		hdiamondShovel.shape(" E", " S");
		
		hdiamondShovel.setIngredient('S', Material.STICK);
		hdiamondShovel.setIngredient('E', Material.ENDER_PEARL);
		
		plugin.getServer().addRecipe(hdiamondShovel);
	}
	
	@SuppressWarnings("deprecation")
	public void crhDiamondSword() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&dHardened Diamond Sword"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&7Can be used to &oAttack"));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
			
		ShapedRecipe hdiamondSword = new ShapedRecipe(item);
		
		hdiamondSword.shape(" E", "SE");
		hdiamondSword.shape("E ", "ES");
		
		hdiamondSword.setIngredient('S', Material.STICK);
		hdiamondSword.setIngredient('E', Material.ENDER_PEARL);
		
		plugin.getServer().addRecipe(hdiamondSword);
	}
}
