/**
 * Custom exception indicating an attempt to move the rover beyond the grid boundary.
 */
public class BeyondGridBoundaryException extends RuntimeException {
    /**
     * Constructs a new BeyondGridBoundaryException with the specified coordinates.
     * @param x The X-coordinate of the attempted position.
     * @param y The Y-coordinate of the attempted position.
     */
    public BeyondGridBoundaryException(int x, int y) {
        super("Moving beyond grid boundary. Rover cannot move. Current position: (" + x + ", " + y + ").");
    }
}
