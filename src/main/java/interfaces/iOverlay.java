package interfaces;

import java.awt.*;
import java.util.List;

/**
 * Interface defining interactions with graphical overlays in a game or application.
 * This interface provides a method to find overlays based on color specifications.
 */
public interface iOverlay {
    /**
     * Scans the game view for fishing overlays within the specified search area and returns a list of rectangles
     * representing the bounding boxes of the detected fishing overlays.
     *
     * @param searchArea The area within which to search for fishing overlays.
     * @return A list of rectangles representing the bounding boxes of the detected fishing overlays.
     */
    List<Rectangle> findFishingOverlay(Rectangle searchArea);

    /**
     * Scans the game view for fishing overlays within the specified search area and returns the bounding box
     * of the nearest detected fishing overlay.
     *
     * @param searchArea The area within which to search for the nearest fishing overlay.
     * @return A rectangle representing the bounding box of the nearest detected fishing overlay.
     */
    Rectangle findNearestFishing(Rectangle searchArea);

    /**
     * Scans the game view for fishing overlays within the specified search area and returns the bounding box
     * of the second nearest detected fishing overlay.
     *
     * @param searchArea The area within which to search for the second nearest fishing overlay.
     * @return A rectangle representing the bounding box of the second nearest detected fishing overlay.
     */
    Rectangle findSecondNearestFishing(Rectangle searchArea);

    /**
     * Scans the game view for agility overlays within the specified search area and returns a list of rectangles
     * representing the bounding boxes of the detected agility overlays.
     *
     * @param searchArea The area within which to search for agility overlays.
     * @return A list of rectangles representing the bounding boxes of the detected agility overlays.
     */
    List<Rectangle> findAgilityOverlay(Rectangle searchArea);

    /**
     * Scans the game view for agility overlays within the specified search area and returns the bounding box
     * of the nearest detected agility overlay.
     *
     * @param searchArea The area within which to search for the nearest agility overlay.
     * @return A rectangle representing the bounding box of the nearest detected agility overlay.
     */
    Rectangle findNearestAgility(Rectangle searchArea);

    /**
     * Scans the game view for agility overlays within the specified search area and returns the bounding box
     * of the second nearest detected agility overlay.
     *
     * @param searchArea The area within which to search for the second nearest agility overlay.
     * @return A rectangle representing the bounding box of the second nearest detected agility overlay.
     */
    Rectangle findSecondNearestAgility(Rectangle searchArea);

    /**
     * Scans the game view for ground item overlays within the specified search area and returns a list of rectangles
     * representing the bounding boxes of the detected ground item overlays.
     *
     * @param searchArea The area within which to search for ground item overlays.
     * @return A list of rectangles representing the bounding boxes of the detected ground item overlays.
     */
    List<Rectangle> findGroundItems(Rectangle searchArea);

    /**
     * Scans the game view for ground item overlays within the specified search area and returns the bounding box
     * of the nearest detected ground item overlay.
     *
     * @param searchArea The area within which to search for the nearest ground item overlay.
     * @return A rectangle representing the bounding box of the nearest detected ground item overlay.
     */
    Rectangle findNearestGroundItem(Rectangle searchArea);

    // *****************************
    // OLD METHODS!!!!!!!!
    // *****************************
    /**
     * Finds and returns a list of polygons representing overlays of a specified color.
     * This method can be used to identify areas in the interface where the given color is predominant.
     *
     * @param color The color to search for in the overlays.
     * @return List of {@link Polygon} objects, each representing an area where the specified color is found.
     */
    List<Polygon> findOverlays(Color color);

    /**
     * Finds and returns the polygon representing the overlay that is closest to the center of the screen.
     * This method is useful when there is a need to interact with the overlay nearest to the focal point of the user interface.
     *
     * @param color The color to search for in the overlays.
     * @return The {@link Polygon} closest to the center of the screen where the specified color is predominant.
     *         Returns null if no matching overlays are found.
     */
    Polygon findNearest(Color color);

    /**
     * Finds and returns the polygon representing the overlay that is second closest to the center of the screen.
     * This method is useful when there is a need to interact with the overlay second nearest to the focal point of the user interface, when it is not feasible using the closest one.
     *
     * @param color The color to search for in the overlays.
     * @return The {@link Polygon} second closest to the center of the screen where the specified color is predominant.
     *         Returns null if no matching overlays are found.
     */
    Polygon findSecondNearest(Color color);
}
