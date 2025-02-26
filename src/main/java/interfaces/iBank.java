package interfaces;

import java.awt.*;

/**
 * Interface representing banking operations.
 */
public interface iBank {

    /**
     * Opens the bank interface.
     * @param bankname The name of the bank to be opened. Use BankNames. for supported banks
     */
    void open(String bankname);

    /**
     * Closes the currently open bank interface.
     */
    void close();

    /**
     * Checks if the bank interface is currently open.
     * @return true if the bank is open, false otherwise.
     */
    boolean isOpen();

    /**
     * Checks if the specific bank tab is selected
     * @param tab, an int from 0-9 for the bank tab.
     * @return true if the tab is selected, false otherwise.
     */
    boolean isTabSelected(int tab);

    /**
     * Checks if the bank contains an item with the specified ID and meets the threshold quantity.
     * @param itemId The ID of the item to check.
     * @param threshold The minimum quantity threshold.
     * @return true if the item exists in the bank in the specified quantity, false otherwise.
     */
    boolean contains(String itemId, double threshold);

    /**
     * Checks if the bank contains an item with the specified ID and meets the threshold quantity.
     * @param itemID The ID of the item to check.
     * @param threshold The minimum quantity threshold.
     * @return true if the item exists in the bank in the specified quantity, false otherwise.
     */
    boolean contains(int itemID, double threshold);

    /**
     * Checks if the bank contains an item with the specified ID and meets the threshold quantity.
     * @param itemId The ID of the item to check.
     * @param threshold The minimum quantity threshold.
     * @param searchColor The java.awt.Color to color find for the item you need to find
     *                    This is helpful to make the search more accurate, for example, finding a
     *                    specific Scimitar, rune, orb, staff and so on.
     *
     * @return true if the item exists in the bank in the specified quantity, false otherwise.
     */
    boolean contains(String itemId, double threshold, Color searchColor);

    /**
     * Checks if the bank contains an item with the specified ID and meets the threshold quantity.
     * @param itemID The ID of the item to check.
     * @param threshold The minimum quantity threshold.
     * @param searchColor The java.awt.Color to color find for the item you need to find
     *                    This is helpful to make the search more accurate, for example, finding a
     *                    specific Scimitar, rune, orb, staff and so on.
     *
     * @return true if the item exists in the bank in the specified quantity, false otherwise.
     */
    boolean contains(int itemID, double threshold, Color searchColor);

    /**
     * Withdraws an item from the bank with the specified ID, if it meets the threshold quantity.
     * @param itemId The ID of the item to withdraw.
     * @param threshold The minimum quantity threshold for withdrawal.
     */
    void withdrawItem(String itemId, double threshold);

    /**
     * Withdraws an item from the bank with the specified ID, if it meets the threshold quantity.
     * @param itemId The ID of the item to withdraw.
     * @param threshold The minimum quantity threshold for withdrawal.
     */
    void withdrawItem(int itemId, double threshold);

    /**
     * Withdraws an item from the bank with the specified ID, if it meets the threshold quantity, with the option to use a cached location.
     * @param itemId The ID of the item to withdraw.
     * @param useCache A boolean representing to use a cached location or not
     * @param threshold The minimum quantity threshold for withdrawal.
     */
    void withdrawItem(int itemId, boolean useCache, double threshold);

    /**
     * Withdraws an item from the bank with the specified ID, if it meets the threshold quantity.
     * @param itemID The ID of the item to withdraw.
     * @param threshold The minimum quantity threshold for withdrawal.
     * @param searchColor The java.awt.Color to color find for the item you need to find
     *                    This is helpful to make the search more accurate, for example, finding a
     *                    specific Scimitar, rune, orb, staff and so on.
     */
    void withdrawItem(String itemID, double threshold, Color searchColor);

    /**
     * Withdraws an item from the bank with the specified ID, if it meets the threshold quantity, with the option to use a cached location.
     * @param itemID The ID of the item to withdraw.
     * @param useCache A boolean representing to use a cached location or not
     * @param threshold The minimum quantity threshold for withdrawal.
     * @param searchColor The java.awt.Color to color find for the item you need to find
     *                    This is helpful to make the search more accurate, for example, finding a
     *                    specific Scimitar, rune, orb, staff and so on.
     */
    void withdrawItem(int itemID, boolean useCache, double threshold, Color searchColor);

    /**
     * Withdraws an item from the bank with the specified ID, if it meets the threshold quantity.
     * @param itemID The ID of the item to withdraw.
     * @param threshold The minimum quantity threshold for withdrawal.
     * @param searchColor The java.awt.Color to color find for the item you need to find
     *                    This is helpful to make the search more accurate, for example, finding a
     *                    specific Scimitar, rune, orb, staff and so on.
     */
    void withdrawItem(int itemID, double threshold, Color searchColor);

    /**
     * Sets the specified custom quantity within the bank interface.
     *
     * @param quantity The custom withdraw quantity to set in the bank interface
     */
    void setCustomQuantity(int quantity);

    /**
     * Gets the name of the currently open bank tab.
     * @return The name of the current bank tab.
     */
    String getCurrentTab();

    /**
     * Gets the int index of the currently open bank tab.
     * @param returnInt boolean true to return it as int instead of String
     * @return The name of the current bank tab.
     */
    int getCurrentTab(boolean returnInt);

    /**
     * Opens a specific bank tab.
     * @param tabInt The index of the bank tab to be opened.
     */
    void openTab(int tabInt);

    /**
     * Checks if entering a bank pin is required.
     * @return true if a bank pin is required, false otherwise.
     */
    boolean isBankPinNeeded();

    /**
     * Enters the bank pin if required.
     */
    void enterBankPin();

    /**
     * Sets the bankPin specified by confirming it twice in the bank interface.
     *
     * @param bankPin A string of four digits representing the bankPin to set.
     */
    void setBankPin(String bankPin);

    /**
     * Sets up dynamic bank functionality and returns a setup identifier.
     * @return A string identifier for the dynamic bank setup.
     */
    String setupDynamicBank();

    /**
     * Finds the dynamic bank and returns a bank identifier.
     * @return A string identifier for the dynamic bank you're in.
     */
    String findDynamicBank();

    /**
     * Steps to the bank object (booth/chest) of the bank identifier, for example: Castle_wars_bank.
     */
    void stepToBank();

    /**
     * Steps to the bank object (booth/chest) of the bank identifier, for example: Castle_wars_bank.
     * @param bankLoc the string bankloc found from setupDynamicBank/findDynamicBank
     */
    void stepToBank(String bankLoc);

    /**
     * Reads the stack size of a specified item in the bank interface.
     *
     * @param itemID The ID of the item to count in the bank.
     * @return int representing the stack quantity of the specified item in the bank.
     */
    int stackSize(int itemID);

    /**
     * Reads the stack size of a specified item in the bank interface.
     *
     * @param itemID The ID of the item to count in the bank.
     * @param searchColor The java.awt.Color to color find for the item you need to find
     *                    This is helpful to make the search more accurate, for example, finding a
     *                    specific Scimitar, rune, orb, staff and so on.
     *
     * @return int representing the stack quantity of the specified item in the bank.
     */
    int stackSize(int itemID, Color searchColor);

    /**
     * Checks if the bank search interface is currently open.
     *
     * @return {@code true} if the bank search interface is open; {@code false} otherwise.
     */
    boolean isSearchOpen();

    // Methods for finding different bank interface components
    // Each method returns the screen area (as a Rectangle) for a specific bank interface component
    Rectangle findBankCloseButton();
    Rectangle findWornButton();
    Rectangle findSwapButton();
    Rectangle findInsertButton();
    Rectangle findItemButton();
    Rectangle findNoteButton();
    Rectangle findQuantity1Button();
    Rectangle findQuantity5Button();
    Rectangle findQuantity10Button();
    Rectangle findQuantityCustomButton();
    Rectangle findQuantityAllButton();
    Rectangle findPlaceholdersButton();
    Rectangle findSearchButton();
    Rectangle findDepositInventoryButton();
    Rectangle findDepositWornButton();
    Rectangle findFirstBankSlot();
    Rectangle findBankTab(int tab);

    /**
     * Returns an array of Rectangles representing the grid of bank items.
     * @return An array of Rectangle objects.
     */
    Rectangle[] bankItemGrid();

    // Methods for interacting with different bank interface components
    public void tapWornButton();
    public void tapSwapButton();
    public void tapInsertButton();
    public void tapItemButton();
    public void tapNoteButton();
    public void tapQuantity1Button();
    public void tapQuantity5Button();
    public void tapQuantity10Button();
    public void tapQuantityCustomButton();
    public void tapQuantityAllButton();
    public void tapPlaceholdersButton();
    public void tapSearchButton();
    public void tapDepositInventoryButton();
    public void tapDepositWornButton();

    // Methods to check if certain bank interface components are selected
    public boolean isSelectedSwapButton();
    public boolean isSelectedInsertButton();
    public boolean isSelectedItemButton();
    public boolean isSelectedNoteButton();
    public boolean isSelectedQuantity1Button();
    public boolean isSelectedQuantity5Button();
    public boolean isSelectedQuantity10Button();
    public boolean isSelectedQuantityCustomButton();
    public boolean isSelectedQuantityAllButton();
    public boolean isSelectedPlaceholdersButton();
    public boolean isSelectedBankTab(int tabNr);
}
