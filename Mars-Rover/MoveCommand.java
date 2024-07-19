/**
 * Command implementation for moving a Mars Rover.
 */
public class MoveCommand implements Command {
    private MarsRover rover;

    /**
     * Constructs a new MoveCommand with the specified MarsRover instance.
     * 
     * @param rover The MarsRover to be moved by this command.
     */
    public MoveCommand(MarsRover rover) {
        this.rover = rover;
    }

    /**
     * Executes the move command, causing the associated MarsRover to move.
     */
    @Override
    public void execute() {
        rover.move();
    }
}
