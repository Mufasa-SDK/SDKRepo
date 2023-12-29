package interfaces;

import java.awt.*;
import java.util.List;

/**
 * Interface defining interactions with graphical overlays in a game or application.
 * This interface provides a method to find overlays based on color specifications.
 */
public interface iOverlay {

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
}
