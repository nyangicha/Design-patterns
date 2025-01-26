package Design_patterns;

public class MeleeAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Performing a melee attack!");
    }
}
