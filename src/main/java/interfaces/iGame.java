package interfaces;

import java.awt.*;

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
    public void hop(String profileName, Boolean useWDH, Boolean useOnlyWDH);

    /**
     * Instantly hops to a random world from the selected hop profile.
     *
     * @param profileName use the profileName that was selected in the ScriptUI config here by the user.
     */
    public void instantHop(String profileName);

    /**
     * Instantly hops to a random world from the selected hop profile.
     *
     * @param profileName use the profileName that was selected in the ScriptUI config here by the user.
     * @param world integer presenting the world you'd like to hop to.
     */
    public void instantHop(String profileName, Integer world);

    /**
     * Instantly switches to a random world from the selected hop profile.
     * DISCLAIMER: This is only to be used when already on the login screen!
     * Use the instantHop method when you are still logged in.
     *
     * @param profileName use the profileName that was selected in the ScriptUI config here by the user.
     */
    public void switchWorld(String profileName);

    /**
     * Instantly switches to a random world from the default profile settings.
     * DISCLAIMER: This is only to be used when already on the login screen!
     * Use the instantHop method when you are still logged in.
     *
     */
    public void switchWorld();

    /**
     * Instantly switches to a random world from the selected hop profile.
     * DISCLAIMER: This is only to be used when already on the login screen!
     * Use the instantHop method when you are still logged in.
     *
     * @param profileName use the profileName that was selected in the ScriptUI config here by the user.
     * @param world integer presenting the world you'd like to switch to.
     */
    public void switchWorld(String profileName, Integer world);

    /**
     * Sets the letters on the fairy ring you'd like to travel to.
     *
     * @param Letters The 3 letters of the fairy ring code you'd like to travel to.
     * */
    public void setFairyRing(String Letters);

    /**
     * Retrieves the world list from the given profile
     *
     * @param profileName use the profileName that was selected in the ScriptUI config here by the user.
     * @return a list of integers of each world that is in the given hop profile.
     * */
    public java.util.List<Integer> getWorldList(String profileName);

    /**
     * Checks if it is time to hop or not.
     *
     * @return true if it is time to hop.
     */
    public boolean timeToHop();

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

    /**
     * Performs a random Anti-AFK action to simulate user activity.
     * This method randomly chooses one of the predefined actions, each involving opening and
     * closing a specific game tab. After performing an action, the method pauses execution for a
     * random duration between 300ms and 2000ms to mimic human interaction delays.
     *
     * The purpose of these actions is to prevent the game from detecting and flagging the user as
     * inactive.
     *
     * <p>Actions include:</p>
     * <ul>
     *   <li>Opening and closing the Stats tab.</li>
     *   <li>Opening and closing the Settings tab.</li>
     *   <li>Opening and closing the Equipment tab.</li>
     *   <li>Opening and closing the Friends tab.</li>
     *   <li>Opening and closing the Inventory tab.</li>
     *   <li>It will also re-open the previous tab.</li>
     * </ul>
     *
     */
    public void antiAFK();

    /**
     * Retrieves the rectangle representing the "bank" option.
     *
     * @return Rectangle the area on the screen representing the "bank" option, or null if not found.
     */
    Rectangle findBankOption();

    /**
     * Retrieves the rectangle representing the "collect" option.
     *
     * @return Rectangle the area on the screen representing the "collect" option, or null if not found.
     */
    Rectangle findCollectOption();

    /**
     * Retrieves the rectangle representing the "talk-to" option.
     *
     * @return Rectangle the area on the screen representing the "talk-to" option, or null if not found.
     */
    Rectangle findTalkToOption();

    /**
     * Retrieves the rectangle representing the "pickpocket" option.
     *
     * @return Rectangle the area on the screen representing the "pickpocket" option, or null if not found.
     */
    Rectangle findPickpocketOption();

    /**
     * Retrieves the rectangle representing the "buy-plank" option.
     *
     * @return Rectangle the area on the screen representing the "buy-plank" option, or null if not found.
     */
    Rectangle findBuyPlanksOption();

    /**
     * Retrieves the rectangle representing the "bloom" or "cast bloom" option.
     *
     * @return Rectangle the area on the screen representing the "bloom" or "cast bloom" option, or null if not found.
     */
    Rectangle findBloomOption();
}
