package helpers.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapChunk {
    private final List<String> chunks;
    private final List<String> planes;

    public MapChunk(String[] chunks, String planes) {
        this.chunks = new ArrayList<>(Arrays.asList(chunks));
        this.planes = new ArrayList<>();
        // Split the planes string by commas and validate each plane
        String[] planeArray = planes.split(",");
        for (String plane : planeArray) {
            plane = plane.trim(); // Trim any whitespace
            if (isValidPlane(plane)) {
                this.planes.add(plane);
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