package interfaces;

/**
 * Interface for script execution management.
 */
public interface iScript {
    /**
     * Stops the script execution in a controlled manner.
     * This method should ensure that all necessary cleanup is performed
     * and resources are released properly. It's designed to allow the script
     * to finish its current task or reach a safe state before stopping.
     */
    void stop();

    /**
     * Returns the current state of the cancellation token.
     * @return true if script is requested to stop.
     */
    boolean isScriptStopping();

    /**
     * Checks if breaks are enabled for the chosen account the script is started with
     * @return true if breaks are enabled.
     */
    boolean isAccountBreaksEnabled();

    /**
     * Checks if the script is currently requested to be paused
     * @return true if paused is requested.
     */
    boolean isPaused();
}