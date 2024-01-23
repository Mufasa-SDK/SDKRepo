package helpers.utils;

import java.awt.*;

public class Tile {
    private Point topLeft;
    private int x;
    private int y;
    private final int width = 3;
    private final int height = 3;

    public Tile(int x, int y) {
        this.topLeft = new Point(x, y);
        this.x = x;
        this.y = y;
    }

    public Point getPoint() {
        return topLeft;
    }
    public Rectangle getTile() {return new Rectangle(x, y, width, height);}
    public int getX() {return x;}
    public int getY() {return y;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}

    // Method to check if a point is within this tile
    public boolean contains(Point point) {
        return point.x >= topLeft.x && point.x < topLeft.x + width &&
                point.y >= topLeft.y && point.y < topLeft.y + height;
    }
}
