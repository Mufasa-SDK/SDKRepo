package interfaces;

/**
 * Interface defining interactions with an experience bar.
 * This interface provides a method to retrieve the current experience points (XP) displayed on the XP bar.
 */
public interface iXPBar {

    /**
     * Retrieves the current experience points (XP) displayed on the XP bar. This requires the XP bar to be visible.
     *
     * @return int representing the current XP value.
     */
    int getXP();
}