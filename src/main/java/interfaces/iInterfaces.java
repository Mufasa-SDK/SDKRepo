package interfaces;

/**
 * Interface defining interactions with various game interfaces.
 * This interface includes methods for interacting with smithing and crafting interfaces,
 * as well as general actions related to item creation.
 */
public interface iInterfaces {

    // SMITHING SECTION //
    /**
     * Checks if the smithing interface is currently open.
     *
     * @return boolean indicating whether the smithing interface is open.
     */
    boolean smithingIsOpen();

    /**
     * Closes the smithing interface.
     */
    void closeSmithingInterface();

    /**
     * Initiates the action of smithing an item identified by its item ID.
     *
     * @param itemId the ID of the item to smith.
     */
    void smithItem(int itemId);

    /**
     * Initiates the action of smithing an item identified by its name.
     *
     * @param itemName the name of the item to smith.
     */
    void smithItem(String itemName);

    // CRAFTING SECTION //
    /**
     * Checks if the jewellery crafting interface is currently open.
     *
     * @return boolean indicating whether the craft jewellery interface is open.
     */
    boolean craftJewelleryIsOpen();

    /**
     * Closes the jewellery crafting interface.
     */
    void closeCraftJewelleryInterface();

    /**
     * Initiates the action of crafting jewellery identified by its item ID.
     *
     * @param itemId the ID of the jewellery item to craft.
     */
    void craftJewellery(int itemId);

    // GENERAL SECTION //
    /**
     * Selects the option to make one unit of an item.
     */
    void selectMake1();

    /**
     * Selects the option to make all units of an item.
     */
    void selectMakeAll();

    /**
     * Selects the option to make a custom number of units of an item.
     */
    void selectMakeX();

    /**
     * Checks if the 'Make 1' option is currently selected.
     *
     * @return boolean indicating whether the 'Make 1' option is selected.
     */
    boolean isSelectedMake1();

    /**
     * Checks if the 'Make All' option is currently selected.
     *
     * @return boolean indicating whether the 'Make All' option is selected.
     */
    boolean isSelectedMakeAll();
}
