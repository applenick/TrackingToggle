package tc.oc.occ.trackingtoggle;

import co.aikar.commands.BukkitCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TrackingToggle extends JavaPlugin {

  private BukkitCommandManager commands;

  @Override
  public void onEnable() {
    this.commands = new BukkitCommandManager(this);
    commands.registerCommand(new ToggleCommand());
  }
}
