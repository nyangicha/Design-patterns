package Design_patterns;

public class IdleState implements PlayerState{
    @Override
    public void performAction(Player player) {
        System.out.println(player.getName() + " is idling.");
    }
}
