package interfaces;

import helpers.utils.Area;
import helpers.utils.RegionBox;
import helpers.utils.Tile;

/**
 * Interface defining player interactions within the game
 */
public interface iPlayer {
    /**
     * Gets the player's current position and checks if it is within the specified RegionBox
     *
     * @param areaToSearchIn This is the Area of the world map area you'd like to search in.
     * @param mapRegion This is the RegionBox of the world map you want to check against.
     * @return Returns a true/false boolean, true if you are in the targetRegionBox, false if not.
     */
    boolean within(Area areaToSearchIn, RegionBox mapRegion);

    /**
     * Gets the player's current position based on a custom map and checks if it is within the specified RegionBox
     *
     * @param mapFileLocation This is string location of the custom map you'd like to search in.
     * @param areaToSearchIn This is the Area of the custom map you want to check if you are in.
     * @return Returns a true/false boolean, true if you are in the RegionBox, false if not.
     */
    boolean withinCustom(String mapFileLocation, Area areaToSearchIn);

    /**
     * Checks if a specific tile is within a given map region.
     *
     * @param tileToCheck The tile to be checked for presence within the map region.
     * @param mapRegion This is the RegionBox of the world map you want to check against.
     * @return true if the player is on the tile in the specified map region, false otherwise.
     */
    boolean atTile(Tile tileToCheck, RegionBox mapRegion);

    /**
     * Checks if a specific tile is within a region defined in a custom map file.
     *
     * @param mapFileLocation This is string location of the custom map you'd like to search in.
     * @param tileToCheck The tile to be checked for presence within the region defined in the map file.
     * @return true if the player is on the tile in the specified map, false otherwise.
     */
    boolean atTileCustom(String mapFileLocation, Tile tileToCheck);

    /**
     * Checks if a given tile is within a specified area.
     * <p>
     * This method determines whether the provided tile (represented by {@code tileToCheck})
     * is located within the bounds of the area defined by {@code areaToCheckWithin}. The area
     * is defined by two points: the top-left and the bottom-right tiles of the area, which
     * are expanded slightly (by an offset of 2 units) to include their boundaries.
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
     * @return Returns an integer that represents the current Prayer points value of the player.
     */
    Integer getPray();

    /**
     * Gets the player's current HP based on the minimap orb.
     *
     * @return Returns an integer that represents the current HP value of the player.
     */
    Integer getHP();

    /**
     * Gets the player's current Special attack based on the minimap orb.
     *
     * @return Returns an integer that represents the current Special attack energy value of the player.
     */
    Integer getSpec();

    /**
     * Gets the player's current Run energy based on the minimap orb.
     *
     * @return Returns an integer that represents the current Run energy value of the player.
     */
    Integer getRun();

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

}
