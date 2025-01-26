package Design_patterns;

public class DesignPatterns {
    public static void main(String[] args) {
        // Singleton Pattern
        GameManager gameManager = GameManager.getInstance();
        gameManager.startGame();

        // State Pattern
        Player player = new Player("Hero");
        player.performAction();
        player.setState(new RunningState());
        player.performAction();
        player.setState(new AttackingState());
        player.performAction();

        // Factory Pattern
        Weapon sword = WeaponFactory.createWeapon("sword");
        sword.use();
        Weapon bow = WeaponFactory.createWeapon("bow");
        bow.use();

        // Strategy Pattern
        PlayerWithStrategy strategicPlayer = new PlayerWithStrategy("Archer", new RangedAttack());
        strategicPlayer.performAttack();
        strategicPlayer.setAttackStrategy(new MeleeAttack());
        strategicPlayer.performAttack();

        // Command Pattern
        Command moveCommand = new MoveCommand(player);
        Command attackCommand = new AttackCommand(player);
        InputHandler inputHandler = new InputHandler(moveCommand, attackCommand);
        inputHandler.pressMove();
        inputHandler.pressAttack();
    }
}
