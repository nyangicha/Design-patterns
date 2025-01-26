package Design_patterns;

public class MoveCommand implements Command{
    private Player player;

    public MoveCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        System.out.println(player.getName() + " moves forward.");
    }
}
