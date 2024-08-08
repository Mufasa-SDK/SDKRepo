package helpers.utils;

import java.util.ArrayList;
import java.util.List;

public class MapPlane {
    private final List<String> planes;

    public MapPlane(String... planes) {
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

    // Method to get the list of planes
    public List<String> getPlanes() {
        return planes;
    }
}