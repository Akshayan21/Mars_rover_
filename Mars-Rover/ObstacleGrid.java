import java.util.HashSet;
import java.util.Set;

/**
 * Represents a grid component containing obstacles for a Mars Rover simulation.
 */
public class ObstacleGrid implements GridComponent {
    private Set<GridComponent> obstacles;

    /**
     * Constructs a new ObstacleGrid with an empty set of obstacles.
     */
    public ObstacleGrid() {
        this.obstacles = new HashSet<>();
    }

    /**
     * Adds an obstacle to the grid.
     * 
     * @param obstacle The obstacle to be added to the grid.
     */
    public void addObstacle(GridComponent obstacle) {
        obstacles.add(obstacle);
    }

    /**
     * Displays the positions of obstacles on the grid.
     */
    @Override
    public void displayPosition() {
        for (GridComponent obstacle : obstacles) {
            obstacle.displayPosition();
        }
    }
}
