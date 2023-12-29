package interfaces;

import java.awt.*;

/**
 * Interface defining interactions with the game's logout interface.
 * This interface provides methods for locating the logout option, performing logout actions,
 * and checking the logout status.
 */
public interface iLogout {

    /**
     * Finds the rectangle representing the logout option in the game interface.
     *
     * @return Rectangle of the logout option.
     */
    Rectangle findLogoutOption();

    /**
     * Performs the logout action.
     * This method should initiate the process of logging out of the game.
     */
    void logout();

    /**
     * Checks if the user has been successfully logged out.
     *
     * @return Boolean indicating whether the user is logged out.
     */
    Boolean isLoggedOut();
}