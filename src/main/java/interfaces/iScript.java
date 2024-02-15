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
}