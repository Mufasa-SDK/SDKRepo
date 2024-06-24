package interfaces;

import java.awt.*;
import java.util.List;

/**
 * Interface defining methods for object detection and location within a game environment.
 * Provides functionality to find game objects based on image recognition within specified areas or distances.
 */
public interface iObjects {

    /**
     * Finds the first game object within a specified tile radius from the center of the game view.
     *
     * @param tileRadius The radius, in terms of tiles, to search within from the center.
     * @param filePath   Path to the image file used for object recognition.
     * @param returnAll  If true, returns all objects within the area; otherwise, returns only the first found object.
     * @return A list of Rectangles representing the locations and sizes of found objects; returns an empty list if no objects are found.
     */
    List<Rectangle> within(int tileRadius, boolean returnAll, String filePath);

    /**
     * Finds game objects within a specified area, either returning the first found or all within the area.
     *
     * @param rect       The Rectangle area within which to search for objects.
     * @param returnAll  If true, returns all objects within the area; otherwise, returns only the first found object.
     * @param filePath   Path to the image file used for object recognition.
     * @return A list of Rectangles representing the locations and sizes of found objects; returns an empty list if no objects are found.
     */
    java.util.List<Rectangle> within(Rectangle rect, boolean returnAll, String filePath);

    /**
     * Finds the game object nearest to the center of the game view.
     *
     * @param filePath Path to the image file used for object recognition.
     * @return A Rectangle representing the nearest object's location and size; returns null if no object is found.
     */
    Rectangle getNearest(String filePath);

    /**
     * Finds the game object that best matches the provided image file, based on a similarity threshold.
     * This method compares the specified image file against objects within the game view and identifies
     * the best match that meets or exceeds the given similarity threshold.
     *
     * @param filePath Path to the image file used for object recognition.
     * @param threshold The minimum similarity score required for a match. The threshold should be between 0 and 1,
     *                  where 1 indicates an exact match.
     * @return A Rectangle representing the location and size of the best matching game object; returns null if no
     *         suitable match is found.
     */
    Rectangle getBestMatch(String filePath, double threshold);
}