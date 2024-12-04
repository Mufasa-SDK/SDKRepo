package interfaces;

import helpers.utils.UITabs;

import java.awt.*;

/**
 * Interface defining interactions with game tabs.
 * This interface provides methods to check if certain game tabs are open,
 * to open specific game tabs, and to find the screen area of these tabs.
 */
public interface iGameTabs {

    // isTabOpen checks
    /**
     * Checks if a certain UI tab is open or not.
     *
     * @param UITab The UI Tab you'd like to check, pre-defined as enum.
     * @return True/false if the tab is currently open or not.
     */
    boolean isTabOpen(UITabs UITab);

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the inventory tab is open; false otherwise.
     */
    @Deprecated
    boolean isInventoryTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the combat tab is open; false otherwise.
     */
    @Deprecated
    boolean isCombatTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the stats tab is open; false otherwise.
     */
    @Deprecated
    boolean isStatsTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the quests tab is open; false otherwise.
     */
    @Deprecated
    boolean isQuestsTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the equip tab is open; false otherwise.
     */
    @Deprecated
    boolean isEquipTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the prayer tab is open; false otherwise.
     */
    @Deprecated
    boolean isPrayerTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the magic tab is open; false otherwise.
     */
    @Deprecated
    boolean isMagicTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the clan tab is open; false otherwise.
     */
    @Deprecated
    boolean isClanTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the friends tab is open; false otherwise.
     */
    @Deprecated
    boolean isFriendsTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the account tab is open; false otherwise.
     */
    @Deprecated
    boolean isAccountTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the logout tab is open; false otherwise.
     */
    @Deprecated
    boolean isLogoutTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the settings tab is open; false otherwise.
     */
    @Deprecated
    boolean isSettingsTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the emotes tab is open; false otherwise.
     */
    @Deprecated
    boolean isEmotesTabOpen();

    /**
     * @deprecated Use {@link #isTabOpen(UITabs)} instead.
     * @return True if the music tab is open; false otherwise.
     */
    @Deprecated
    boolean isMusicTabOpen();

    /**
     * Opens the selected UI Tab (if not already open currently)
     *
     * @param UITab The UI Tab you'd like to open, pre-defined as enum.
     */
    void openTab(UITabs UITab);

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openInventoryTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openCombatTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openStatsTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openQuestsTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openEquipTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openPrayerTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openMagicTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openClanTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openFriendsTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openAccountTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openLogoutTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openSettingsTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openEmotesTab();

    /**
     * @deprecated Use {@link #openTab(UITabs)} instead.
     */
    @Deprecated
    void openMusicTab();

    // closeTab calls
    /**
     * Closes the selected UI Tab (if it is open currently)
     *
     * @param UITab The UI Tab you'd like to close, pre-defined as enum.
     */
    void closeTab(UITabs UITab);

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeInventoryTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeCombatTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeStatsTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeQuestsTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeEquipTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closePrayerTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeMagicTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeClanTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeFriendsTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeAccountTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeLogoutTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeSettingsTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeEmotesTab();

    /**
     * @deprecated Use {@link #closeTab(UITabs)} instead.
     */
    @Deprecated
    void closeMusicTab();

    // findTab calls
    Rectangle findInventoryTab();
    Rectangle findCombatTab();
    Rectangle findStatsTab();
    Rectangle findQuestsTab();
    Rectangle findEquipTab();
    Rectangle findPrayerTab();
    Rectangle findMagicTab();
    Rectangle findClanTab();
    Rectangle findFriendsTab();
    Rectangle findAccountTab();
    Rectangle findLogoutTab();
    Rectangle findSettingsTab();
    Rectangle findEmotesTab();
    Rectangle findMusicTab();

}
