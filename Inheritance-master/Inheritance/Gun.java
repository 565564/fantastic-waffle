public abstract class Gun extends Weapon {
    public Gun(String name, String type, int health) {
        super(name, type, health);
    }

    public int shoot(){
        System.out.print("You shot someone!");
        return health;
    }
}