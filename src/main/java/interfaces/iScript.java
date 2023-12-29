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
     * Immediately stops the script execution.
     * This method is intended to halt the script as quickly as possible,
     * and may not perform full cleanup or allow the script to reach a safe state.
     * It should be used in situations where immediate termination of the script
     * is necessary, such as in response to critical errors or emergency stop requests.
     */
    void forceStop();
}