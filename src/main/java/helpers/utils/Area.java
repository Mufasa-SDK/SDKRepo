package helpers.utils;

/**
 * Represents a rectangular area defined by two {@link Tile} objects, one for the top-left corner and the other for the bottom-right corner.
 */
public class Area {

    /**
     * The {@link Tile} representing the top-left corner of the area.
     */
    private final Tile topLeft;

    /**
     * The {@link Tile} representing the bottom-right corner of the area.
     */
    private final Tile bottomRight;

    /**
     * Constructs an {@code Area} object with specified top-left and bottom-right corners.
     *
     * @param topLeft The {@link Tile} representing the top-left corner of the area.
     * @param bottomRight The {@link Tile} representing the bottom-right corner of the area.
     */
    public Area(Tile topLeft, Tile bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    /**
     * Returns the {@link Tile} representing the top-left corner of the area.
     *
     * @return The {@link Tile} at the top-left corner.
     */
    public Tile getTopLeft() {
        return topLeft;
    }

    /**
     * Returns the {@link Tile} representing the bottom-right corner of the area.
     *
     * @return The {@link Tile} at the bottom-right corner.
     */
    public Tile getBottomRight() {
        return bottomRight;
    }
}