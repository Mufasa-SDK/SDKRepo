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
        // Check if the point is within the horizontal and vertical bounds of the area
        return point.x >= bottomLeftTile.getTopLeft().x && point.x <= topRightTile.getBottomRight().x &&
                point.y >= bottomLeftTile.getTopLeft().y && point.y <= topRightTile.getBottomRight().y;
    }

    // Method to get the width of the area
    public int getWidth() {
        return topRightTile.getBottomRight().x - bottomLeftTile.getTopLeft().x + 1;
    }

    // Method to get the height of the area
    public int getHeight() {
        return topRightTile.getBottomRight().y - bottomLeftTile.getTopLeft().y + 1;
    }
}

