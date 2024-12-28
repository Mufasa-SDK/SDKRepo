package interfaces;

import java.awt.*;
import java.util.Map;

/**
 * Interface representing chatbox operations.
 */
public interface iChatbox {

    /**
     * Checks if the "Make 1" option is selected.
     * @return true if "Make 1" is selected, false otherwise.
     */
    boolean isSelectedMake1();

    /**
     * Checks if the "Make 5" option is selected.
     * @return true if "Make 5" is selected, false otherwise.
     */
    boolean isSelectedMake5();

    /**
     * Checks if the "Make 10" option is selected.
     * @return true if "Make 10" is selected, false otherwise.
     */
    boolean isSelectedMake10();

    /**
     * Checks if the "Make All" option is selected.
     * @return true if "Make All" is selected, false otherwise.
     */
    boolean isSelectedMakeAll();

    /**
     * Checks if the make menu is visible in the chatbox.
     * @return true if the make menu is visible, false otherwise.
     */
    boolean isMakeMenuVisible();

    /**
     * Selects a make option based on the specified option number.
     * @param optionNumber The number of the option to select.
     */
    void makeOption(int optionNumber);

    /**
     * Selects the "Make 1" option.
     */
    void selectMake1();

    /**
     * Selects the "Make 5" option.
     */
    void selectMake5();

    /**
     * Selects the "Make 10" option.
     */
    void selectMake10();

    /**
     * Selects the "Make X" option.
     * This option usually allows for specifying a custom quantity.
     */
    void selectMakeX();

    /**
     * Selects the "Make All" option.
     */
    void selectMakeAll();

    /**
     * Closes the chatbox.
     */
    void closeChatbox();

    /**
     * Opens the 'All' section of the chatbox.
     */
    void openAllChat();

    /**
     * Opens the 'Game' section of the chatbox.
     */
    void openGameChat();

    /**
     * Opens the 'Public' section of the chatbox.
     */
    void openPublicChat();

    /**
     * Opens the 'Private' section of the chatbox.
     */
    void openPrivateChat();

    /**
     * Opens the 'Channel' section of the chatbox.
     */
    void openChannelChat();

    /**
     * Opens the 'Clan' section of the chatbox.
     */
    void openClanChat();

    /**
     * Opens the 'Trade' section of the chatbox.
     */
    void openTradeChat();

    /**
     * Finds and returns the rectangle representing the chatbox menu.
     * @return A Rectangle object representing the area of the chatbox menu.
     */
    Rectangle findChatboxMenu();

    /**
     * Reads the specific area, and returns what it was able to read.
     * @return A string with the OCR results.
     * @param areaToOCR A java.awt.Rectangle with the area you want to perform OCR on.
     */
    String readLastLine(Rectangle areaToOCR);

    /**
     * Reads the specific area, and returns the digits (0-9) it was able to read.
     * @return An integer that represents the value that was read
     * @param areaToOCR A java.awt.Rectangle with the area you want to perform OCR on.
     * @param colorsToScan A java.util.List with java.awt.Colors in it that you'd like to use to read.
     */
    int readDigitsInArea(Rectangle areaToOCR, java.util.List<Color> colorsToScan);

    /**
     * Reads the specific area, and returns true/false if it was able to read or not.
     * @return true/false if we found the text or not
     * @param searchArea A java.awt.Rectangle with the area you want to perform OCR on.
     * @param colors A java.util.List with java.awt.Colors in it that you'd like to use to read.
     * @param letterPatterns The map containing letter patterns for the OCR matching of the menu text.
     * @param stringToFind  The string to search for in your given area.
     */
    boolean isTextVisible(Rectangle searchArea, java.util.List<Color> colors, Map<String, int[][]> letterPatterns, String stringToFind);

    /**
     * Checks if the "All" chat tab is active
     * @return true/false if It's active or not.
     */
    public boolean isAllChatActive();

    /**
     * Checks if the "Game" chat tab is active
     * @return true/false if It's active or not.
     */
    public boolean isGameChatActive();

    /**
     * Checks if the "Public" chat tab is active
     * @return true/false if It's active or not.
     */
    public boolean isPublicChatActive();

    /**
     * Checks if the "Private" chat tab is active
     * @return true/false if It's active or not.
     */
    public boolean isPrivateChatActive();

    /**
     * Checks if the "Channel" chat tab is active
     * @return true/false if It's active or not.
     */
    public boolean isChannelChatActive();

    /**
     * Checks if the "Clan" chat tab is active
     * @return true/false if It's active or not.
     */
    public boolean isClanChatActive();

    /**
     * Checks if the "Trade" chat tab is active
     * @return true/false if It's active or not.
     */
    public boolean isTradeChatActive();
}
