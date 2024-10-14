package interfaces;

import org.opencv.core.Rect;

import java.awt.*;

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
     * Closes the chatbox with random actions.
     */
    void closeChatbox();

    /**
     * Opens the 'All' section of the chatbox with random actions.
     */
    void openAllChat();

    /**
     * Opens the 'Game' section of the chatbox with random actions.
     */
    void openGameChat();

    /**
     * Opens the 'Private' section of the chatbox with random actions.
     */
    void openPrivateChat();

    /**
     * Opens the 'Friends' section of the chatbox with random actions.
     */
    void openFriendsChat();

    /**
     * Opens the 'Channel' section of the chatbox with random actions.
     */
    void openChannelChat();

    /**
     * Opens the 'Clan' section of the chatbox with random actions.
     */
    void openClanChat();

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
    String readDigitsInArea(Rectangle areaToOCR, java.util.List<Color> colorsToScan);

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
