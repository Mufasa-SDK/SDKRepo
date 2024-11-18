package helpers.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines the list of smithing items and their corresponding IDs.
 */
public enum SmithItems {
    // Bronze items
    BRONZE_DAGGER("Bronze Dagger", 1205),
    BRONZE_AXE("Bronze Axe", 1351),
    BRONZE_MACE("Bronze Mace", 1422),
    BRONZE_MEDIUM_HELM("Bronze Medium helm", 1139),
    BRONZE_BOLTS("Bronze Bolts", 9386),
    BRONZE_SWORD("Bronze Sword", 1277),
    BRONZE_DART_TIPS("Bronze Dart tips", 819),
    BRONZE_NAILS("Bronze Nails", 4819),
    BRONZE_SCIMITAR("Bronze Scimitar", 1321),
    BRONZE_ARROWTIPS("Bronze Arrowtips", 39),
    BRONZE_LIMBS("Bronze Limbs", 9420),
    BRONZE_LONG_SWORD("Bronze Long sword", 1291),
    BRONZE_JAVELIN_HEADS("Bronze Javelin heads", 3072),
    BRONZE_FULL_HELM("Bronze Full helm", 1155),
    BRONZE_KNIVES("Bronze Knives", 864),
    BRONZE_SQUARE_SHIELD("Bronze Square shield", 1173),
    BRONZE_WARHAMMER("Bronze Warhammer", 1337),
    BRONZE_BATTLE_AXE("Bronze Battle axe", 1375),
    BRONZE_CHAIN_BODY("Bronze Chain body", 1103),
    BRONZE_KITE_SHIELD("Bronze Kite shield", 1189),
    BRONZE_CLAWS("Bronze Claws", 3094),
    BRONZE_2_HAND_SWORD("Bronze 2-hand sword", 1307),
    BRONZE_PLATE_LEGS("Bronze Plate legs", 1075),
    BRONZE_PLATE_SKIRT("Bronze Plate skirt", 1087),
    BRONZE_PLATE_BODY("Bronze Plate body", 1117),
    BRONZE_WIRE("Bronze Wire", 1794),

    // Iron items
    IRON_DAGGER("Iron Dagger", 1203),
    IRON_AXE("Iron Axe", 1349),
    IRON_MACE("Iron Mace", 1420),
    IRON_MEDIUM_HELM("Iron Medium helm", 1137),
    IRON_BOLTS("Iron Bolts", 9394),
    IRON_SWORD("Iron Sword", 1279),
    IRON_DART_TIPS("Iron Dart tips", 820),
    IRON_NAILS("Iron Nails", 4820),
    IRON_SCIMITAR("Iron Scimitar", 1323),
    IRON_ARROWTIPS("Iron Arrowtips", 40),
    IRON_LIMBS("Iron Limbs", 9423),
    IRON_LONG_SWORD("Iron Long sword", 1293),
    IRON_JAVELIN_HEADS("Iron Javelin heads", 3082),
    IRON_FULL_HELM("Iron Full helm", 1153),
    IRON_KNIVES("Iron Knives", 863),
    IRON_SQUARE_SHIELD("Iron Square shield", 1175),
    IRON_WARHAMMER("Iron Warhammer", 1335),
    IRON_BATTLE_AXE("Iron Battle axe", 1363),
    IRON_CHAIN_BODY("Iron Chain body", 1101),
    IRON_KITE_SHIELD("Iron Kite shield", 1191),
    IRON_CLAWS("Iron Claws", 3096),
    IRON_2_HAND_SWORD("Iron 2-hand sword", 1309),
    IRON_PLATE_LEGS("Iron Plate legs", 1067),
    IRON_PLATE_SKIRT("Iron Plate skirt", 1081),
    IRON_PLATE_BODY("Iron Plate body", 1115),
    IRON_SPIT("Iron spit", 7225),
    OIL_LAMP("Oil lamp", 4540),

    // Steel items
    STEEL_DAGGER("Steel Dagger", 1207),
    STEEL_AXE("Steel Axe", 1353),
    STEEL_MACE("Steel Mace", 1424),
    STEEL_MEDIUM_HELM("Steel Medium helm", 1141),
    STEEL_BOLTS("Steel Bolts", 9398),
    STEEL_SWORD("Steel Sword", 1281),
    STEEL_DART_TIPS("Steel Dart tips", 821),
    STEEL_NAILS("Steel Nails", 1539),
    STEEL_SCIMITAR("Steel Scimitar", 1325),
    STEEL_ARROWTIPS("Steel Arrowtips", 41),
    STEEL_LIMBS("Steel Limbs", 9425),
    STEEL_LONG_SWORD("Steel Long sword", 1295),
    STEEL_JAVELIN_HEADS("Steel Javelin heads", 3090),
    STEEL_FULL_HELM("Steel Full helm", 1157),
    STEEL_KNIVES("Steel Knives", 865),
    STEEL_SQUARE_SHIELD("Steel Square shield", 1177),
    STEEL_WARHAMMER("Steel Warhammer", 1339),
    STEEL_BATTLE_AXE("Steel Battle axe", 1365),
    STEEL_CHAIN_BODY("Steel Chain body", 1105),
    STEEL_KITE_SHIELD("Steel Kite shield", 1193),
    STEEL_CLAWS("Steel Claws", 3097),
    STEEL_2_HAND_SWORD("Steel 2-hand sword", 1311),
    STEEL_PLATE_LEGS("Steel Plate legs", 1069),
    STEEL_PLATE_SKIRT("Steel Plate skirt", 1083),
    STEEL_PLATE_BODY("Steel Plate body", 1119),
    STEEL_STUDS("Steel Studs", 2370),
    STEEL_BULLSEYE_LAMP("Steel Bullseye lamp", 4544),

    // Mithril items
    MITHRIL_DAGGER("Mithril Dagger", 1209),
    MITHRIL_AXE("Mithril Axe", 1355),
    MITHRIL_MACE("Mithril Mace", 1428),
    MITHRIL_MEDIUM_HELM("Mithril Medium helm", 1143),
    MITHRIL_BOLTS("Mithril Bolts", 9402),
    MITHRIL_SWORD("Mithril Sword", 1285),
    MITHRIL_DART_TIPS("Mithril Dart tips", 822),
    MITHRIL_NAILS("Mithril Nails", 4822),
    MITHRIL_SCIMITAR("Mithril Scimitar", 1329),
    MITHRIL_ARROWTIPS("Mithril Arrowtips", 42),
    MITHRIL_LIMBS("Mithril Limbs", 9427),
    MITHRIL_LONG_SWORD("Mithril Long sword", 1299),
    MITHRIL_JAVELIN_HEADS("Mithril Javelin heads", 3246),
    MITHRIL_FULL_HELM("Mithril Full helm", 1159),
    MITHRIL_KNIVES("Mithril Knives", 866),
    MITHRIL_SQUARE_SHIELD("Mithril Square shield", 1181),
    MITHRIL_WARHAMMER("Mithril Warhammer", 1343),
    MITHRIL_BATTLE_AXE("Mithril Battle axe", 1369),
    MITHRIL_CHAIN_BODY("Mithril Chain body", 1109),
    MITHRIL_KITE_SHIELD("Mithril Kite shield", 1197),
    MITHRIL_CLAWS("Mithril Claws", 3099),
    MITHRIL_2_HAND_SWORD("Mithril 2-hand sword", 1315),
    MITHRIL_PLATE_LEGS("Mithril Plate legs", 1071),
    MITHRIL_PLATE_SKIRT("Mithril Plate skirt", 1085),
    MITHRIL_PLATE_BODY("Mithril Plate body", 1121),
    MITHRIL_GRAPPLE_TIP("Mithril Grapple Tip", 9416),

    // Adamantite items
    ADAMANT_DAGGER("Adamant Dagger", 1211),
    ADAMANT_AXE("Adamant Axe", 1357),
    ADAMANT_MACE("Adamant Mace", 1430),
    ADAMANT_MEDIUM_HELM("Adamant Medium helm", 1145),
    ADAMANT_BOLTS("Adamant Bolts", 9406),
    ADAMANT_SWORD("Adamant Sword", 1287),
    ADAMANT_DART_TIPS("Adamant Dart tips", 823),
    ADAMANT_NAILS("Adamant Nails", 4823),
    ADAMANT_SCIMITAR("Adamant Scimitar", 1331),
    ADAMANT_ARROWTIPS("Adamant Arrowtips", 43),
    ADAMANT_LIMBS("Adamant Limbs", 9429),
    ADAMANT_LONG_SWORD("Adamant Long sword", 1301),
    ADAMANT_JAVELIN_HEADS("Adamant Javelin heads", 3909),
    ADAMANT_FULL_HELM("Adamant Full helm", 1161),
    ADAMANT_KNIVES("Adamant Knives", 867),
    ADAMANT_SQUARE_SHIELD("Adamant Square shield", 1183),
    ADAMANT_WARHAMMER("Adamant Warhammer", 1345),
    ADAMANT_BATTLE_AXE("Adamant Battle axe", 1371),
    ADAMANT_CHAIN_BODY("Adamant Chain body", 1111),
    ADAMANT_KITE_SHIELD("Adamant Kite shield", 1199),
    ADAMANT_CLAWS("Adamant Claws", 3100),
    ADAMANT_2_HAND_SWORD("Adamant 2-hand sword", 1317),
    ADAMANT_PLATE_LEGS("Adamant Plate legs", 1073),
    ADAMANT_PLATE_SKIRT("Adamant Plate skirt", 1091),
    ADAMANT_PLATE_BODY("Adamant Plate body", 1123),

    // Runite items
    RUNE_DAGGER("Rune Dagger", 1213),
    RUNE_AXE("Rune Axe", 1359),
    RUNE_MACE("Rune Mace", 1423),
    RUNE_MEDIUM_HELM("Rune Medium helm", 1147),
    RUNE_BOLTS("Rune Bolts", 9410),
    RUNE_SWORD("Rune Sword", 1289),
    RUNE_DART_TIPS("Rune Dart tips", 824),
    RUNE_NAILS("Rune Nails", 4824),
    RUNE_SCIMITAR("Rune Scimitar", 1333),
    RUNE_ARROWTIPS("Rune Arrowtips", 44),
    RUNE_LIMBS("Rune Limbs", 9431),
    RUNE_LONG_SWORD("Rune Long sword", 1303),
    RUNE_JAVELIN_HEADS("Rune Javelin heads", 3917),
    RUNE_FULL_HELM("Rune Full helm", 1163),
    RUNE_KNIVES("Rune Knives", 868),
    RUNE_SQUARE_SHIELD("Rune Square shield", 1185),
    RUNE_WARHAMMER("Rune Warhammer", 1347),
    RUNE_BATTLE_AXE("Rune Battle axe", 1373),
    RUNE_CHAIN_BODY("Rune Chain body", 1113),
    RUNE_KITE_SHIELD("Rune Kite shield", 1201),
    RUNE_CLAWS("Rune Claws", 3101),
    RUNE_2_HAND_SWORD("Rune 2-hand sword", 1319),
    RUNE_PLATE_LEGS("Rune Plate legs", 1079),
    RUNE_PLATE_SKIRT("Rune Plate skirt", 1093),
    RUNE_PLATE_BODY("Rune Plate body", 1127);

    private final String itemName;
    private final int itemID;

    private static final Map<String, SmithItems> NAME_MAP = new HashMap<>();

    // Static block to populate the NAME_MAP
    static {
        for (SmithItems item : values()) {
            NAME_MAP.put(item.itemName.toLowerCase(), item);
        }
    }

    SmithItems(String itemName, int itemID) {
        this.itemName = itemName;
        this.itemID = itemID;
    }

    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public static int getSmithingItemID(String itemName) {
        SmithItems item = NAME_MAP.get(itemName.toLowerCase());
        return item != null ? item.getItemID() : -1; // Return -1 if the item is not found
    }
}