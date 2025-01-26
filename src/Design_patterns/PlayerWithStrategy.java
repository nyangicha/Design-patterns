package Design_patterns;

public class PlayerWithStrategy {
    private String name;
    private AttackStrategy attackStrategy;

    public PlayerWithStrategy(String name, AttackStrategy attackStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        System.out.println(name + " is attacking!");
        attackStrategy.attack();
    }
}
