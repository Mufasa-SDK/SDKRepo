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
     * Checks if its time to go to break
     * @return true if script is requested to enter break.
     */
    boolean isTimeForBreak();
}