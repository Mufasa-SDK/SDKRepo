package interfaces;

import helpers.utils.MapChunk;
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
     * This method must be called before any operations that require map data are performed
     * to ensure the map is loaded and ready for use.
     *
     * @param mapChunk The mapchunk object to generate the map from.
     */
    void setup(MapChunk mapChunk);

    /**
     * Gets the player's current position.
     *
     * @return Tile representing the player's current position on the map.
     */
    Tile getPlayerPosition();

    /**
     * Takes a step to a specified Tile without providing a search region. Needs to be visible on the minimap.
     *
     * @param worldmapPoint The tile to step to on the world map.
     */
    void step(Tile worldmapPoint);

    /**
     * Takes a step to a specified Tile without providing a search region. Needs to be visible on the minimap.
     *
     * @param worldmapPoint The tile to step to on the world map.
     * @param actionWhileStepping a runnable to perform while waiting till destination is reached
     */
    void step(Tile worldmapPoint, Runnable actionWhileStepping);

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
     * Attempts to navigate to a specified world map tile. This method calculates
     * the minimap point corresponding to the provided world map tile and performs
     * a tap action to initiate movement towards that location. The method includes
     * a randomization within a randomized small area on the minimap to simulate a more natural
     * movement pattern.
     *
     * @param worldmapTile The {@link Tile} object representing the destination tile
     * on the world map. This is the target location the player is supposed to navigate to.
     * @param actionWhileWalking An action to be performed while walking
     * @return {@code true} if the method successfully initiates movement towards the
     * specified location, {@code false} otherwise. Note: returning {@code true} does not
     * guarantee that the destination will be reached, only that the navigation action
     * was successfully initiated.
     */
    boolean walkTo(Tile worldmapTile, Runnable actionWhileWalking);

    /**
     * Walks along a specified path without providing a region. This should primarily be used if using custom maps
     *
     * @param path An array of Tiles representing the path to walk.
     * @return Boolean indicating whether the path was successfully walked.
     */
    Boolean walkPath(Tile[] path);

    /**
     * Walks along a specified path without providing a region. This should primarily be used if using custom maps
     *
     * @param path An array of Tiles representing the path to walk.
     * @param whileRunning an action to be performed while waiting between points
     * @return Boolean indicating whether the path was successfully walked.
     */
    Boolean walkPath(Tile[] path, Runnable whileRunning);

    /**
     * Walks to a specified destination tile using a dynamic path calculation. This method calculates the best possible
     * path to the end destination tile.
     *
     * @param destinationTile The Tile representing the end destination.
     * @return Boolean indicating whether the destination was successfully reached.
     */
    boolean webWalk(Tile destinationTile);

    /**
     * Determines if the specified Tile is visible on the minimap, using the already set-up Region from Walker.setup.
     *
     * This method checks whether a given tile can be reached based on its visibility on the minimap,
     * implying that it is within a certain range or not obstructed.
     *
     * @param destinationTile The Tile to check for reachability.
     * @return {@code true} if the tile is visible and potentially reachable on the minimap; {@code false} otherwise.
     */
    boolean isReachable(Tile destinationTile);
}