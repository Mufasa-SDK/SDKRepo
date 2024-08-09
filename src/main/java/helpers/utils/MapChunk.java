package helpers.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapChunk {
    private final List<String> chunks;
    private final List<String> planes;

    // Constructor to initialize MapChunk with one or multiple coordinates
    public MapChunk(String[] chunks, String... planes) {
        this.chunks = new ArrayList<>(Arrays.asList(chunks));
        this.planes = new ArrayList<>();
        for (String plane : planes) {
            if (isValidPlane(plane)) {
                this.planes.add(plane);
            } else {
                throw new IllegalArgumentException("Plane must be between 0 and 3: " + plane);
            }
        }
    }

    // Method to check if a plane is valid (0-3)
    private boolean isValidPlane(String plane) {
        return plane.matches("[0-3]");
    }

    // Method to get the list of chunks
    public List<String> getChunks() {
        return chunks;
    }

    // Method to get the list of planes
    public List<String> getPlanes() {
        return planes;
    }
}