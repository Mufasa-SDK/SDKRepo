package helpers;

import interfaces.*;

import java.util.Map;

public abstract class AbstractScript {
    protected iBank bank;
    protected iClient client;
    protected iCondition condition;
    protected iDepositBox depositBox;
    protected iEquipment equipment;
    protected iGame game;
    protected iGameTabs gameTabs;
    protected iInventory inventory;
    protected iLogger logger;
    protected iLogin login;
    protected iLogout logout;
    protected iMagic magic;
    protected iOverlay overlay;
    protected iPlayer player;
    protected iPrayer prayer;
    protected iStats stats;
    protected iWalker walker;
    protected iXPBar xpBar;
    protected iChatbox chatbox;
    protected iScript script;

    private final Object pauseLock = new Object();
    private boolean paused = false;

    public void initialize(iLogger logger, iBank bank, iClient client, iCondition condition, iDepositBox depositBox, iEquipment equipment, iGame game, iGameTabs gameTabs, iInventory inventory, iLogin login, iLogout logout, iMagic magic, iOverlay overlay, iPlayer player, iPrayer prayer, iStats stats, iWalker walker, iXPBar xpBar, iChatbox chatbox, iScript script) {
        this.logger = logger;
        this.bank = bank;
        this.client = client;
        this.condition = condition;
        this.depositBox = depositBox;
        this.equipment = equipment;
        this.game = game;
        this.gameTabs = gameTabs;
        this.inventory = inventory;
        this.login = login;
        this.logout = logout;
        this.magic = magic;
        this.overlay = overlay;
        this.player = player;
        this.prayer = prayer;
        this.stats = stats;
        this.walker = walker;
        this.xpBar = xpBar;
        this.chatbox = chatbox;
        this.script = script;
    }

    private Map<String, String> configurations;
    public void setConfigurations(Map<String, String> configurations) {
        this.configurations = configurations;
    }

    public Map<String, String> getConfigurations() {
        return configurations;
    }

    // Method to set the paused state
    public void setPaused(boolean paused) {
        synchronized (pauseLock) {
            this.paused = paused;
            if (!paused) {
                pauseLock.notifyAll(); // Wake up the thread if it's waiting
            }
        }
    }

    // Method to check and wait if paused
    protected void checkAndPause() {
        synchronized (pauseLock) {
            while (paused) {
                try {
                    pauseLock.wait(); // Wait until notified
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore the interrupted status
                    break;
                }
            }
        }
    }
    public void running() {
        checkAndPause();
        poll();
    }
    public abstract void onStart();

    public abstract void poll();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
