package interfaces;

/**
 * Interface defining logging capabilities.
 * This interface includes methods for logging standard and debug messages.
 */
public interface iLogger {
    /**
     * Logs a message.
     * This method should be used for general logging purposes.
     *
     * @param logMessage The message to be logged.
     */
    void log(String logMessage);

    /**
     * Logs a message at the debug level.
     * This method should be used for logging detailed information useful for debugging.
     *
     * @param logMessage The debug message to be logged.
     */
    void debugLog(String logMessage);
}
