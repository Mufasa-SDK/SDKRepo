package interfaces;

import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.Map;

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
     * Simulates a long press at the specified coordinates and then searches for a specific string in the menu that appears to tap on.
     *
     * @param x           The x-coordinate for the long press action.
     * @param y           The y-coordinate for the long press action.
     * @param rectHeight  The height of the region to search for the menu.
     * @param rectWidth   The width of the region to search for the menu.
     * @param colors      The list of colors (of the text) to target in the menu.
     * @param stringToFind The string to search for in the menu.
     */
    void longPressWithMenuAction(int x, int y, int rectHeight, int rectWidth, List<Color> colors, String stringToFind);

    /**
     * Simulates a long press at the specified coordinates and then searches for a specific string in the menu that appears to tap on.
     * This version allows the use of letter patterns for finding the menu options.
     *
     * @param x             The x-coordinate for the long press action.
     * @param y             The y-coordinate for the long press action.
     * @param rectHeight    The height of the region to search for the menu.
     * @param rectWidth     The width of the region to search for the menu.
     * @param letterPatterns The map containing letter patterns for the OCR matching of the menu text.
     * @param colors        The list of colors (of the text) to target in the menu.
     * @param stringToFind  The string to search for in the menu.
     */
    void longPressWithMenuAction(int x, int y, int rectHeight, int rectWidth, Map<String, int[][]> letterPatterns, List<Color> colors, String stringToFind);
    /**
     * Sends a specific keystroke to the client.
     *
     * @param keystroke the string representing the keystroke to be sent.
     */

    /**
     * Simulates a long press at the specified coordinates and then searches for a specific string in the menu that appears to tap on.
     *
     * @param clickRect     The java.awt.Rectangle to randomly tap in
     * @param rectHeight  The height of the region to search for the menu.
     * @param rectWidth   The width of the region to search for the menu.
     * @param colors      The list of colors (of the text) to target in the menu.
     * @param stringToFind The string to search for in the menu.
     */
    void longPressWithMenuAction(Rectangle clickRect, int rectHeight, int rectWidth, List<Color> colors, String stringToFind);

    /**
     * Simulates a long press at the specified coordinates and then searches for a specific string in the menu that appears to tap on.
     * This version allows the use of letter patterns for finding the menu options.
     *
     * @param clickRect     The java.awt.Rectangle to randomly tap in
     * @param rectHeight    The height of the region to search for the menu.
     * @param rectWidth     The width of the region to search for the menu.
     * @param letterPatterns The map containing letter patterns for the OCR matching of the menu text.
     * @param colors        The list of colors (of the text) to target in the menu.
     * @param stringToFind  The string to search for in the menu.
     */
    void longPressWithMenuAction(Rectangle clickRect, int rectHeight, int rectWidth, Map<String, int[][]> letterPatterns, List<Color> colors, String stringToFind);

    /**
     * Simulates a tap at the specified coordinates and then searches for a specific string in the menu that appears to tap on.
     * THIS SHOULD ONLY BE USED IN COMBINATION WITH SINGLE-TAP MODE!
     *
     * @param x           The x-coordinate for the long press action.
     * @param y           The y-coordinate for the long press action.
     * @param rectHeight  The height of the region to search for the menu.
     * @param rectWidth   The width of the region to search for the menu.
     * @param colors      The list of colors (of the text) to target in the menu.
     * @param stringToFind The string to search for in the menu.
     */
    void tapWithMenuAction(int x, int y, int rectHeight, int rectWidth, List<Color> colors, String stringToFind);

    /**
     * Simulates a tap at the specified coordinates and then searches for a specific string in the menu that appears to tap on.
     * This version allows the use of letter patterns for finding the menu options.
     * THIS SHOULD ONLY BE USED IN COMBINATION WITH SINGLE-TAP MODE!
     *
     * @param x             The x-coordinate for the long press action.
     * @param y             The y-coordinate for the long press action.
     * @param rectHeight    The height of the region to search for the menu.
     * @param rectWidth     The width of the region to search for the menu.
     * @param letterPatterns The map containing letter patterns for the OCR matching of the menu text.
     * @param colors        The list of colors (of the text) to target in the menu.
     * @param stringToFind  The string to search for in the menu.
     */
    void tapWithMenuAction(int x, int y, int rectHeight, int rectWidth, Map<String, int[][]> letterPatterns, List<Color> colors, String stringToFind);

    /**
     * Simulates a tap at the specified coordinates and then searches for a specific string in the menu that appears to tap on.
     * THIS SHOULD ONLY BE USED IN COMBINATION WITH SINGLE-TAP MODE!
     *
     * @param clickRect     The java.awt.Rectangle to randomly tap in
     * @param rectHeight  The height of the region to search for the menu.
     * @param rectWidth   The width of the region to search for the menu.
     * @param colors      The list of colors (of the text) to target in the menu.
     * @param stringToFind The string to search for in the menu.
     */
    void tapWithMenuAction(Rectangle clickRect, int rectHeight, int rectWidth, List<Color> colors, String stringToFind);

    /**
     * Simulates a tap at the specified coordinates and then searches for a specific string in the menu that appears to tap on.
     * This version allows the use of letter patterns for finding the menu options.
     * THIS SHOULD ONLY BE USED IN COMBINATION WITH SINGLE-TAP MODE!
     *
     * @param clickRect     The java.awt.Rectangle to randomly tap in
     * @param rectHeight    The height of the region to search for the menu.
     * @param rectWidth     The width of the region to search for the menu.
     * @param letterPatterns The map containing letter patterns for the OCR matching of the menu text.
     * @param colors        The list of colors (of the text) to target in the menu.
     * @param stringToFind  The string to search for in the menu.
     */
    void tapWithMenuAction(Rectangle clickRect, int rectHeight, int rectWidth, Map<String, int[][]> letterPatterns, List<Color> colors, String stringToFind);

    /**
     * Searches for a specific string in the menu to tap on.
     *
     * @param searchArea    The area to search your menu option in.
     * @param letterPatterns The map containing letter patterns for the OCR matching of the menu text.
     * @param colors        The list of colors (of the text) to target in the menu.
     * @param stringToFind  The string to search for in the menu.
     */
    void findAndTapMenuOption(Rectangle searchArea, List<Color> colors, Map<String, int[][]> letterPatterns, String stringToFind);

    /**
     * Searches for a specific string in the menu to tap on.
     * This version allows the use of letter patterns for finding the menu options.
     *
     * @param searchArea    The area to search your menu option in.
     * @param colors        The list of colors (of the text) to target in the menu.
     * @param stringToFind  The string to search for in the menu.
     */
    void findAndTapMenuOption(Rectangle searchArea, List<Color> colors, String stringToFind);

    /**
     * Performs a drag/swipe action with a start/end area and a duration.
     * The X/Y (both start and end) are slightly randomized, as well as the duration.
     *
     * @param startX The X coordinate to initiate the swipe/drag action from
     * @param startY The Y coordinate to initiate the swipe/drag action from
     * @param endX The X coordinate to end the swipe/drag action from
     * @param endY The Y coordinate to end the swipe/drag action from
     * @param duration The duration in ms of how long the swipe/drag action should take
     */
    void drag(int startX, int startY, int endX, int endY, int duration);

    /**
     * Performs a drag/swipe action with a start/end area and a duration.
     * The rectangles (both start and end) are used to randomly pick points within it.
     * The duration is also slightly randomized each time.
     *
     * @param startRect The java.awt.Rectangle to initiate the swipe/drag action from (random coordinate picked from within your rectangle)
     * @param endRect The java.awt.Rectangle to end the swipe/drag action from (random coordinate picked from within your rectangle)
     * @param duration The duration in ms of how long the swipe/drag action should take
     */
    void drag(Rectangle startRect, Rectangle endRect, int duration);

    /**
     * Performs a drag/swipe action with a start/end area and a duration.
     * The X/Y (both start and end points) are slightly randomized, as well as the duration.
     *
     * @param startPoint The java.awt.Point to initiate the swipe/drag action from
     * @param endPoint The java.awt.Point to end the swipe/drag action from
     * @param duration The duration in ms of how long the swipe/drag action should take
     */
    void drag(Point startPoint, Point endPoint, int duration);

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
     * Postpones the scheduled breaks for the current emulator.
     * <p>
     * This method sets a flag to prevent breaks from occurring while the current script
     * is performing important actions. Once postponed, breaks will remain on hold
     * until {@link #resumeBreaks()} is called.
     */
    void postponeBreaks();

    /**
     * Resumes the ability for breaks to occur for the current emulator.
     * <p>
     * This method clears the flag set by {@link #postponeBreaks()} and allows the
     * break handler to proceed with scheduling or starting breaks as normal.
     */
    void resumeBreaks();

    /**
     * Starts a forced break for the current emulator.
     * <p>
     * This method forces a break for the specified duration, using client built-in logout/login handler.
     *
     * @param timeMilis The duration of the forced break in milliseconds.
     */
    void startBreak(Long timeMilis);

    /**
     * Checks if the client is expecting a break to be done
     *
     * @return True if a break is due
     */
    boolean isTimeForBreak();

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