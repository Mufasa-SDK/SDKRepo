package helpers.utils;

/**
 * Defines the compass direction options for the minimap rotation.
 * The default direction is {@code NORTH}, which represents no rotation.
 * The other directions represent the required rotation to align the minimap so that the given direction faces North.
 */
public enum CompassAngle {

    /**
     * Represents the North direction.
     * This is the default orientation where no rotation is needed.
     */
    NORTH,

    /**
     * Represents the South direction.
     */
    SOUTH,

    /**
     * Represents the East direction.
     */
    EAST,

    /**
     * Represents the West direction.
     */
    WEST
}