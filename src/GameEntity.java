public class GameEntity {
    private int health;

    public int getDamage() {
        return damage;
    }

    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private int damage;
}
