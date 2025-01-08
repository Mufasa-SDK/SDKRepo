package interfaces;

import java.util.concurrent.Callable;

/**
 * Interface defining conditions and waiting mechanisms.
 * This interface provides methods for implementing sleep and conditional waiting functionalities.
 */
public interface iCondition {

    /**
     * Causes the current thread to sleep for the specified amount of time.
     * This is a blocking operation that pauses the thread for the given duration.
     *
     * @param intervalMillis the duration to sleep in milliseconds.
     */
    void sleep(int intervalMillis);

    /**
     * Causes the current thread to sleep for a random amount of time.
     * This is a blocking operation that pauses the thread for the given duration.
     *
     * @param minMillis the minimum duration to sleep in milliseconds.
     * @param maxMillis the maximum duration to sleep in milliseconds.
     */
    void sleep(int minMillis, int maxMillis);

    /**
     * Waits for a specified condition to be met, checking at regular intervals, up to a maximum number of attempts.
     * The method repeatedly checks the given condition until it returns true or the maximum number of attempts is reached.
     *
     * @param conditionCallable a {@link Callable} representing the condition to be evaluated.
     *                          This callable should return {@code true} when the condition is met.
     * @param intervalMillis    the interval in milliseconds between each attempt to check the condition.
     * @param attempts          the maximum number of attempts to check the condition.
     */
    void wait(Callable<Boolean> conditionCallable, int intervalMillis, int attempts);
}
