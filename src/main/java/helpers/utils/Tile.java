package helpers.utils;

/**
 * Represents a tile with x and y coordinates.
 */
public class Tile {
    private int x;
    private int y;

    /**
     * Constructs a new Tile with the specified x and y coordinates.
     *
     * @param x The x coordinate of the tile.
     * @param y The y coordinate of the tile.
     */
    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x coordinate of the tile.
     *
     * @return The x coordinate of the tile.
     */
    public int x() {
        return x;
    }

    /**
     * Gets the y coordinate of the tile.
     *
     * @return The y coordinate of the tile.
     */
    public int y() {
        return y;
    }

    /**
     * Returns a string representation of the tile with its coordinates.
     *
     * @return A string in the format "Tile(x, y)"
     */
    @Override
    public String toString() {
        return "Tile(" + x + ", " + y + ")";
    }
}