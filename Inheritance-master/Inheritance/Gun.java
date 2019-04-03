public abstract class Gun extends Weapon {
    public Gun(String name, String type, int health) {
        super(name, type, health);
    }
    int ammo;
    public int shoot(){
        System.out.print("You shot someone!");
        return health;
    }
}