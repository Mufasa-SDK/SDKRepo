package interfaces;

import java.awt.*;

/**
 * Interface defining interactions with a game's inventory system.
 * This interface includes methods to check for the presence of items, count items,
 * find their positions, and interact with them in the inventory.
 */
public interface iInventory {
    /**
     * Checks if the inventory contains any of the specified items, based on a threshold.
     *
     * @param itemIDs   Array of item IDs to check in the inventory.
     * @param threshold The threshold value used for the check, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return boolean indicating whether any of the specified items are present in the inventory.
     */
    boolean contains(String[] itemIDs, double threshold);

    /**
     * Checks if the inventory contains a specific item, based on a threshold.
     *
     * @param itemID    The ID of the item to check in the inventory.
     * @param threshold The threshold value used for the check, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return boolean indicating whether the specified item is present in the inventory.
     */
    boolean contains(String itemID, double threshold);

    /**
     * Checks if the inventory contains any of the specified items, based on a threshold.
     *
     * @param itemIDs    The ID of the item to check in the inventory.
     * @param threshold The threshold value used for the check, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return boolean indicating whether the specified item is present in the inventory.
     */
    boolean containsAny(int[] itemIDs, double threshold);

    /**
     * Checks if the inventory contains all the specific items, based on a threshold.
     *
     * @param itemIDs    The ID of the item to check in the inventory.
     * @param threshold The threshold value used for the check, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return boolean indicating whether the specified item is present in the inventory.
     */
    boolean containsAll(int[] itemIDs, double threshold);

    /**
     * Checks if the inventory contains a specific item, based on a threshold.
     *
     * @param itemID    The ID of the item to check in the inventory.
     * @param threshold The threshold value used for the check, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return boolean indicating whether the specified item is present in the inventory.
     */
    boolean contains(int itemID, double threshold);

    /**
     * Counts the quantity of a specific item in the inventory, based on a threshold.
     *
     * @param itemID    The ID of the item to count in the inventory.
     * @param threshold The threshold value used for the count, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return int representing the quantity of the specified item in the inventory.
     */
    int count(String itemID, double threshold);

    /**
     * Reads the stack size of a specified item in the inventory.
     *
     * @param itemID The ID of the item to count in the inventory.
     * @return int representing the stack quantity of the specified item in the inventory.
     */
    int stackSize(int itemID);

    /**
     * Finds the position of a specific item in the inventory, based on a threshold.
     *
     * @param itemID    The ID of the item whose position is to be found.
     * @param threshold The threshold value used for finding the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return Rectangle representing the position of the specified item in the inventory.
     */
    Rectangle itemPosition(String itemID, double threshold);

    /**
     * Initiates a tap action on a specified item in the inventory, based on a threshold.
     *
     * @param itemId    The ID of the item to be tapped.
     * @param threshold The threshold value used for identifying the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     */
    void tapItem(String itemId, double threshold);

    /**
     * Initiates a tap action on a specified item in the inventory, based on a threshold.
     *
     * @param itemId    The ID of the item to be tapped.
     * @param threshold The threshold value used for identifying the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     */
    void tapItem(int itemId, double threshold);

    /**
     * Initiates a tap action on a specified item in the inventory, based on a threshold.
     *
     * @param itemId    The ID of the item to be tapped.
     * @param useCache  Boolean to determine if we will be using the location cache or not.
     * @param threshold The threshold value used for identifying the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     */
    void tapItem(String itemId, boolean useCache, double threshold);

    /**
     * Initiates a tap action on a specified item in the inventory, based on a threshold.
     *
     * @param itemId    The ID of the item to be tapped.
     * @param useCache  Boolean to determine if we will be using the location cache or not.
     * @param threshold The threshold value used for identifying the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     */
    void tapItem(int itemId, boolean useCache, double threshold);

    /**
     * Initiates a tap action on a all items in the inventory with the given item ID, based on a threshold.
     *
     * @param itemId    The ID of the item to be tapped.
     * @param threshold The threshold value used for identifying the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     */
    void tapAllItems(int itemId, double threshold);

    /**
     * Initiates a tap action on a specified food in the inventory, based on a threshold without using a cache.
     *
     * @param itemId    The ID of the food to be tapped.
     * @param threshold The threshold value used for identifying the food, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     */
    void eat(String itemId, double threshold);

    /**
     * Initiates a tap action on a specified food in the inventory, based on a threshold without using a cache.
     *
     * @param itemId    The ID of the food to be tapped.
     * @param threshold The threshold value used for identifying the food, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     */
    void eat(int itemId, double threshold);

    /**
     * Finds the specified item in your inventory, and returns the center location of it as a Point (x,y)
     *
     * @param itemId    The ID of the food to be tapped.
     * @param threshold The threshold value used for identifying the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return Center Point location of specified item
     */
    Point getItemCenterPoint(String itemId, double threshold);

    /**
     * Finds the specified item in your inventory, and returns the center location of it as a Point (x,y)
     *
     * @param itemId    The ID of the food to be tapped.
     * @param threshold The threshold value used for identifying the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return Center Point location of the specified item
     */
    Point getItemCenterPoint(int itemId, double threshold);

    /**
     * Check if inventory is full or not
     *
     * @return true if inventory is full
     */
    boolean isFull();

    /**
     * Checks how many inventory slots are currently in use.
     *
     * @return int representing the quantity of the used slots in the inventory.
     */
    int usedSlots();

    /**
     * Checks how many inventory slots are currently empty.
     *
     * @return int representing the quantity of the empty slots in the inventory.
     */
    int emptySlots();
}

