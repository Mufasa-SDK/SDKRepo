package helpers.utils;

import java.awt.*;

public class Area {
    private Tile topRightTile;
    private Tile bottomLeftTile;

    public Area(Tile topRightTile, Tile bottomLeftTile) {
        this.topRightTile = topRightTile;
        this.bottomLeftTile = bottomLeftTile;
    }

    // Getters
    public Tile getTopRightTile() {
        return topRightTile;
    }

    public Tile getBottomLeftTile() {
        return bottomLeftTile;
    }

    // Method to check if a point is within this area
    public boolean contains(Point point) {
        // Top-left corner of the top-right tile
        Point topLeftOfTopRightTile = topRightTile.getPoint();

        // Bottom-right corner of the bottom-left tile
        Point bottomRightOfBottomLeftTile = new Point(
                bottomLeftTile.getX() + bottomLeftTile.getWidth() - 1,
                bottomLeftTile.getY() + bottomLeftTile.getHeight() - 1
        );

        // Check if the point is within the bounds
        return point.x >= topLeftOfTopRightTile.x && point.x <= bottomRightOfBottomLeftTile.x &&
                point.y >= topLeftOfTopRightTile.y && point.y <= bottomRightOfBottomLeftTile.y;
    }

    // Method to get the width of the area
    public int getWidth() {
        return topRightTile.getX() - bottomLeftTile.getX() + 1;
    }

    // Method to get the height of the area
    public int getHeight() {
        return topRightTile.getY() - bottomLeftTile.getY() + 1;
    }
}

