package interfaces;

import helpers.utils.RegionBox;
import helpers.utils.Tile;

import java.awt.*;

/**
 * Interface defining navigation and walking functionalities in a game environment.
 * This interface provides methods for obtaining the player's position, taking steps,
 * and walking along predefined paths within the game.
 */
public interface iWalker {

    /**
     * Configures the system to use a custom map file instead of the default worldmap.
     * This method must be called before any operations that require map data are performed
     * to ensure the custom map is loaded and ready for use. If a custom map is not set up
     * using this method, the system will revert to using the default map.
     *
     * @param customMapfilePath The relative file path to the custom map file. Path must be relative to your script directory.
     */
    void setup(String customMapfilePath);

    /**
     * Gets the player's current position.
     *
     * @return Tile representing the player's current position on the map.
     */
    Tile getPlayerPosition();

    /**
     * Gets the player's current position within a specified region.
     *
     * @param region The region for which to determine the player's position.
     * @return Tile representing the player's current position within the region.
     */
    Tile getPlayerPosition(RegionBox region);

    /**
     * Takes a step to a specified Tile. Needs to be visible on the minimap.
     *
     * @param worldmapPoint The tile to step to on the world map.
     * @param region the RegionBox region you are in on the worldmap.
     */
    void step(Tile worldmapPoint, RegionBox region);

    /**
     * Walks along a specified path within a given region.
     *
     * @param region The region within which to walk the path.
     * @param path An array of Tiles representing the path to walk.
     * @return Boolean indicating whether the path was successfully walked.
     */
    Boolean walkPath(RegionBox region, Tile[] path);
}