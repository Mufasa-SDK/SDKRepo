package helpers.utils;

/**
 * Represents a tile with x and y coordinates.
 */
public class Tile {
    public int x;
    public int y;
    public int z;

    /**
     * Constructs a new Tile with the specified x,y,z coordinates.
     *
     * @param x The x coordinate of the tile.
     * @param y The y coordinate of the tile.
     * @param z The z coordinate of the tile.
     */
    public Tile(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
     * Gets the z coordinate of the tile.
     *
     * @return The z coordinate of the tile.
     */
    public int z() {
        return z;
    }

    /**
     * Returns a string representation of the tile with its coordinates.
     *
     * @return A string in the format "Tile(x, y)"
     */
    @Override
    public String toString() {
        return "Tile(" + x + ", " + y + ", " + z + ")";
    }
}