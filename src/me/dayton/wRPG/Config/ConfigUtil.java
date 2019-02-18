package me.dayton.wRPG.Config;

import me.dayton.wRPG.Utils;
import me.dayton.wRPG.wRPG;

public class ConfigUtil {
	public static String getPrefix() {
		return Utils.chat(wRPG.getConfiguration().getString("messages.prefix"));
	}	
}
