package interfaces;

/**
 * Interface defining interactions with the game's statistics interface.
 * This interface provides methods to check if the stats interface is open and to open it.
 */
public interface iStats {

    /**
     * Checks if the statistics interface is currently open.
     *
     * @return boolean indicating whether the stats interface is open.
     */
    boolean isOpen();

    /**
     * Opens the statistics interface.
     * This method should initiate the process of opening the stats interface.
     *
     * @return boolean indicating whether the operation to open the stats interface was successful.
     */
    boolean open();
}
