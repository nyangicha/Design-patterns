package Design_patterns;

public class WeaponFactory {
    public static Weapon createWeapon(String type) {
        return switch (type.toLowerCase()) {
            case "sword" -> new Sword();
            case "bow" -> new Bow();
            default -> throw new IllegalArgumentException("Unknown weapon type: " + type);
        };
    }
}
