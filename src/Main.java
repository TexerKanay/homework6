public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Boss boss = new Boss(600, 60, new Weapon("magical", WeaponType.BULLET_WEAPON));

        boss.printInfo();
        Skeleton skeleton = new Skeleton(200,15, new Weapon("Bow", WeaponType.COLD_WEAPON));
        skeleton.setArrows(15);

        Skeleton skeleton2 = new Skeleton(240,20, new Weapon("Bow", WeaponType.COLD_WEAPON));
        skeleton2.setArrows(20);

        skeleton.printInfo();
        skeleton2.printInfo();



    }


}