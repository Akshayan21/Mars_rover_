import java.util.Scanner;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set grid size
        int gridSizeX = 10;
        int gridSizeY = 10;

        // Initial rover position and direction
        int initialX = 0;
        int initialY = 0;
        Direction initialDirection = Direction.N;

        // Create MarsRover object
        MarsRover rover = new MarsRover(initialX, initialY, initialDirection, gridSizeX, gridSizeY);

        // Add obstacles to the grid (optional, can be done via user input as well)
        rover.addObstacle(1, 10);
        // rover.addObstacle(2, 8);
        // rover.addObstacle(3, 4);

        // Get user input for commands
        System.out.println("Enter commands for the Mars Rover (L, R, M): ");
        String commandsInput = scanner.nextLine();

        // Execute commands
        for (char command : commandsInput.toCharArray()) {
            if (command == 'L' || command == 'R') {
                rover.rotate(command);
                rover.displayPosition();
            } else if (command == 'M') {
                rover.move();
                rover.displayPosition();
            } else {
                System.out.println("Invalid command: " + command);
            }
        }

        // Print the final position of the rover
        System.out.println("Final position of the rover:");
        rover.displayPosition();

        scanner.close();
    }
}
