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
     * Finds and returns the rectangle representing the chatbox menu.
     * @return A Rectangle object representing the area of the chatbox menu.
     */
    Rectangle findChatboxMenu();

}
