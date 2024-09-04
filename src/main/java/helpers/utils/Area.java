package helpers.utils;

import java.util.Random;

/**
 * Represents a rectangular area defined by two {@link Tile} objects, one for the top-left corner and the other for the bottom-right corner.
 */
public class Area {
    private final Random random = new Random();

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

    /**
     * Returns a randomly selected {@link Tile} within the area.
     *
     * @return a random {@link Tile} within the bounds of the area.
     */
    public Tile getRandomTile() {
        int minX = Math.min(topTile.x(), bottomTile.x());
        int maxX = Math.max(topTile.x(), bottomTile.x());
        int minY = Math.min(topTile.y(), bottomTile.y());
        int maxY = Math.max(topTile.y(), bottomTile.y());
        int minZ = Math.min(topTile.z(), bottomTile.z());
        int maxZ = Math.max(topTile.z(), bottomTile.z());

        int randomX = minX + random.nextInt(maxX - minX + 1);
        int randomY = minY + random.nextInt(maxY - minY + 1);
        int randomZ = minZ + random.nextInt(maxZ - minZ + 1);

        return new Tile(randomX, randomY, randomZ);
    }

    public static Tile getRandomTile(Area area) {
        int minX = Math.min(area.getTopTile().x(), area.getBottomTile().x());
        int maxX = Math.max(area.getTopTile().x(), area.getBottomTile().x());
        int minY = Math.min(area.getTopTile().y(), area.getBottomTile().y());
        int maxY = Math.max(area.getTopTile().y(), area.getBottomTile().y());
        int minZ = Math.min(area.getTopTile().z(), area.getBottomTile().z());
        int maxZ = Math.max(area.getTopTile().z(), area.getBottomTile().z());

        Random random = new Random();
        int randomX = minX + random.nextInt(maxX - minX + 1);
        int randomY = minY + random.nextInt(maxY - minY + 1);
        int randomZ = minZ + random.nextInt(maxZ - minZ + 1);

        return new Tile(randomX, randomY, randomZ);
    }

    /**
     * Returns a string representation of the area, using the string representation of the top-left and bottom-right tiles.
     *
     * @return A string in the format "Area[Tile(x, y), Tile(x, y)]"
     */
    @Override
    public String toString() {
        return "Area[" + topTile + ", " + bottomTile + "]";
    }
}