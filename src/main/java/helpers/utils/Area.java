package helpers.utils;

/**
 * Represents a rectangular area defined by two {@link Tile} objects, one for the top-left corner and the other for the bottom-right corner.
 */
public class Area {

    /**
     * The {@link Tile} representing the top-left corner of the area.
     */
    private final Tile topTile;

    /**
     * The {@link Tile} representing the bottom-right corner of the area.
     */
    private final Tile bottomTile;

    /**
     * Constructs an {@code Area} object with specified top-left and bottom-right corners.
     *
     * @param topTile The {@link Tile} representing the top-left corner of the area.
     * @param bottomTile The {@link Tile} representing the bottom-right corner of the area.
     */
    public Area(Tile topTile, Tile bottomTile) {
        this.topTile = topTile;
        this.bottomTile = bottomTile;
    }

    /**
     * Returns the {@link Tile} representing the top-left corner of the area.
     *
     * @return The {@link Tile} at the top.
     */
    public Tile getTopTile() {
        return topTile;
    }

    /**
     * Returns the {@link Tile} representing the bottom-right corner of the area.
     *
     * @return The {@link Tile} at the bottom.
     */
    public Tile getBottomTile() {
        return bottomTile;
    }
}