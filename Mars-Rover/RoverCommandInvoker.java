/**
 * Invoker class responsible for executing a command on a Mars Rover.
 */
public class RoverCommandInvoker {
    private Command command;

    /**
     * Sets the command to be executed by this invoker.
     * @param command The command to be executed.
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * Executes the set command on the associated Mars Rover.
     */
    public void executeCommand() {
        command.execute();
    }
}
