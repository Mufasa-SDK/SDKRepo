package interfaces;

/**
 * Interface defining interactions with the game's chat system.
 * This interface provides a method to send chat messages in the game.
 */
public interface iGame {
    /**
     * Sends a chat message in the game.
     *
     * @param message The string message to be sent in the game's chat.
     */
    void sendChatMessage(String message);

    /**
     * Sets the zoom to a specific level.
     *
     * @param zoomLevel The string zoom level (1-5) to set the zoom to.
     */
    void setZoom(String zoomLevel);

    /**
     * Check if there are other players around you or under you.
     *
     * @return true if players around
     */
    public boolean isPlayersAround();

    /**
     * Check ONLY if there are other players under your character specifically
     *
     * @return true if players under you
     */
    public boolean isPlayersUnderUs();

    /**
     * Hops to a random world from the selected hop profile, or if other players are found around us (if activated)
     * WDH = White Dot Hop
     *
     * @param profileName use the profileName that was selected in the ScriptUI config here by the user.
     * @param useWDH Boolean to enable/disable WDH. If true, this will instantly hop when a player is around us. Otherwise it will wait till the next hop time.
     * @param useOnlyWDH Boolean to set the mode to use WDH only, this overrides the normal hopping schedule and only hops when players are around.
     */
    void hop(String profileName, Boolean useWDH, Boolean useOnlyWDH);

    /**
     * Sets the letters on the fairy ring you'd like to travel to.
     *
     * @param Letters The 3 letters of the fairy ring code you'd like to travel to.
     * */
    void setFairyRing(String Letters);

    /**
     * Checks if the Tap to Drop action is currently enabled.
     *
     * @return true if the action is currently enabled.
     */
    public boolean isTapToDropEnabled();

    /**
     * Checks if the Single Tap action is currently enabled.
     *
     * @return true if the action is currently enabled.
     */
    public boolean isSingleTapEnabled();

    /**
     * Checks if the Keyboard action is currently enabled.
     *
     * @return true if the action is currently enabled.
     */
    public boolean isKeyboardActionEnabled();

    /**
     * Checks if there is currently no action selected at all.
     *
     * @return true if no action is currently selected.
     */
    public boolean isActionDisabled();

    /**
     * Checks if the action button is currently visible on the screen.
     *
     * @return true if the action button was located.
     */
    public boolean isActionButtonVisible();

    /**
     * Enables the Tap to Drop action mode.
     * */
    public void enableTapToDrop();

    /**
     * Disables the Tap to Drop action mode.
     * */
    public void disableTapToDrop();

    /**
     * Enables the Single Tap action mode.
     * */
    public void enableSingleTap();

    /**
     * Disables the Single Tap action mode.
     * */
    public void disableSingleTap();

    /**
     * Taps the keyboard action button to bring the keyboard up.
     * */
    public void showKeyboard();
}
