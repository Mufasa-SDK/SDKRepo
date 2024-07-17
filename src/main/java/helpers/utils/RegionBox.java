package helpers.utils;

import org.opencv.core.Point;

/**
 * Represents a rectangular region defined by two coordinates in a coordinate space.
 * This class is useful for defining areas, zones, or regions within a game or application interface.
 */
public class RegionBox {
    private final String name;
    public int x1, y1, x2, y2;

    /**
     * Constructs a new RegionBox with specified coordinates and a name.
     *
     * @param name The name of the region.
     * @param x1 The x-coordinate of the first corner.
     * @param y1 The y-coordinate of the first corner.
     * @param x2 The x-coordinate of the opposite corner.
     * @param y2 The y-coordinate of the opposite corner.
     */
    public RegionBox(String name, int x1, int y1, int x2, int y2) {
        this.name = name;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Getters and setters for the fields
    /**
     * Gets the name of the region.
     *
     * @return The name of the region.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the x-coordinate of the first corner of the region.
     *
     * @return The x-coordinate of the first corner.
     */
    public int getX1() {
        return x1;
    }

    /**
     * Sets the x-coordinate of the first corner of the region.
     *
     * @param x1 The new x-coordinate of the first corner.
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     * Gets the y-coordinate of the first corner of the region.
     *
     * @return The y-coordinate of the first corner.
     */
    public int getY1() {
        return y1;
    }

    /**
     * Sets the y-coordinate of the first corner of the region.
     *
     * @param y1 The new y-coordinate of the first corner.
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
     * Gets the x-coordinate of the opposite corner of the region.
     *
     * @return The x-coordinate of the opposite corner.
     */
    public int getX2() {
        return x2;
    }

    /**
     * Sets the x-coordinate of the opposite corner of the region.
     *
     * @param x2 The new x-coordinate of the opposite corner.
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * Gets the y-coordinate of the opposite corner of the region.
     *
     * @return The y-coordinate of the opposite corner.
     */
    public int getY2() {
        return y2;
    }

    /**
     * Sets the y-coordinate of the opposite corner of the region.
     *
     * @param y2 The new y-coordinate of the opposite corner.
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

    public boolean contains(Point p) {
        return p.x >= x1 && p.x <= x2 && p.y >= y1 && p.y <= y2;
    }

    public Point getOffset() {
        return new Point(x1, y1);
    }

    @Override
    public String toString() {
        return name;
    }
}