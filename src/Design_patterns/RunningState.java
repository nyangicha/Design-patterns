package Design_patterns;

public class RunningState implements PlayerState{
    @Override
    public void performAction(Player player) {
        System.out.println(player.getName() + " is running.");
    }
}
