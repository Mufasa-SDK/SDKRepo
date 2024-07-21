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
     * Simulates a tap action at a specified coordinate using a java.awt.Point.
     *
     * @param points A list of points chosen at random to tap.
     */
    void tap(List<Point> points);

    /**
     * Simulates a tap action at a specified coordinate using a java.awt.Point.
     *
     * @param points A list of points chosen at random to tap.
     * @param tapWithinRandom Using this it will generate a random weighted point from within your list of points to tap
     */
    void tap(List<Point> points, boolean tapWithinRandom);

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
     * Simulates a long press action at a specified coordinate with a list of points to generate its bounding and weighted taps from.
     *
     * @param points the points list you want to generate a tap from
     */
    void longPress(List<Point> points);

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
     * Retrieves a list of rectangles containing objects of specified colors with the given tolerance level.
     *
     * @param colors        The list of colors to search for.
     * @param tolerance     The tolerance level for color matching.
     * @return              A list of rectangles containing objects of the specified colors.
     */
    public List<Rectangle> getObjectsFromColor(List<Color> colors, int tolerance);

    /**
     * Retrieves a list of rectangles containing objects of specified colors with the given tolerance level,
     * excluding objects of specified exclusion colors with the given exclusion tolerance.
     *
     * @param colors            The list of colors to search for.
     * @param tolerance         The tolerance level for color matching.
     * @param exclusionColors   The list of colors to exclude from the search.
     * @param exclusionTolerance    The tolerance level for excluding colors.
     * @return                  A list of rectangles containing objects of the specified colors, excluding those
     *                          of the specified exclusion colors.
     */
    public List<Rectangle> getObjectsFromColor(List<Color> colors, int tolerance, List<Color> exclusionColors, int exclusionTolerance);

    /**
     * Retrieves a list of rectangles containing objects of specified colors within the given search rectangle.
     *
     * @param colors        The list of colors to search for.
     * @param searchRect    The rectangle within which to search for the colors.
     * @param tolerance     The tolerance level for color matching.
     * @return              A list of rectangles containing objects of the specified colors.
     */
    public List<Rectangle> getObjectsFromColorsInRect(List<Color> colors, Rectangle searchRect, int tolerance);

    /**
     * Retrieves a list of rectangles containing objects of specified colors within the given search rectangle,
     * excluding objects of specified exclusion colors.
     *
     * @param colors            The list of colors to search for.
     * @param searchRect        The rectangle within which to search for the colors.
     * @param tolerance         The tolerance level for color matching.
     * @param exclusionColors   The list of colors to exclude from the search.
     * @param exclusionTolerance    The tolerance level for excluding colors.
     * @return                  A list of rectangles containing objects of the specified colors, excluding those
     *                          of the specified exclusion colors.
     */
    public List<Rectangle> getObjectsFromColorsInRect(List<Color> colors, Rectangle searchRect, int tolerance, List<Color> exclusionColors, int exclusionTolerance);

    /**
     * Retrieves points on the current emulator screen where specified colors are found,
     * considering a specified tolerance for color matching. This method acts as a convenience
     * wrapper by fetching the current emulator ID and delegating the color search.
     *
     * @param colors A list of {@link Color} objects representing the colors to search for.
     * @param tolerance An int value representing the tolerance used for matching the colors.
     *                  The higher the tolerance, the more variations of the color will be accepted.
     * @return A List of {@link Point} objects, each point representing the location on the screen
     *         where one of the specified colors was detected.
     */
    public List<Point> getPointsFromColors(List<Color> colors, int tolerance);

    /**
     * Retrieves points on the current emulator screen where specified colors are found,
     * excluding specified colors within a certain tolerance, and considering a specified
     * tolerance for the target colors. This method provides an enhanced search by excluding
     * unwanted colors and is a convenience wrapper that fetches the current emulator ID
     * and delegates the color search.
     *
     * @param colors A list of {@link Color} objects representing the colors to search for.
     * @param tolerance An int value representing the tolerance used for matching the target colors.
     *                  The higher the tolerance, the more variations of the color will be accepted.
     * @param exclusionColors A list of {@link Color} objects representing the colors to be excluded from the search.
     * @param exclusionTolerance An int value representing the tolerance used to exclude the unwanted colors.
     *                           Similar to 'tolerance', the higher this value, the more variations of the exclusion colors will be ignored.
     * @return A List of {@link Point} objects, each point representing the location on the screen
     *         where one of the specified target colors was detected, excluding any matches found
     *         within the exclusion tolerance for the colors specified in 'exclusionColors'.
     */
    public List<Point> getPointsFromColors(List<Color> colors, int tolerance, List<Color> exclusionColors, int exclusionTolerance);


    /**
     * Searches for specified colors within a defined rectangular area of the game screen,
     * taking into account a specified color tolerance for matching. This method will return
     * a list of points where the colors were found.
     *
     * @param colors A list of {@link Color} objects representing the colors to search for.
     * @param searchRect A {@link Rectangle} defining the area within which to search for the colors.
     * @param tolerance An int value representing the tolerance used to match the colors.
     *               The higher the tolerance, the more variations of the color will be accepted.
     * @return A List of {@link Point} objects, each representing a pixel location where one of the specified colors was detected.
     */
    public List<Point> getPointsFromColorsInRect(List<Color> colors, Rectangle searchRect, int tolerance);

    /**
     * Searches for specified colors within a defined rectangular area of the game screen,
     * excluding specified colors within a certain tolerance, and taking into account a specified
     * color tolerance for the target colors. This method returns a list of points where the target
     * colors were found, excluding the specified unwanted colors.
     *
     * @param colors A list of {@link Color} objects representing the colors to search for.
     * @param searchRect A {@link Rectangle} defining the area within which to search for the colors.
     * @param tolerance An int value representing the tolerance used to match the target colors.
     *               The higher the tolerance, the more variations of the color will be accepted.
     * @param exclusionColors A list of {@link Color} objects representing the colors to be excluded from the search.
     * @param exclusionTolerance An int value representing the tolerance used to exclude the unwanted colors.
     *               Similar to 'tolerance', the higher this value, the more variations of the exclusion colors will be ignored.
     * @return A List of {@link Point} objects, each representing a pixel location where one of the specified target colors was detected,
     *         excluding any matches found within the exclusion tolerance for the colors specified in 'exclusionColors'.
     */
    public List<Point> getPointsFromColorsInRect(List<Color> colors, Rectangle searchRect, int tolerance, List<Color> exclusionColors, int exclusionTolerance);
}