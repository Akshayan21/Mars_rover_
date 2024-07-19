/**
 * Custom exception indicating an obstacle encountered by a Mars Rover.
 */
public class ObstacleEncounteredException extends RuntimeException {
    /**
     * Constructs a new ObstacleEncounteredException with the specified coordinates.
     * @param x The X-coordinate where the obstacle was encountered.
     * @param y The Y-coordinate where the obstacle was encountered.
     */
    public ObstacleEncounteredException(int x, int y) {
        super("Obstacle encountered at (" + x + ", " + y + "). Rover cannot move.");
    }
}
