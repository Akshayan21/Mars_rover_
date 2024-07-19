/**
 * Enumeration representing the cardinal directions (North, East, South, West).
 * Provides methods for rotating the direction left and right.
 */
public enum Direction {
    N, // North
    E, // East
    S, // South
    W; // West
    
    /**
     * Rotate the direction 90 degrees to the left.
     * @return The new direction after the left rotation.
     */
    public Direction turnLeft() {
        int newIndex = (ordinal() - 1 + values().length) % values().length;      
        return values()[newIndex];
    }

    /**
     * Rotate the direction 90 degrees to the right.
     * @return The new direction after the right rotation.
     */
    public Direction turnRight() {
        int newIndex = (ordinal() + 1) % values().length;        
        return values()[newIndex];
    }
}
