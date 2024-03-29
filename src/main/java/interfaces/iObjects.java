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
}