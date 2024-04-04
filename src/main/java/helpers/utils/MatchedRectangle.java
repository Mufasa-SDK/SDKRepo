package helpers.utils;

import java.awt.Rectangle;

/**
 * Represents a rectangle matched in some process, extending the standard Rectangle class
 * with an additional match value attribute.
 */
public class MatchedRectangle extends Rectangle {
    private double matchValue;

    /**
     * Constructs a new MatchedRectangle with the specified coordinates, size, and match value.
     *
     * @param x The x coordinate of the upper-left corner of the rectangle.
     * @param y The y coordinate of the upper-left corner of the rectangle.
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     * @param matchValue The match value of the rectangle, representing how closely it matches a criterion.
     */
    public MatchedRectangle(int x, int y, int width, int height, double matchValue) {
        super(x, y, width, height);
        this.matchValue = matchValue;
    }

    /**
     * Constructs a new MatchedRectangle with specified coordinates and size, without a match value.
     * The match value is implicitly set to 0.
     *
     * @param x The x coordinate of the upper-left corner of the rectangle.
     * @param y The y coordinate of the upper-left corner of the rectangle.
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public MatchedRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.matchValue = 0.0; // Default match value
    }

    /**
     * Gets the match value of the rectangle.
     *
     * @return The match value of the rectangle.
     */
    public double getMatchValue() {
        return matchValue;
    }

    /**
     * Sets the match value of the rectangle.
     *
     * @param matchValue The new match value to set.
     */
    public void setMatchValue(double matchValue) {
        this.matchValue = matchValue;
    }
}
