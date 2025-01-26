package Design_patterns;

// Singleton Pattern: GameManager ensures a single instance for game control.
public class GameManager {
    private static GameManager instance;

    private GameManager() {
        // Private constructor to prevent instantiation.
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void startGame() {
        System.out.println("Game started!");
    }
}
