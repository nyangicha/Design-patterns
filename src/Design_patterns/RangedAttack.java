package Design_patterns;

public class RangedAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Performing a ranged attack!");
    }
}
