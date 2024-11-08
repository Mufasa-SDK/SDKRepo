package interfaces;

import java.awt.*;

/**
 * Interface defining interactions with the game's login interface.
 * This interface provides methods for finding login options and performing login actions.
 */
public interface iLogin {
    /**
     * Finds the rectangle representing the 'Play Now' option in the login interface.
     *
     * @return Rectangle of the 'Play Now' option.
     */
    Rectangle findPlayNowOption();

    /**
     * Finds the rectangle representing the 'Tap to Play' option in the login interface.
     *
     * @return Rectangle of the 'Tap to Play' option.
     */
    Rectangle findTapToPlayOption();

    /**
     * Performs the login action.
     * This method should contain the necessary steps to log into the game.
     */
    void login();

    /**
     * Performs any necessary setup before script start.
     * This includes setting up configurations or preparing the login interface and setting camera orientation etc.
     *
     * @param skipZoom decides if you want to skip setting zoom levels in the pre-setup call
     */
    void preSetup(boolean skipZoom);
}
