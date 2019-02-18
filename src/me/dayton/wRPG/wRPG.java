package me.dayton.wRPG;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.dayton.wRPG.Commands.HelpCMD;
import me.dayton.wRPG.Commands.RecipesCMD;
import me.dayton.wRPG.Commands.RulesCMD;
import me.dayton.wRPG.Listeners.blockDrop;
import me.dayton.wRPG.Listeners.blockEnderPearl;
import me.dayton.wRPG.Listeners.craftItem;
import me.dayton.wRPG.Listeners.inventoryClick;
import me.dayton.wRPG.Listeners.playerJoin;
import me.dayton.wRPG.Listeners.requireTool;
import me.dayton.wRPG.Recipes.Building;
import me.dayton.wRPG.Recipes.Furnace;
import me.dayton.wRPG.Recipes.Materials;
import me.dayton.wRPG.Recipes.Tools;

public class wRPG extends JavaPlugin {

	private static wRPG instance;

	public void onEnable() {
		instance = this;

		getLogger().info("Enabled");
		getLogger().info("Add me on Discord: Dayton#6136");

		
		// Furnace custom recipe
		Furnace furnace = new Furnace();
		furnace.frDiamond();
		furnace.frCompressedDiamond();
		furnace.frIron();
		
		// Building custom recipe
		Building building = new Building();
		building.crWoodSlab();
		building.crStoneSlab();
		building.crStone();
		building.crWoodPlank();
		building.crWoodDoor();
		building.crChest();
		
		// Materials custom recipe
		Materials materials = new Materials();
		materials.crHardenedDiamond();
		materials.crStick();
		materials.crFurnace();
		materials.crIronFrag();
		
		// Tools custom recipe
		Tools items = new Tools();
		items.crWoodPickaxe();
		items.crWoodAxe();
		items.crWoodShovel();
		items.crWoodSword();
		items.crStoneAxe();
		items.crStonePickaxe();
		items.crStoneShovel();
		items.crStoneSword();
		items.crIronAxe();
		items.crIronPickaxe();
		items.crIronShovel();
		items.crIronSword();
		items.crDiamondAxe();
		items.crDiamondPickaxe();
		items.crDiamondShovel();
		items.crDiamondSword();
		items.crhDiamondAxe();
		items.crhDiamondPickaxe();
		items.crhDiamondShovel();
		items.crhDiamondSword();

		me.dayton.wRPG.UI.MainUI.initalize();
		me.dayton.wRPG.UI.Help.HelpUI.initalize();
		me.dayton.wRPG.UI.Help.RecipesUI.initalize();
		me.dayton.wRPG.UI.Help.Recipes.crBuildingsUI.initalize();
		me.dayton.wRPG.UI.Help.Recipes.crMaterialsUI.initalize();
		me.dayton.wRPG.UI.Help.Recipes.crToolsUI.initalize();
		me.dayton.wRPG.UI.Rules.RulesUI.initalize();
		me.dayton.wRPG.UI.Commands.CommandsUI.initalize();

		loadCommands();
		loadListeners();
	}

	public void onDisable() {
		getLogger().info("Disabled");
	}

	private void loadCommands() {
		getCommand("help").setExecutor(new HelpCMD());
		getCommand("recipes").setExecutor(new RecipesCMD());
		getCommand("rules").setExecutor(new RulesCMD());
	}

	private void loadListeners() {
		PluginManager pm = getServer().getPluginManager();

		pm.registerEvents(new craftItem(), this);
		pm.registerEvents(new blockDrop(), this);
		pm.registerEvents(new requireTool(), this);
		pm.registerEvents(new blockEnderPearl(), this);
		pm.registerEvents(new playerJoin(), this);
		pm.registerEvents(new inventoryClick(), this);
	}

	public static FileConfiguration getConfiguration() {
		return getInstance().getConfig();
	}

	public static wRPG getInstance() {
		return instance;
	}
}
