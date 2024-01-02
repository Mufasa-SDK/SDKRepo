package helpers;

import interfaces.*;

/**
 * This class serves as a central point for accessing various game interfaces.
 * It holds static references to different interface types used throughout the script.
 */
public class Interfaces {
    public static iBank bank;
    public static iClient client;
    public static iCondition condition;
    public static iDepositBox depositBox;
    public static iEquipment equipment;
    public static iGame game;
    public static iGameTabs gameTabs;
    public static iInventory inventory;
    public static iLogger logger;
    public static iLogin login;
    public static iLogout logout;
    public static iMagic magic;
    public static iOverlay overlay;
    public static iPlayer player;
    public static iPrayer prayer;
    public static iStats stats;
    public static iWalker walker;
    public static iXPBar xpBar;
    public static iChatbox chatbox;
    public static iScript script;

    /**
     * Initializes the static references to the various game interfaces.
     * This method is called to set up all interfaces required for the script.
     *
     * @param logger The logging interface.
     * @param bank The banking interface.
     * @param client The client interface.
     * @param condition The condition interface.
     * @param depositBox The deposit box interface.
     * @param equipment The equipment interface.
     * @param game The game interface.
     * @param gameTabs The game tabs interface.
     * @param inventory The inventory interface.
     * @param login The login interface.
     * @param logout The logout interface.
     * @param magic The magic interface.
     * @param overlay The overlay interface.
     * @param player The player interface.
     * @param prayer The prayer interface.
     * @param stats The stats interface.
     * @param walker The walker interface.
     * @param xpBar The XP bar interface.
     * @param chatbox The chatbox interface.
     * @param script The script interface.
     */
    public static void initialize(iLogger logger, iBank bank, iClient client, iCondition condition, iDepositBox depositBox, iEquipment equipment, iGame game, iGameTabs gameTabs, iInventory inventory, iLogin login, iLogout logout, iMagic magic, iOverlay overlay, iPlayer player, iPrayer prayer, iStats stats, iWalker walker, iXPBar xpBar, iChatbox chatbox, iScript script) {
        Interfaces.logger = logger;
        Interfaces.bank = bank;
        Interfaces.client = client;
        Interfaces.condition = condition;
        Interfaces.depositBox = depositBox;
        Interfaces.equipment = equipment;
        Interfaces.game = game;
        Interfaces.gameTabs = gameTabs;
        Interfaces.inventory = inventory;
        Interfaces.login = login;
        Interfaces.logout = logout;
        Interfaces.magic = magic;
        Interfaces.overlay = overlay;
        Interfaces.player = player;
        Interfaces.prayer = prayer;
        Interfaces.stats = stats;
        Interfaces.walker = walker;
        Interfaces.xpBar = xpBar;
        Interfaces.chatbox = chatbox;
        Interfaces.script = script;
    }
}
