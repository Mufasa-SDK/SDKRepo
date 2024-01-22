package helpers.utils;

import java.awt.*;

/**
 * Defines standard colors used for various overlays in the game interface.
 * Each color constant represents a specific aspect or activity.
 */

public class OverlayColor {
    /**
     * A standard color for general highlighting.
     */
    public static final Color RED;

    /**
     * A specific color associated with Agility overlays.
     */
    public static final Color AGILITY;

    /**
     * A standard color.
     */
    public static final Color BLUE;

    /**
     * A specific color associated with Fishing overlays.
     */
    public static final Color FISHING;

    static {
        RED = new Color(0xff3522);
        AGILITY = new Color(0x21ff26);
        BLUE = new Color(0x579839);
        FISHING = new Color(0x29ffff);
    }
}