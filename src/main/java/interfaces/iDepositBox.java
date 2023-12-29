package interfaces;

import java.awt.*;

/**
 * Interface defining interactions with a deposit box.
 * This interface includes methods for opening the deposit box, checking its status,
 * and finding various elements within the deposit box interface.
 */
public interface iDepositBox {
    /**
     * Attempts to open the deposit box.
     *
     * @return Boolean indicating whether the deposit box was successfully opened.
     */
    Boolean open();

    /**
     * Checks if the deposit box is currently opened.
     *
     * @return boolean indicating whether the deposit box is open.
     */
    boolean opened();

    /**
     * Finds the rectangle representing the option to deposit a quantity of 1 item.
     *
     * @return Rectangle for the 'Quantity 1' option.
     */
    Rectangle findQuantity1();

    /**
     * Finds the rectangle representing the option to deposit a quantity of 5 items.
     *
     * @return Rectangle for the 'Quantity 5' option.
     */
    Rectangle findQuantity5();

    /**
     * Finds the rectangle representing the option to deposit a quantity of 10 items.
     *
     * @return Rectangle for the 'Quantity 10' option.
     */
    Rectangle findQuantity10();

    /**
     * Finds the rectangle representing the option to deposit a custom quantity of items.
     *
     * @return Rectangle for the 'Custom Quantity' option.
     */
    Rectangle findQuantityCustom();

    /**
     * Finds the rectangle representing the option to deposit all items.
     *
     * @return Rectangle for the 'All Quantity' option.
     */
    Rectangle findQuantityAll();

    /**
     * Finds the rectangle representing the option to deposit items from the inventory.
     *
     * @return Rectangle for the 'Deposit Inventory' option.
     */
    Rectangle findDepositInventory();

    /**
     * Finds the rectangle representing the option to deposit worn items.
     *
     * @return Rectangle for the 'Deposit Worn Items' option.
     */
    Rectangle findDepositWorn();

    /**
     * Finds the rectangle representing the option to deposit looted items.
     *
     * @return Rectangle for the 'Deposit Loot' option.
     */
    Rectangle findDepositLoot();

    /**
     * Finds the rectangle representing the option to close the deposit box.
     *
     * @return Rectangle for the 'Close Deposit Box' option.
     */
    Rectangle findCloseDepositBox();

    /**
     * Finds the rectangle representing the option to set a custom quantity for depositing items.
     *
     * @return Rectangle for the 'Set Custom Quantity' option.
     */
    Rectangle findSetCustomQuantity();

    /**
     * Builds an array of rectangles representing the grid of the deposit box interface.
     *
     * @return Array of Rectangles representing each part of the deposit box grid.
     */
    Rectangle[] buildDepositBoxGrid();
}
