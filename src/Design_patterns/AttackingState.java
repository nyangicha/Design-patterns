package Design_patterns;

public class AttackingState implements PlayerState{
    @Override
    public void performAction(Player player) {
        System.out.println(player.getName() + " is attacking!");
    }
}
