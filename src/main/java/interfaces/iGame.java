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
}
