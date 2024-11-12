package interfaces;

public interface iGE {

    /**
     * Fetches the Grand Exchange price for a given item ID from the OSRS price API.
     *
     * @param itemID the ID of the item to fetch the price for.
     * @return the latest high price if available, otherwise the low price. Returns -1 if both prices are unavailable or in case of an error.
     */
    int getItemPrice(int itemID);

    /**
     * Checks if the Grand Exchange interface is currently open.
     *
     * @return a true/false statement if the Grand Exchange is open or not.
     */
    boolean isOpen();

    /**
     * Checks how far your buy/sell offer is within the Grand Exchange.
     *
     * @param slot the slot number (1-8) of the slot you'd like to check the sale/buy progress for
     * @return an integer representing the % progress of your buy/sale progress. E.G. 50 would mean it's 50% processed.
     */
    int getSlotProgress(int slot);

    /**
     * Checks the number of canceled orders within the Grand Exchange
     *
     * @return an integer representing the number of canceled orders.
     */
    int getCanceled();

    /**
     * Checks the number of completed orders within the Grand Exchange
     *
     * @return an integer representing the number of completed orders.
     */
    int getCompleted();

    /**
     * Checks if there are items to collect, if so it taps the collect button to collect all collectable orders.
     */
    void collectAllItems();

    /**
     * Checks if there are items to be collected in the Grand Exchange
     *
     * @return a true/false statement if the Grand Exchange has items to collect or not.
     */
    boolean hasCollectableItems();

    /**
     * Buys one or more items in the Grand Exchange
     *
     * @param searchString The string (item name) to search for, make sure the string ensures you desired item is in the top results (visible without scrolling)
     * @param itemID The itemID of the item you'd like to buy, use /ID in Discord to find your IDs.
     * @param quantity The quantity (amount) you'd like to buy of the item.
     * @param price The price you want to buy the items at.
     *
     * @return an integer representing slot number your buy order is created in.
     * A -1 return means something failed, or no slots are available.
     */
    int buyItem(String searchString, int itemID, int quantity, int price);

    /**
     * Sells one or more items in the Grand Exchange
     *
     * @param itemID The itemID of the item you'd like to sell, use /ID in Discord to find your IDs.
     * @param quantity The quantity (amount) you'd like to sell of the item.
     * @param price The price you want to sell the items at.
     *
     * @return an integer representing slot number your sell order is created in.
     * A -1 return means something failed, or no slots are available.
     */
    int sellItem(int itemID, int quantity, int price);

    /**
     * Checks for the first available slot in the Grand Exchange interface
     *
     * @return an integer representing the slot number of the first available GE slot.
     * A -1 return means no slots are available, or the correct interface is not open.
     */
    int getFirstAvailableSlot();

    /**
     * Checks if a specific slot is available/empty in the Grand Exchange interface
     *
     * @param slot an integer representing the slot you'd like to check (1-8)
     * @return a true/false statement if the Grand Exchange slot is available/empty or not.
     */
    boolean isSlotAvailable(int slot);

    /**
     * Checks the number of slots available/empty in the Grand Exchange interface
     *
     * @return an integer representing the slot numbers available in the GE.
     * A -1 return means no slots are available, or the correct interface is not open.
     */
    int slotsAvailable();

    /**
     * Checks if there is an item to collect inside a slot, specifically the first collect slot of the GE slot.
     * This method is only to be used when a slot is already open!
     *
     * @return a true/false statement if there is an item to be collected or not.
     */
    boolean has1stItemToCollect();

    /**
     * Checks if there is an item to collect inside a slot, specifically the second collect slot of the GE slot.
     * This method is only to be used when a slot is already open!
     *
     * @return a true/false statement if there is an item to be collected or not.
     */
    boolean has2ndItemToCollect();
}