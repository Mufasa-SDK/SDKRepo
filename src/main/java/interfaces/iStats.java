package interfaces;

import helpers.utils.Skills;

/**
 * Interface defining interactions with the game's statistics interface.
 * This interface provides methods to check if the stats interface is open and to open it.
 */
public interface iStats {
    /**
     * Gets the real level of the specified stat using OCR.
     *
     * @param skill of the skill level you want to check from the @Skills enum
     * @return Integer indicating the real level of the skill you're checking.
     */
    Integer getRealLevel(Skills skill);

    /**
     * Gets the effective (boosted or reduced) level of the specified stat using OCR.
     *
     * @param skill of the skill level you want to check from the @Skills enum
     * @return Integer indicating the real level of the skill you're checking.
     */
    Integer getEffectiveLevel(Skills skill);

    /**
     * Gets the total level using OCR.
     *
     * @return Integer indicating the total level.
     */
    Integer getTotalLevel();

}
