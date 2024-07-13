package helpers;

import interfaces.*;
import java.util.Map;

public abstract class AbstractScript {
    private final Object pauseLock = new Object();
    private boolean paused = false;
    private boolean isInitialized = false;

    public void initialize(iGE ge, iLogger logger, iBank bank, iClient client, iCondition condition, iDepositBox depositBox, iEquipment equipment, iGame game, iGameTabs gameTabs, iInventory inventory, iLogin login, iLogout logout, iMagic magic, iOverlay overlay, iPlayer player, iPrayer prayer, iStats stats, iWalker walker, iXPBar xpBar, iChatbox chatbox, iObjects objects, iScript script, iPaint paint) {
        Interfaces.initialize(ge, logger, bank, client, condition, depositBox, equipment, game, gameTabs, inventory, login, logout, magic, overlay, player, prayer, stats, walker, xpBar, chatbox, objects, script, paint);
        isInitialized = true;
    }

    private Map<String, String> configurations;
    public void setConfigurations(Map<String, String> configurations) {
        this.configurations = configurations;
    }

    public Map<String, String> getConfigurations() {
        return configurations;
    }

    public boolean isPaused() {
        return paused;
    }

    // Method to set the paused state
    public void setPaused(boolean state) {
        synchronized (pauseLock) {
            paused = state;
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
                    // Re-interrupt the thread
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    public void run() {
        if (!Thread.interrupted()) {
            checkAndPause();
            poll();
        }
    }

    public abstract void onStart();

    public abstract void poll();

    public boolean isInitialized() {
        return isInitialized;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
