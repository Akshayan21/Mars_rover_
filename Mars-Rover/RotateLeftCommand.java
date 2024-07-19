/**
 * Command implementation for rotating a Mars Rover to the left.
 */
public class RotateLeftCommand implements Command {
    private MarsRover rover;

    /**
     * Constructs a new RotateLeftCommand with the specified MarsRover instance.
     * @param rover The MarsRover to be rotated to the left by this command.
     */
    public RotateLeftCommand(MarsRover rover) {
        this.rover = rover;
    }

    /**
     * Executes the rotate-left command, causing the associated MarsRover to rotate left.
     */
    @Override
    public void execute() {
        rover.rotate('L');
    }
}
