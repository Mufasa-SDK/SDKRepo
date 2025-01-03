package interfaces;

import helpers.utils.EquipmentSlot;

import java.awt.*;

/**
 * Interface defining interactions with equipment.
 * This interface includes methods for checking the status of equipment,
 * opening the equipment interface, and finding various equipment slots.
 */
public interface iEquipment {
    /**
     * Checks if the equipment interface is currently open.
     *
     * @return Boolean indicating whether the equipment interface is open.
     */
    Boolean isOpen();

    /**
     * Attempts to open the equipment interface.
     *
     * @return Boolean indicating whether the equipment interface was successfully opened.
     */
    Boolean open();

    /**
     * Attempts to check for a specified itemID in the specified EquipmentSlot
     *
     * @param equipmentSlot uses the SDK enum EquipmentSlot
     * @param itemToCheck is the itemID you are looking for
     * @return Boolean indicating whether the itemID was found in that equipment slot
     */
    Boolean itemAt(EquipmentSlot equipmentSlot, int itemToCheck);

    /**
     * Attempts to check for a specified itemID in the specified EquipmentSlot while also verifying a color on the item
     *
     * @param equipmentSlot uses the SDK enum EquipmentSlot
     * @param itemToCheck is the itemID you are looking for
     * @param checkColor the color to match the item with (for example the blue in a Rune scimitar)
     * @return Boolean indicating whether the itemID was found in that equipment slot
     */
    Boolean itemAt(EquipmentSlot equipmentSlot, int itemToCheck, Color checkColor);

    /**
     * Finds the rectangle representing the helm slot.
     *
     * @return Rectangle for the helm slot.
     */
    Rectangle findHelm();

    /**
     * Finds the rectangle representing the cape slot.
     *
     * @return Rectangle for the cape slot.
     */
    Rectangle findCape();

    /**
     * Finds the rectangle representing the amulet slot.
     *
     * @return Rectangle for the amulet slot.
     */
    Rectangle findAmulet();

    /**
     * Finds the rectangle representing the ammo slot.
     *
     * @return Rectangle for the ammo slot.
     */
    Rectangle findAmmo();

    /**
     * Finds the rectangle representing the weapon slot.
     *
     * @return Rectangle for the weapon slot.
     */
    Rectangle findWeapon();

    /**
     * Finds the rectangle representing the body armor slot.
     *
     * @return Rectangle for the body armor slot.
     */
    Rectangle findBody();

    /**
     * Finds the rectangle representing the shield slot.
     *
     * @return Rectangle for the shield slot.
     */
    Rectangle findShield();

    /**
     * Finds the rectangle representing the legs armor slot.
     *
     * @return Rectangle for the legs armor slot.
     */
    Rectangle findLegs();

    /**
     * Finds the rectangle representing the gloves slot.
     *
     * @return Rectangle for the gloves slot.
     */
    Rectangle findGloves();

    /**
     * Finds the rectangle representing the feet armor slot.
     *
     * @return Rectangle for the feet armor slot.
     */
    Rectangle findFeet();

    /**
     * Finds the rectangle representing the ring slot.
     *
     * @return Rectangle for the ring slot.
     */
    Rectangle findRing();
}
