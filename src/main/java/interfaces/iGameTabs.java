package interfaces;

import java.awt.*;

/**
 * Interface defining interactions with game tabs.
 * This interface provides methods to check if certain game tabs are open,
 * to open specific game tabs, and to find the screen area of these tabs.
 */
public interface iGameTabs {
    
    // isTabOpen checks
    boolean isInventoryTabOpen();
    boolean isCombatTabOpen();
    boolean isStatsTabOpen();
    boolean isQuestsTabOpen();
    boolean isEquipTabOpen();
    boolean isPrayerTabOpen();
    boolean isMagicTabOpen();
    boolean isClanTabOpen();
    boolean isFriendsTabOpen();
    boolean isAccountTabOpen();
    boolean isLogoutTabOpen();
    boolean isSettingsTabOpen();
    boolean isEmotesTabOpen();
    boolean isMusicTabOpen();

    // openTab calls
    void openInventoryTab();
    void openCombatTab();
    void openStatsTab();
    void openQuestsTab();
    void openEquipTab();
    void openPrayerTab();
    void openMagicTab();
    void openClanTab();
    void openFriendsTab();
    void openAccountTab();
    void openLogoutTab();
    void openSettingsTab();
    void openEmotesTab();
    void openMusicTab();

    // closeTab calls
    void closeInventoryTab();
    void closeCombatTab();
    void closeStatsTab();
    void closeQuestsTab();
    void closeEquipTab();
    void closePrayerTab();
    void closeMagicTab();
    void closeClanTab();
    void closeFriendsTab();
    void closeAccountTab();
    void closeLogoutTab();
    void closeSettingsTab();
    void closeEmotesTab();
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
