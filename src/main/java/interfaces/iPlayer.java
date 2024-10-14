package interfaces;

import helpers.utils.Area;
import helpers.utils.Tile;

/**
 * Interface defining player interactions within the game
 */
public interface iPlayer {
    /**
     * Checks if the level-up widget is visible
     * @return Returns true if the widget is visible
     */
    boolean leveledUp();

    /**
     * Checks if the player is idle based on the median pixel shift.
     *
     * This method determines whether the player is currently idle by calculating
     * the median pixel shift over a set of recent frames. It compares the median shift
     * to a predefined threshold to determine if there is significant movement. If the
     * shift is below the threshold, the player is considered idle.
     *
     * @return {@code true} if the player is idle (i.e., the median pixel shift is below
     * the threshold), {@code false} otherwise.
     */
    boolean isIdle();

    /**
     * Calculates the current median pixel shift for the player.
     *
     * This method computes the pixel shift between the current frame and the last frame
     * captured, and stores the shift in a rolling cache. It then calculates the median
     * of the pixel shifts stored in the cache to smooth out short-term fluctuations.
     * The median shift can be used to analyze whether the player is moving or idle.
     *
     * @return the current median pixel shift as a {@code double}. If the cache is reset
     * due to frame expiration, the shift will be {@code 0.0} until new data is gathered.
     */
    double currentPixelShift();

    /**
     * Gets the player's current position and checks if it is within the specified area
     *
     * @param areaToSearchIn This is the Area of the custom map you want to check if you are in.
     * @return Returns a true/false boolean, true if you are in the RegionBox, false if not.
     */
    boolean within(Area areaToSearchIn);

    /**
     * Checks if player is at that specific tile within your set worldmap
     *
     * @param tileToCheck The tile to be checked for presence within the region defined in the map file.
     * @return true if the player is on the tile in the specified map, false otherwise.
     */
    boolean atTile(Tile tileToCheck);

    /**
     * Checks if a given tile is within a specified area.
     * <p>
     * This method determines whether the provided tile (represented by {@code tileToCheck})
     * is located within the bounds of the area defined by {@code areaToCheckWithin}.
     * <p>
     * @param tileToCheck The tile whose presence within the area is being checked.
     * @param areaToCheckWithin The area within which the tile's presence is checked.
     * @return true if {@code tileToCheck} is within the bounds of {@code areaToCheckWithin}, false otherwise.
     */
    boolean isTileWithinArea(Tile tileToCheck, Area areaToCheckWithin);

    /**
     * Compares two tiles for equality.
     * <p>
     * This method checks if the specified {@code originTile} and {@code tileToCheck} represent
     * the same tile.
     * <p>
     * @param originTile The first tile to be compared.
     * @param tileToCheck The second tile to be compared with the first tile.
     * @return true if both tiles are considered equal, false otherwise.
     */
    boolean tileEquals(Tile originTile, Tile tileToCheck);

    /**
     * Gets the player's current Prayer points based on the minimap orb.
     *
     * @return Returns an int that represents the current Prayer points value of the player.
     */
    int getPray();

    /**
     * Gets the player's current HP based on the minimap orb.
     *
     * @return Returns an int that represents the current HP value of the player.
     */
    int getHP();

    /**
     * Gets the player's current Special attack based on the minimap orb.
     *
     * @return Returns an int that represents the current Special attack energy value of the player.
     */
    int getSpec();

    /**
     * Gets the player's current Run energy based on the minimap orb.
     *
     * @return Returns an int that represents the current Run energy value of the player.
     */
    int getRun();

    /**
     * Checks if run is currently enabled or not.
     *
     * @return Returns a true/false boolean, true if run is enabled, false if not.
     */
    boolean isRunEnabled();

    /**
     * Toggles the run on/off, use isRunEnabled() to check if run is on or not, this will always toggle it on/off, no matter what it currently is on.
     *
     */
    void toggleRun();

    /**
     * Checks if auto retaliate is currently enabled or not.
     *
     * @return Returns a true/false boolean, true if auto retaliate is enabled, false if not.
     */
    boolean isAutoRetaliateOn();

    /**
     * Enables auto retaliate.
     *
     */
    void enableAutoRetaliate();

    /**
     * Disables auto retaliate.
     *
     */
    void disableAutoRetaliate();

    /**
     * Checks if we are moving within a predefined number of position checks.
     * The method continuously compares the current position of the device against its last recorded position.
     * Movement is detected if the position changes at least once during the specified checks.
     *
     * @param checkTimes the number of times the device's position is checked for movement
     * @return {@code true} if movement is detected within the given checks; {@code false} otherwise
     */
    boolean waitTillMoving(int checkTimes);

    /**
     * Verifies that the specified device remains stationary over a series of position checks.
     * The method checks the device's position repeatedly to ensure that it does not change.
     * If the position remains unchanged for the consecutive checks specified, the method concludes
     * that the device is not moving.
     *
     * @param checkTimes the number of times the device's position is checked for lack of movement
     * @return {@code true} if no movement is detected across all checks; {@code false} if any movement is detected
     */
    boolean waitTillNotMoving(int checkTimes);
}
