package helpers.utils;

import java.awt.*;
import java.util.Objects;

/**
 * A convenience class to represent an ItemID and its associated checkColor.
 *
 * @since 1.0
 */
public class ItemPair {

    /**
     * The ItemID of this ItemPair.
     */
    private final int itemID;

    /**
     * The checkColor of this ItemPair.
     */
    private final Color checkColor;

    /**
     * Creates a new ItemPair with the specified ItemID and checkColor.
     *
     * @param itemID     the ItemID for this pair
     * @param checkColor the checkColor to use for this pair
     */
    public ItemPair(int itemID, Color checkColor) {
        this.itemID = itemID;
        this.checkColor = checkColor;
    }

    /**
     * Gets the ItemID of this pair.
     *
     * @return the ItemID
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * Gets the checkColor of this pair.
     *
     * @return the checkColor
     */
    public Color getCheckColor() {
        return checkColor;
    }

    /**
     * Returns a string representation of this ItemPair.
     *
     * @return a string representation of this ItemPair
     */
    @Override
    public String toString() {
        return "ItemID=" + itemID + ", checkColor=" + checkColor;
    }

    /**
     * Generates a hash code for this ItemPair.
     * The hash code is based on both the ItemID and the checkColor.
     *
     * @return the hash code value for this ItemPair
     */
    @Override
    public int hashCode() {
        return Objects.hash(itemID, checkColor);
    }

    /**
     * Compares this ItemPair to the specified object.
     * The result is true if and only if the argument is not null and is an ItemPair object
     * that has the same ItemID and checkColor as this object.
     *
     * @param obj the object to compare this ItemPair against
     * @return true if the given object represents an ItemPair equivalent to this ItemPair, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof ItemPair) {
            ItemPair other = (ItemPair) obj;
            return this.itemID == other.itemID &&
                    Objects.equals(this.checkColor, other.checkColor);
        }

        return false;
    }
}