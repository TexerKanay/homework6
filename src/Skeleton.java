public class Skeleton extends Boss {

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    private int arrows;

    public Skeleton(int health, int damage, Weapon weapon) {
        super(health, damage, weapon);
    }

    @Override
    public void printInfo() {
        System.out.println("Health: " + getHealth() + " Damage: " + getDamage() + " WeaponType: " + getWeapon().getWeaponType() + " Weapon: " + getWeapon().getName() + " Arrows: " + arrows);

    }
}
