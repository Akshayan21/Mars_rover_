public class MarsRoverSimulation {
    public static void main(String[] args) {
        // Set grid size
        int gridSizeX = 10;
        int gridSizeY = 10;

        // Initial rover position and direction
        int initialX = 0;
        int initialY = 0;
        Direction initialDirection = Direction.N;

        // Create MarsRover object
        MarsRover rover = new MarsRover(initialX, initialY, initialDirection, gridSizeX, gridSizeY);

        // Add obstacles to the grid
        rover.addObstacle(1, 2);
        rover.addObstacle(2, 2);
        rover.addObstacle(3, 4);

        // User inputs
        String commandsInput = "MRMLMRM";

        // Execute commands
        for (char command : commandsInput.toCharArray()) {
            if (command == 'L' || command == 'R') {
                rover.rotate(command);
            } else if (command == 'M') {
                rover.move();
            } else {
                System.out.println("Invalid command: " + command);
            }
        }
        // Print the final position of the rover
        rover.displayPosition();
    }
}