package helpers.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapChunk {
    private final List<String> coordinates;

    // Constructor to initialize MapChunk with one or multiple coordinates
    public MapChunk(String... chunks) {
        this.coordinates = new ArrayList<>(Arrays.asList(chunks));
    }

    // Method to get the list of coordinates
    public List<String> getChunks() {
        return coordinates;
    }
}