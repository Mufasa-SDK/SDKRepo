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
     * Takes a step to a specified Tile without providing a search region. Needs to be visible on the minimap.
     *
     * @param worldmapPoint The tile to step to on the world map.
     */
    void step(Tile worldmapPoint);


    /**
     * Attempts to navigate to a specified world map tile. This method calculates
     * the minimap point corresponding to the provided world map tile and performs
     * a tap action to initiate movement towards that location. The method includes
     * a randomization within a randomized small area on the minimap to simulate a more natural
     * movement pattern.
     *
     * @param worldmapTile The {@link Tile} object representing the destination tile
     * on the world map. This is the target location the player is supposed to navigate to.
     * @return {@code true} if the method successfully initiates movement towards the
     * specified location, {@code false} otherwise. Note: returning {@code true} does not
     * guarantee that the destination will be reached, only that the navigation action
     * was successfully initiated.
     */
    boolean walkTo(Tile worldmapTile);

    /**
     * Attempts to navigate to a specified world map tile within a given region. This
     * method is similar to {@link #walkTo(Tile)} but takes an additional {@link RegionBox}
     * parameter that specifies the region within which the destination tile is located.
     *
     * @param worldmapTile The {@link Tile} object representing the destination tile
     * on the world map within the specified region.
     * @param region The {@link RegionBox} defining the area within which the destination
     * tile is located. This parameter helps refine the navigation process by providing
     * additional context about the destination's location.
     * @return {@code true} if the method successfully initiates movement towards the
     * specified location within the given region, {@code false} otherwise. As with
     * {@link #walkTo(Tile)}, success here indicates that the navigation action was
     * initiated, not necessarily that the destination will be reached.
     */
    boolean walkTo(Tile worldmapTile, RegionBox region);

    /**
     * Walks along a specified path within a given region.
     *
     * @param region The region within which to walk the path.
     * @param path An array of Tiles representing the path to walk.
     * @return Boolean indicating whether the path was successfully walked.
     */
    Boolean walkPath(RegionBox region, Tile[] path);

    /**
     * Walks along a specified path without providing a region. This should primarily be used if using custom maps
     *
     * @param path An array of Tiles representing the path to walk.
     * @return Boolean indicating whether the path was successfully walked.
     */
    Boolean walkPath(Tile[] path);
}