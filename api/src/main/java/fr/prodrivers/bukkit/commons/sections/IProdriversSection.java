package fr.prodrivers.bukkit.commons.sections;

import org.bukkit.entity.Player;

/**
 * Interface for all Prodrivers Commons-compatible Section implementations.
 * 
 * Sections implementing IProdriversSection shall register themselves using SectionManager.register
 */
public interface IProdriversSection {
	/**
	 * Get the section's name, as used by players in commands
	 * @return Section's name
	 */
	String getName();

	/**
	 * Get this section's preferred next section, ie. the section where the player should go by default when exiting this section
	 * @return Section's name or null
	 */
	String getPreferredNextSection();

	/**
	 * Get if we shall force the player to go to the preferred next section.
	 * @return {@code true} Force the player to go to the preferred next section
	 */
	boolean forceNextSection();

	/**
	 * Get if the section should be considered as a hub (player is not in a minigame)
	 * @return {@code true} Section is a hub
	 */
	boolean isHub();

	/**
	 * Section join callback
	 * @param player Player that joins the section
	 * @param leavedSection Section name to be entered. May be null.
	 * @return {@code true} Continue the section enter process
	 */
	boolean join( Player player, String leavedSection );

	/**
	 * Section leave callback
	 * @param player Player that leaves the section
	 * @param enteredSection Section name to be entered. May be null.
	 * @return {@code true} Continue the section enter process
	 */
	boolean leave( Player player, String enteredSection );
}
