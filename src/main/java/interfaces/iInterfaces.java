package interfaces;

import helpers.utils.SmithItems;

import java.awt.*;
import java.util.Map;

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
     * @param itemName The item you'd like to smith, based on a pre-defined smith able item list.
     */
    void smithItem(SmithItems itemName);

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


    /**
     * Returns the read stack size within a given ROI
     *
     * @param ROI java awt Rectangle of the ROI you'd like to read the stack size in.
     * @return integer indicating the read stack size in the ROI you've given.
     */
    public int readStackSize(Rectangle ROI);

    /**
     * Reads the stack size within a given ROI using custom digit patterns and text colors.
     *
     * @param ROI          the java.awt.Rectangle representing the ROI (Region of Interest) where the stack size will be read.
     * @param textColors   a List of Colors used for detecting digits in the given ROI.
     * @param digitPatterns a Map containing the custom digit patterns to be used for digit recognition.
     * @return an Integer indicating the detected stack size within the given ROI, or null if the detection fails.
     */
    public int readCustomStackSize(Rectangle ROI, java.util.List<Color> textColors, Map<String, int[][]> digitPatterns);

    /**
     * Reads the given area for an integer using custom digit patterns and text colors.
     *
     * @param ROI          the java.awt.Rectangle representing the ROI (Region of Interest) where the stack size will be read.
     * @param textColors   a List of Colors used for detecting digits in the given ROI.
     * @param digitPatterns a Map containing the custom digit patterns to be used for digit recognition.
     * @return an Integer indicating the detected integer within the given ROI, or -1 if the detection fails.
     */
    public int readCustomDigitsInArea(Rectangle ROI, java.util.List<Color> textColors, Map<String, int[][]> digitPatterns);

    /**
     * Reads the given area for a String using custom letter patterns and text colors.
     *
     * @param ROI          the java.awt.Rectangle representing the ROI (Region of Interest) where the stack size will be read.
     * @param textColors   a List of Colors used for detecting letters in the given ROI.
     * @param letterPatterns a Map containing the custom letter patterns to be used for letter recognition.
     * @return a String indicating the detected string within the given ROI, or empty if the detection fails.
     */
    public String readCustomLettersInArea(Rectangle ROI, java.util.List<Color> textColors, Map<String, int[][]> letterPatterns);
}
