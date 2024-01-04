package interfaces;

import helpers.utils.RegionBox;

import java.awt.*;

/**
 * Interface defining player interactions within the game
 */
public interface iPlayer {

    /**
     * Gets the player's current position and checks if it is within the specified awtRectangle
     *
     * @param regionToSearchIn This is the RegionBox of the world map area you'd like to search in.
     * @param awtRectangle This is the awtRectangle of the world map you want to check if you are in it currently.
     * @return Returns a true/false boolean, true if you are in the awtRectangle, false if not.
     */
    boolean within(RegionBox regionToSearchIn, Rectangle awtRectangle);

    /**
     * Gets the player's current position and checks if it is within the specified RegionBox
     *
     * @param regionToSearchIn This is the RegionBox of the world map area you'd like to search in.
     * @param targetRegionBox This is the RegionBox of the world map you want to check if you are in it currently.
     * @return Returns a true/false boolean, true if you are in the targetRegionBox, false if not.
     */
    boolean within(RegionBox regionToSearchIn, RegionBox targetRegionBox);

    /**
     * Gets the player's current position based on a custom map and checks if it is within the specified java awt Rectangle
     *
     * @param mapFileLocation This is string location of the custom map you'd like to search in.
     * @param rectangle This is the java awt Rectangle of the custom map you want to check if you are in it currently.
     * @return Returns a true/false boolean, true if you are in the java awt Rectangle, false if not.
     */
    boolean withinCustom(String mapFileLocation, Rectangle rectangle);

    /**
     * Gets the player's current position based on a custom map and checks if it is within the specified RegionBox
     *
     * @param mapFileLocation This is string location of the custom map you'd like to search in.
     * @param regionBox This is the RegionBox of the custom map you want to check if you are in it currently.
     * @return Returns a true/false boolean, true if you are in the RegionBox, false if not.
     */
    boolean withinCustom(String mapFileLocation, RegionBox regionBox);

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

}
