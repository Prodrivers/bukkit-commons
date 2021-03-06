package fr.prodrivers.bukkit.commons.configuration;

import fr.prodrivers.bukkit.commons.configuration.file.FileAttributeConfiguration;
import fr.prodrivers.bukkit.commons.configuration.file.actions.MessageFileAttributeConfigurationAction;
import fr.prodrivers.bukkit.commons.configuration.file.actions.MessageListFileAttributeConfigurationAction;
import fr.prodrivers.bukkit.commons.configuration.file.actions.MessageMapFileAttributeConfigurationAction;
import org.bukkit.plugin.Plugin;

import java.io.File;

public class Messages extends FileAttributeConfiguration {
	public String prefix = "[<name>]";

	public Messages( Plugin plugin ) {
		super( new File( plugin.getDataFolder(), "messages.yml" ) );
	}

	@Override
	public void init() {
		registerAction( new MessageFileAttributeConfigurationAction( this ) );
		registerAction( new MessageListFileAttributeConfigurationAction( this ) );
		registerAction( new MessageMapFileAttributeConfigurationAction( this ) );
		super.init();
	}
}
