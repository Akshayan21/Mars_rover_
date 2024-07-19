/**
 * Command implementation for rotating a Mars Rover to the right.
 */
public class RotateRightCommand implements Command {
    private MarsRover rover;

    /**
     * Constructs a new RotateRightCommand with the specified MarsRover instance.
     * @param rover The MarsRover to be rotated to the right by this command.
     */
    public RotateRightCommand(MarsRover rover) {
        this.rover = rover;
    }

    /**
     * Executes the rotate-right command, causing the associated MarsRover to rotate right.
     */
    @Override
    public void execute() {
        rover.rotate('R');
    }
}
