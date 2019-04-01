public abstract class Sword extends Weapon {
    public Sword(String name, String type, int health) {
        super(name, type, health);
    }

    public String look() {
        return "You looked at your " + name + "!";
    }

    public int sharpen(){
        System.out.print("You sharpened your " + name + " for more damage");
        return health;
    }
}