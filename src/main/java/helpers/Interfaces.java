package helpers;

import interfaces.*;

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
