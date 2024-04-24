package interfaces;

import java.awt.*;
import java.io.File;
import java.util.List;

/**
 * Interface defining the actions for client interaction.
 * This interface provides methods for simulating various user interactions like tapping, long pressing,
 * sending keystrokes, and more.
 */
public interface iClient {

    /**
     * Simulates a tap action at a specified coordinate.
     *
     * @param x the x-coordinate for the tap action.
     * @param y the y-coordinate for the tap action.
     */
    void tap(int x, int y);

    /**
     * Simulates a tap action at a specified coordinate using a java.awt.Point.
     *
     * @param point The point that contains the x,y coordinates to tap.
     */
    void tap(Point point);

    /**
     * Simulates a tap action on a specific color within a defined area.
     *
     * @param targetColor the color to target for the tap.
     * @param boundingArea The area on the screen you'd like to search in
     * @param tolerance the color tolerance for matching the target color, 0-100, usually 0-15 is enough.
     */
    void tap(Color targetColor, Rectangle boundingArea, int tolerance);
    /**
     * Simulates a tap action inside a specific polygon.
     *
     * @param polygon the polygon you wish to do the tap in.
     */
    void tap (Polygon polygon);
    /**
     * Simulates a tap action inside a specific polygon.
     *
     * @param rectangle the rectangle you wish to do the tap in.
     */
    void tap (Rectangle rectangle);
    /**
     * Simulates a long press action at a specified coordinate.
     *
     * @param x the x-coordinate for the long press action.
     * @param y the y-coordinate for the long press action.
     */
    void longPress(int x, int y);

    /**
     * Simulates a long press action on a specific color within a defined area.
     *
     * @param targetColor the color to target for the long press.
     * @param boundingArea The area on the screen you'd like to search in
     * @param tolerance the color tolerance for matching the target color.
     */
    void longPress(Color targetColor, Rectangle boundingArea, int tolerance);

    /**
     * Simulates a long press action within a specified rectangle area.
     *
     * @param rectangle the rectangle area where the long press should occur.
     */
    void longPress(Rectangle rectangle);

    /**
     * Sends a specific keystroke to the client.
     *
     * @param keystroke the string representing the keystroke to be sent.
     */
    void sendKeystroke(String keystroke);

    /**
     * Restarts the application associated with this client.
     */
    void restartApp();

    /**
     * Simulates the action of moving the camera up.
     */
    void moveCameraUp();

    /**
     * Disables the internal Break handler. Do note that you will have to manage breaks yourself with the login/logout methods and a custom implementation.
     *
     * @return Break handler stopped or not
     */
    boolean disableBreakHandler();

    /**
     * Enables the internal Break handler again if you disabled it.
     *
     * @return Break handler enabled or not
     */
    boolean enableBreakHandler();

    /**
     * Disables the internal AFK handler. Do note that you will have to manage AFK's yourself with a custom implementation.
     *
     * @return AFK handler stopped or not
     */
    public boolean disableAFKHandler();

    /**
     * Enables the internal AFK handler again if you disabled it.
     *
     * @return AFK handler enabled or not
     */
    public boolean enableAFKHandler();

    /**
     * Checks if a specified color is found within a rectangle area on the game screen
     *
     * @param targetColor the color to look for.
     * @param regionToSearch The area on the screen you'd like to search in
     * @param tolerance the color tolerance for matching the target color.
     * @return true/false if found or not
     */
    boolean isColorInRect(Color targetColor, Rectangle regionToSearch, int tolerance);

    /**
     * Checks if specified colors is found within a rectangle area on the game screen
     *
     * @param targetColors the colors to look for.
     * @param regionToSearch The area on the screen you'd like to search in
     * @param tolerance the color tolerance for matching the target color.
     * @return true/false if found or not
     */
    boolean isAnyColorInRect(List<Color> targetColors, Rectangle regionToSearch, int tolerance);

    /**
     * Checks if a specified color is found on a specific point on the game screen
     *
     * @param targetColor the color to look for.
     * @param pointToSearch The point on the screen you'd like to search in
     * @param tolerance the color tolerance for matching the target color.
     * @return true/false if found or not
     */
    boolean isColorAtPoint(Color targetColor, Point pointToSearch, int tolerance);

    /**
     * Checks if a specified color is found on the game screen
     *
     * @param colors a list of colors you want to search for
     * @param tolerance the color tolerance for matching the target color
     * @return a list of Rectangles that contain the found color clusters
     */
    List<Rectangle> getObjectsFromColor(List<Color> colors, int tolerance);

    /**
     * Checks if a specified color is found on the game screen within the given rectangle
     *
     * @param colors a list of colors you want to search for
     * @param searchRect the rectangle to search for color clusters in
     * @param tolerance the color tolerance for matching the target color
     * @return a list of Rectangles that contain the found color clusters
     */
    List<Rectangle> getObjectsFromColorsInRect(List<Color> colors, Rectangle searchRect, int tolerance);
}