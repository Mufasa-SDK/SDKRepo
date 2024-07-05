package interfaces;

/**
 * Interface defining interactions with an experience bar.
 * This interface provides a method to retrieve the current experience points (XP) displayed on the XP bar.
 */
public interface iPaint {

    /**
     * Create an instance of paint bound to the emulator you use it from.
     *
     * @param optionalImagePath An optional image path, used to set the logo for your paint UI. Defaults to the Mufasa logo if set to null.
     */
    void Create(String optionalImagePath);

    /**
     * Creates one out of the 8 possible boxes on the paintUI, containing a subheader label, an item image box, and integer value.
     *
     * @param labeltext A string of text, this text will be set in the subheader of your image box.
     * @param itemID An integer representing the itemID, the image of this item will be set in your image box.
     * @param value An integer representing the amount of the itemID, used to represent the value of processed items, obtained items and so on.
     *
     * @return int representing the index value of the box created (store this to update it from your script later).
     */
    int createBox(String labeltext, int itemID, int value);

    /**
     * Updates the box (based on index number, which is returned from createBox) with the given value, this updates the value below the image of this imagebox index.
     *
     * @param index The index number of the image box to update, starting at 0 for the first box.
     * @param value The value to set for the integer below this image box.
     */
    void updateBox(int index, int value);

    /**
     * Updates the status label/text of your paint UI instance.
     *
     * @param text The text to set the status label to.
     */
    void setStatus(String text);

    /**
     * Updates the statistics label/text of your paint UI instance.
     *
     * @param text The text to set the statistics label to.
     */
    void setStatistic(String text);
}