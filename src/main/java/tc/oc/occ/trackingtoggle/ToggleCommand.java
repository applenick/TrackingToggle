package tc.oc.occ.trackingtoggle;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Private;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import tc.oc.occ.dispense.events.UpdateObjectiveTrackingEvent;

@Private
@CommandAlias("tracking|objtracking")
@Description("Manager objective tracking state")
@CommandPermission("occ.tracking.admin")
public class ToggleCommand extends BaseCommand {

  @Subcommand("enable")
  public void enableTracking(CommandSender sender) {
    callEvent(true);
    sender.sendMessage(ChatColor.GREEN + "Objective Tracking has been enabled");
  }

  @Subcommand("disable")
  public void disableTracking(CommandSender sender) {
    callEvent(false);
    sender.sendMessage(ChatColor.RED + "Objective Tracking has been disabled");
  }

  private void callEvent(boolean value) {
    Bukkit.getPluginManager().callEvent(new UpdateObjectiveTrackingEvent(value));
  }
}
