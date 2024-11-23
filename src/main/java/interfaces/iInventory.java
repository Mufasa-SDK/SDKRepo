package interfaces;

import javafx.util.Pair;

import java.awt.*;
import java.util.List;

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
     * Checks if the inventory contains any of the specified items, based on a threshold.
     *
     * @param itemIDs   Array of item IDs to check in the inventory.
     * @param threshold The threshold value used for the check, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @param matchColor The color to match the specific item with, for example the blue in a Rune scimitar.
     * @return boolean indicating whether any of the specified items are present in the inventory.
     */
    boolean contains(int[] itemIDs, double threshold, Color matchColor);

    /**
     * Checks if the inventory contains a specific item, based on a threshold.
     *
     * @param itemID    The ID of the item to check in the inventory.
     * @param threshold The threshold value used for the check, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return boolean indicating whether the specified item is present in the inventory.
     */
    boolean contains(String itemID, double threshold);

    /**
     * Checks if the inventory contains a specific item, based on a threshold.
     *
     * @param itemID    The ID of the item to check in the inventory.
     * @param threshold The threshold value used for the check, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @param matchColor The color to match the specific item with, for example the blue in a Rune scimitar.
     * @return boolean indicating whether the specified item is present in the inventory.
     */
    boolean contains(int itemID, double threshold, Color matchColor);

    /**
     * Checks if the inventory contains any of the specified items, based on a threshold.
     *
     * @param itemIDs    The ID of the item to check in the inventory.
     * @param threshold The threshold value used for the check, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return boolean indicating whether the specified item is present in the inventory.
     */
    boolean containsAny(int[] itemIDs, double threshold);

    /**
     * Checks if the inventory contains any of the specified items, based on a threshold.
     *
     * @param itemIDs    The ID of the item to check in the inventory.
     * @param threshold The threshold value used for the check, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @param matchColor The color to match the specific item with, for example the blue in a Rune scimitar.
     * @return boolean indicating whether the specified item is present in the inventory.
     */
    boolean containsAny(int[] itemIDs, double threshold, Color matchColor);

    /**
     * Checks if the inventory contains all the specific items, based on a threshold.
     *
     * @param itemIDs    The ID of the item to check in the inventory.
     * @param threshold The threshold value used for the check, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return boolean indicating whether the specified item is present in the inventory.
     */
    boolean containsAll(int[] itemIDs, double threshold);

    /**
     * Checks if the inventory contains all the specific items, based on a threshold.
     *
     * @param itemIDs    The ID of the item to check in the inventory.
     * @param threshold The threshold value used for the check, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @param matchColor The color to match the specific item with, for example the blue in a Rune scimitar.
     * @return boolean indicating whether the specified item is present in the inventory.
     */
    boolean containsAll(int[] itemIDs, double threshold, Color matchColor);

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
     * Counts the quantity of a specific item in the inventory, based on a threshold.
     *
     * @param itemID    The ID of the item to count in the inventory.
     * @param threshold The threshold value used for the count, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return int representing the quantity of the specified item in the inventory.
     */
    int count(int itemID, double threshold);

    /**
     * Counts the quantity of a specific item in the inventory, based on a threshold.
     *
     * @param itemID    The ID of the item to count in the inventory.
     * @param threshold The threshold value used for the count, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @param matchColor The color to match the specific item with, for example the blue in a Rune scimitar.
     * @return int representing the quantity of the specified item in the inventory.
     */
    int count(int itemID, double threshold, Color matchColor);

    /**
     * Reads the stack size of a specified item in the inventory.
     *
     * @param itemID The ID of the item to count in the inventory.
     * @return int representing the stack quantity of the specified item in the inventory.
     */
    int stackSize(int itemID);

    /**
     * Finds the first position of a specific item in the inventory, based on a threshold.
     *
     * @param itemID    The ID of the item whose position is to be found.
     * @param threshold The threshold value used for finding the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return Rectangle representing the position of the specified item in the inventory.
     */
    Rectangle itemPosition(String itemID, double threshold);

    /**
     * Finds the first position of a specific item in the inventory, based on a threshold.
     *
     * @param itemID    The ID of the item whose position is to be found.
     * @param threshold The threshold value used for finding the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return Rectangle representing the position of the specified item in the inventory.
     */
    Rectangle itemPosition(int itemID, double threshold);

    /**
     * Finds the last position of a specific item in the inventory, based on a threshold.
     *
     * @param itemID    The ID of the item whose position is to be found.
     * @param threshold The threshold value used for finding the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return Rectangle representing the position of the specified item in the inventory.
     */
    Rectangle lastItemPosition(String itemID, double threshold);

    /**
     * Finds the last position of a specific item in the inventory, based on a threshold.
     *
     * @param itemID    The ID of the item whose position is to be found.
     * @param threshold The threshold value used for finding the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return Rectangle representing the position of the specified item in the inventory.
     */
    Rectangle lastItemPosition(int itemID, double threshold);

    /**
     * Finds the position of a specific item in the inventory, based on a threshold.
     *
     * @param itemID    The ID of the item whose position is to be found.
     * @param threshold The threshold value used for finding the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return Integer representing the slot position of the specified item in the inventory (1-28).
     */
    Integer itemSlotPosition(int itemID, double threshold);

    /**
     * Finds the position of the first hit of your array list of items in the inventory, based on a threshold.
     *
     * @param itemIDs    Array of item IDs of the items whose position is to be found.
     * @param threshold The threshold value used for finding the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @return Integer representing the slot position of the found item in the inventory (1-28).
     */
    Integer itemSlotPosition(int[] itemIDs, double threshold);

    /**
     * Drops all items in your inventory with a list of excluded slots
     *
     * @param exclusionSlotList   A list of integers which slots should NOT be dropped (excluded from being dropped)
     * @param useCache A boolean to use the cache or not, true will use the cache, false will not.
     */
    void dropInventItems(List<Integer> exclusionSlotList, boolean useCache);

    /**
     * Drops all items in your inventory with a given list of slots
     *
     * @param dropSlotList A list of integers which slots should be dropped
     */
    void dropInventItems(List<Integer> dropSlotList);

    /**
     * Drops all items in your inventory with a single excluded slot
     *
     * @param exclusionSlot   An integer representing which slot should NOT be dropped (excluded from being dropped)
     * @param useCache A boolean to use the cache or not, true will use the cache, false will not.
     */
    void dropInventItems(Integer exclusionSlot, boolean useCache);

    /**
     * Initiates a tap action on a specific inventory slot identified by its slot ID.
     * This method directly interacts with the inventory slot without additional checks or parameters.
     *
     * @param slotID The slot ID of the inventory slot to be tapped.
     */
    void tapItem(Integer slotID);

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
     * @param matchColor The color to match the specific item with, for example the blue in a Rune scimitar.
     */
    void tapItem(int itemId, double threshold, Color matchColor);

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
     * Initiates a tap action on all items in the inventory with the given item ID, based on a threshold.
     *
     * @param itemId    The ID of the item to be tapped.
     * @param threshold The threshold value used for identifying the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     */
    void tapAllItems(int itemId, double threshold);

    /**
     * Initiates a tap action on all items in the inventory for each pair of ItemID and Color, based on a threshold.
     *
     * @param itemPairs Pairs of item ID and Color for matching
     * @param threshold The threshold value used for identifying the item, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     */
    void tapAllItems(List<Pair<Integer, Color>> itemPairs, double threshold);

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
     * Initiates a tap action on a specified food in the inventory, based on a threshold without using a cache.
     *
     * @param itemId    The ID of the food to be tapped.
     * @param threshold The threshold value used for identifying the food, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @param searchColor The java.awt.Color to color find for the item you need to find
     *                    This is helpful to make the search more accurate, for example, finding a
     *                    specific Scimitar, rune, orb, staff and so on.
     */
    void eat(String itemId, double threshold, Color searchColor);

    /**
     * Initiates a tap action on a specified food in the inventory, based on a threshold without using a cache.
     *
     * @param itemId    The ID of the food to be tapped.
     * @param threshold The threshold value used for identifying the food, threshold is a double where 1.0 represents 100% confidence. Usually above 0.80 (but often 0.90+).
     * @param searchColor The java.awt.Color to color find for the item you need to find
     *                    This is helpful to make the search more accurate, for example, finding a
     *                    specific Scimitar, rune, orb, staff and so on.
     */
    void eat(int itemId, double threshold, Color searchColor);

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

