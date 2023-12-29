package interfaces;

import helpers.utils.RegionBox;
import java.awt.*;

/**
 * Interface defining navigation and walking functionalities in a game environment.
 * This interface provides methods for obtaining the player's position, taking steps,
 * and walking along predefined paths within the game.
 */
public interface iWalker {

    /**
     * Gets the player's current position from a specified map file.
     *
     * @param mapFileLocation The location of the map file to use for determining the player's position.
     * @return Point representing the player's current position on the map.
     */
    Point getPlayerPosition(String mapFileLocation);

    /**
     * Gets the player's current position within a specified region.
     *
     * @param region The region for which to determine the player's position.
     * @return Point representing the player's current position within the region.
     */
    Point getPlayerPosition(RegionBox region);

    /**
     * Takes a step to a specified point on a world map using a map file.
     *
     * @param worldmapPoint The point to step to on the world map.
     * @param mapFileLocation The location of the map file to use for navigation.
     */
    void step(Point worldmapPoint, String mapFileLocation);

    /**
     * Walks along a specified path on a custom map.
     *
     * @param mapFileLocation The location of the custom map file to use for the path.
     * @param path An array of Points representing the path to walk.
     * @return Boolean indicating whether the path was successfully walked.
     */
    Boolean walkPathOnCustomMap(String mapFileLocation, Point[] path);

    /**
     * Walks along a specified path within a given region.
     *
     * @param region The region within which to walk the path.
     * @param path An array of Points representing the path to walk.
     * @return Boolean indicating whether the path was successfully walked.
     */
    Boolean walkPath(RegionBox region, Point[] path);
}