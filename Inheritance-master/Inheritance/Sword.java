public abstract class Sword extends Weapon {
    public Sword(String name, String type, int health) {
        super(name, type, health);
    }

    public int sharpen(){
        System.out.print("You sharpened your " + name + " for more damage");
        return health;
    }
}