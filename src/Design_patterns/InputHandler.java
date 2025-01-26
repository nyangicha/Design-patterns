package Design_patterns;

public class InputHandler {
    private Command moveCommand;
    private Command attackCommand;

    public InputHandler(Command moveCommand, Command attackCommand) {
        this.moveCommand = moveCommand;
        this.attackCommand = attackCommand;
    }

    public void pressMove() {
        moveCommand.execute();
    }

    public void pressAttack() {
        attackCommand.execute();
    }
}
