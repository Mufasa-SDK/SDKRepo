package helpers;

/**
 * Represents the categories of scripts available in the game.
 * Each category corresponds to a specific skill or type of activity.
 */
public enum ScriptCategory {
    Agility,
    Combat,
    Cooking,
    Crafting,
    Construction,
    Farming,
    Firemaking,
    Fishing,
    Fletching,
    Herblore,
    Hunter,
    Magic,
    Mining,
    Prayer,
    Runecrafting,
    Slayer,
    Smithing,
    Thieving,
    Woodcutting,
    Moneymaking,
    Minigames,
    Misc,
    Ironman,
    /**
     * Represents scripts that are made custom for users and only accessible by those users
     */
    Custom,
    /**
     * Represents scripts that are currently still in pre-release/beta.
     */
    Beta,
    /**
     * Represents scripts that are executed locally.
     */
    Local;
}
