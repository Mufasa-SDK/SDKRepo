package interfaces;

import helpers.utils.Area;
import helpers.utils.RegionBox;

import java.awt.*;

/**
 * Interface defining player interactions within the game
 */
public interface iPlayer {
    /**
     * Gets the player's current position and checks if it is within the specified RegionBox
     *
     * @param areaToSearchIn This is the Area of the world map area you'd like to search in.
     * @param mapRegion This is the RegionBox of the world map you want to check against.
     * @return Returns a true/false boolean, true if you are in the targetRegionBox, false if not.
     */
    boolean within(Area areaToSearchIn, RegionBox mapRegion);

    /**
     * Gets the player's current position based on a custom map and checks if it is within the specified RegionBox
     *
     * @param mapFileLocation This is string location of the custom map you'd like to search in.
     * @param areaToSearchIn This is the Area of the custom map you want to check if you are in.
     * @return Returns a true/false boolean, true if you are in the RegionBox, false if not.
     */
    boolean withinCustom(String mapFileLocation, Area areaToSearchIn);

    /**
     * Gets the player's current Prayer points based on the minimap orb.
     *
     * @return Returns an integer that represents the current Prayer points value of the player.
     */
    Integer getPray();

    /**
     * Gets the player's current HP based on the minimap orb.
     *
     * @return Returns an integer that represents the current HP value of the player.
     */
    Integer getHP();

    /**
     * Gets the player's current Special attack based on the minimap orb.
     *
     * @return Returns an integer that represents the current Special attack energy value of the player.
     */
    Integer getSpec();

    /**
     * Gets the player's current Run energy based on the minimap orb.
     *
     * @return Returns an integer that represents the current Run energy value of the player.
     */
    Integer getRun();

    /**
     * Checks if run is currently enabled or not.
     *
     * @return Returns a true/false boolean, true if run is enabled, false if not.
     */
    boolean isRunEnabled();

    /**
     * Toggles the run on/off, use isRunEnabled() to check if run is on or not, this will always toggle it on/off, no matter what it currently is on.
     *
     */
    void toggleRun();

}
