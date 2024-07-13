package interfaces;

public interface iGE {

    /**
     * Fetches the Grand Exchange price for a given item ID from the OSRS price API.
     *
     * @param itemID the ID of the item to fetch the price for.
     * @return the latest high price if available, otherwise the low price. Returns -1 if both prices are unavailable or in case of an error.
     */
    int fetchGEPrice(int itemID);
}