package helpers;

import interfaces.*;

/**
 * This class serves as a central point for accessing various game interfaces.
 * It holds static references to different interface types used throughout the script.
 */
public class Interfaces {
    public static iGE GrandExchange;
    public static iInterfaces interfaces;
    public static iBank Bank;
    public static iClient Client;
    public static iCondition Condition;
    public static iDepositBox DepositBox;
    public static iEquipment Equipment;
    public static iGame Game;
    public static iGameTabs GameTabs;
    public static iInventory Inventory;
    public static iLogger Logger;
    public static iLogin Login;
    public static iLogout Logout;
    public static iMagic Magic;
    public static iOverlay Overlay;
    public static iPlayer Player;
    public static iPrayer Prayer;
    public static iStats Stats;
    public static iWalker Walker;
    public static iXPBar XpBar;
    public static iChatbox Chatbox;
    public static iObjects Objects;
    public static iScript Script;
    public static iPaint Paint;

    /**
     * Initializes the static references to the various game interfaces.
     * This method is called to set up all interfaces required for the script.
     *
     * @param ge The Grand Exchange interface.
     * @param interfaces The Interfaces interface.
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
     * @param objects The objects interface.
     * @param script The script interface.
     * @param paint The paint interface.
     */
    public static void initialize(iGE ge,iInterfaces interfaces, iLogger logger, iBank bank, iClient client, iCondition condition, iDepositBox depositBox, iEquipment equipment, iGame game, iGameTabs gameTabs, iInventory inventory, iLogin login, iLogout logout, iMagic magic, iOverlay overlay, iPlayer player, iPrayer prayer, iStats stats, iWalker walker, iXPBar xpBar, iChatbox chatbox, iObjects objects, iScript script, iPaint paint) {
        Interfaces.GrandExchange = ge;
        Interfaces.interfaces = interfaces;
        Interfaces.Logger = logger;
        Interfaces.Bank = bank;
        Interfaces.Client = client;
        Interfaces.Condition = condition;
        Interfaces.DepositBox = depositBox;
        Interfaces.Equipment = equipment;
        Interfaces.Game = game;
        Interfaces.GameTabs = gameTabs;
        Interfaces.Inventory = inventory;
        Interfaces.Login = login;
        Interfaces.Logout = logout;
        Interfaces.Magic = magic;
        Interfaces.Overlay = overlay;
        Interfaces.Player = player;
        Interfaces.Prayer = prayer;
        Interfaces.Stats = stats;
        Interfaces.Walker = walker;
        Interfaces.XpBar = xpBar;
        Interfaces.Chatbox = chatbox;
        Interfaces.Objects = objects;
        Interfaces.Script = script;
        Interfaces.Paint = paint;
    }
}
