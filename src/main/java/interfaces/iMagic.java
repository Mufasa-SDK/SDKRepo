package interfaces;

import helpers.utils.Spells;

/**
 * Interface defining interactions with various magic spellbooks in a game.
 * This interface includes methods for tapping (activating) various spells
 * across standard, ancient, lunar, and Arceuus spellbooks.
 */
public interface iMagic {


    /**
     * Checks if a spell is cast able or not (enough runes / high enough magic level)
     *
     * @param spell The spell, selectable from the Spells enum.
     *
     * @return true if the icon is 'lit' meaning we have the required level and runes.
     */
    public boolean isCastable(Spells spell);

    /**
     * Casts the selected spell from the spells enum, needs to have the magic tab open already to work
     * Supports unfiltered and filtered spell books.
     *
     * @param spell The spell, selectable from the Spells enum.
     */
    public void castSpell(Spells spell);

}
