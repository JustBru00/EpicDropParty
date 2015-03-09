package me.justbru00.epic.dropparty;

import java.util.logging.Logger;

import me.justbru00.epic.dropparty.api.JustAPI;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class EpicDropParty extends JavaPlugin {
	
	JustAPI api = new JustAPI();
	
	Logger logger = Logger.getLogger("Minecraft");
	
	public int toDropParty;

	@Override
	public boolean onCommand(CommandSender sender, Command command,	String commandLabel, String[] args) {
		
		if (commandLabel.equalsIgnoreCase("dropparty") || commandLabel.equalsIgnoreCase("dp")){
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if (args.length == 0) {
					if (args[0].equalsIgnoreCase("start")) {
						
					}
				    if (args[0].equalsIgnoreCase("stop")) {
					
				    }
				    if (args[0].equalsIgnoreCase("help")) {
					   
				    }
				}     
				if (args.length == 1){
					
				}
				if (args.length == 2){
					
				}
			} else {
				logger.warning("That command can't be used in CONSOLE.");
			}
		}
		
		return false;
	}

	@Override
	public void onDisable() {
		
	}

	@Override
	public void onEnable() {
		
	}

}
