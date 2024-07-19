import java.util.HashSet;
import java.util.Set;

/**
 * Class representing a Mars Rover on a grid.
 * Implements the GridComponent interface for displaying the position on the
 * grid.
 */
public class MarsRover implements GridComponent {
    private int x;
    private int y;
    private Direction direction;
    private Set<String> obstacles;
    private int gridSizeX; // Maximum X-coordinate of the grid
    private int gridSizeY; // Maximum Y-coordinate of the grid

    /**
     * Constructor to initialize the MarsRover with a specified position and
     * direction.
     * 
     * @param x         The initial X-coordinate of the rover.
     * @param y         The initial Y-coordinate of the rover.
     * @param direction The initial direction the rover is facing.
     * @param gridSizeX The maximum X-coordinate of the grid.
     * @param gridSizeY The maximum Y-coordinate of the grid.
     */
    public MarsRover(int x, int y, Direction direction, int gridSizeX, int gridSizeY) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.obstacles = new HashSet<>();
        this.gridSizeX = gridSizeX;
        this.gridSizeY = gridSizeY;
    }

    /**
     * Gets the current X-coordinate of the rover.
     * 
     * @return The current X-coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the current Y-coordinate of the rover.
     * 
     * @return The current Y-coordinate.
     */
    public int getY() {
        return y;
    }

    /**
     * Gets the current direction the rover is facing.
     * 
     * @return The current direction.
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Checks if there is an obstacle at the current position.
     * 
     * @return True if there is an obstacle, false otherwise.
     */
    public boolean hasObstacle() {
        String currentPosition = x + ":" + y;

        for (String obstacle : obstacles) {
            if (obstacle.equals(currentPosition)) {
                return true; // Obstacle found at the current position
            }
        }

        return false; // No obstacle at the current position
    }

    /**
     * Rotates the rover left or right based on the provided rotation character.
     * 
     * @param rotation The rotation character ('L' for left, 'R' for right).
     */
    public void rotate(char rotation) {
        if (rotation == 'L') {
            direction = direction.turnLeft();
        } else if (rotation == 'R') {
            direction = direction.turnRight();
        }
    }

    /**
     * Moves the rover in the current direction.
     * Checks for obstacles and grid boundaries, throwing exceptions if encountered.
     */
    public void move() {
        int nextX = x;
        int nextY = y;

        switch (direction) {
            case N:
                nextY++;
                break;
            case E:
                nextX++;
                break;
            case S:
                nextY--;
                break;
            case W:
                nextX--;
                break;
        }

        // Check for obstacles and boundary conditions
        String nextPosition = nextX + ":" + nextY;

        try {
            if (obstacles.contains(nextPosition)) {
                throw new ObstacleEncounteredException(nextX, nextY);
            }

            if (!isValidPosition(nextX, nextY)) {
                throw new BeyondGridBoundaryException(x, y);
            }

            // Move the rover
            x = nextX;
            y = nextY;
        } catch (ObstacleEncounteredException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (BeyondGridBoundaryException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

    /**
     * Checks if a position is valid within the grid boundaries.
     * 
     * @param x The X-coordinate to check.
     * @param y The Y-coordinate to check.
     * @return True if the position is valid, false otherwise.
     */
    private boolean isValidPosition(int x, int y) {
        int maxX = gridSizeX; // Maximum X-coordinate of the grid
        int maxY = gridSizeY; // Maximum Y-coordinate of the grid
        return x >= 0 && x <= maxX && y >= 0 && y <= maxY;
    }

    /**
     * Adds an obstacle to the grid at the specified position.
     * 
     * @param x The X-coordinate of the obstacle.
     * @param y The Y-coordinate of the obstacle.
     */
    public void addObstacle(int x, int y) {
        obstacles.add(x + ":" + y);
    }

    /**
     * Displays the current position of the rover.
     */
    @Override
    public void displayPosition() {
        System.out.println("Current position: (" + x + ", " + y + ", " + direction + ")");
    }
}
