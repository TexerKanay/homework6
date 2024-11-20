public class Boss extends GameEntity {
    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private Weapon weapon;

    public void printInfo() {
        System.out.println("Health: " + getHealth() + " Damage: " + getDamage() + " WeaponType: " + getWeapon().getWeaponType() + " Weapon: " + getWeapon().getName());
    }
}
