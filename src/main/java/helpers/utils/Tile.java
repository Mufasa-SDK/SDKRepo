package helpers.utils;

import java.awt.Point;

public class Tile {
    private Point topLeft;
    private int x;
    private int y;
    private final int width = 3; // Fixed width for the tile
    private final int height = 3; // Fixed height for the tile

    public Tile(int x, int y) {
        this.topLeft = new Point(x, y);
        this.x = x;
        this.y = y;
    }

    public Point getPoint() {
        return topLeft;
    }
    public int getX() {return x;}
    public int getY() {return y;}

    // Method to check if a point is within this tile
    public boolean contains(Point point) {
        return point.x >= topLeft.x && point.x < topLeft.x + width &&
                point.y >= topLeft.y && point.y < topLeft.y + height;
    }
}
