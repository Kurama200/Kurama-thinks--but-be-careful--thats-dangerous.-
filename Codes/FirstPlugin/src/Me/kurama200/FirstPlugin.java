package Me.kurama200;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin {
	
	@Override
	public void onEnable(){
		getLogger().info("Herro World! Turn me on dadi");
	}
	
	@Override
	public void onDisable(){
		}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if (cmd.getName().equalsIgnoreCase("Hello") && sender instanceof Player) {

			Player player = (Player) sender;
			
			player.sendMessage("Hello, " + player.getName() + "!");
			
			return true;
		}
		return false;
	}
}