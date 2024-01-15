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
}
