package me.justbru00.epic.dropparty;

import java.util.logging.Logger;

import me.justbru00.epic.dropparty.api.JustAPI;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class EpicDropParty extends JavaPlugin {
	
	JustAPI api = new JustAPI();
	
	Logger logger = Logger.getLogger("Minecraft");
	
	public int toDropParty;
	public int i = 0;
	public boolean startedDropParty = false;
	public String tag = api.color("&8[&f&lEpic&bDP&8] &f");

	@Override
	public boolean onCommand(CommandSender sender, Command command,	String commandLabel, String[] args) {
		
		if (commandLabel.equalsIgnoreCase("dropparty") || commandLabel.equalsIgnoreCase("dp")){
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if (args.length == 0) {
					if (args[0].equalsIgnoreCase("start")) {
						startDP("Dp Started", player, 20, new ItemStack(Material.DIAMOND), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.APPLE), new ItemStack(Material.ANVIL), new ItemStack(Material.BAKED_POTATO));
						
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
		logger.info("EpicDropParty has been disabled.");
	}

	@Override
	public void onEnable() {
		logger.info("EpicDropParty has been enabled.");
	}

	
	public void startDP(String Startmsg, Player player, int times, ItemStack dpitem1, ItemStack dpitem2, ItemStack dpitem3, ItemStack dpitem4, ItemStack dpitem5) {
		player.sendMessage(this.tag + api.color(Startmsg));
			
		
		if (i > times){
		while (i < times){
		  player.getInventory().addItem(dpitem1);
		  player.getInventory().addItem(dpitem2);
		  player.getInventory().addItem(dpitem3);
		  player.getInventory().addItem(dpitem4);
		  player.getInventory().addItem(dpitem5);
		  
		  player.sendMessage(this.tag + api.color("Recevied Items..."));
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		  i++;
		}
		} else {
			logger.severe("Please report the following to the developer: \ni is greater than times in startDP()");
		}
		player.sendMessage(this.tag + api.color("&cDp over."));
		
	}
}
