package Design_patterns;

public class Player {
    private String name;
    private PlayerState currentState;

    public Player(String name) {
        this.name = name;
        this.currentState = new IdleState(); // Default state.
    }

    public String getName() {
        return name;
    }

    public void setState(PlayerState state) {
        this.currentState = state;
    }

    public void performAction() {
        currentState.performAction(this);
    }
}
