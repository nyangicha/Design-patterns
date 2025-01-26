package Design_patterns;

public class AttackCommand implements Command{
    private Player player;

    public AttackCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        System.out.println(player.getName() + " performs an attack.");
    }
}
