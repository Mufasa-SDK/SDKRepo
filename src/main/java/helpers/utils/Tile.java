package helpers.utils;

import java.awt.Point;

public class Tile {
    private Point topLeft;
    private final int width = 3; // Fixed width for the tile
    private final int height = 3; // Fixed height for the tile

    public Tile(int x, int y) {
        this.topLeft = new Point(x, y);
    }

    public Point getBottomRight() {
        return new Point(topLeft.x + width - 1, topLeft.y + height - 1);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Method to check if a point is within this tile
    public boolean contains(Point point) {
        return point.x >= topLeft.x && point.x < topLeft.x + width &&
                point.y >= topLeft.y && point.y < topLeft.y + height;
    }
}
