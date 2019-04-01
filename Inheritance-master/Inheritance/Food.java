public abstract class Food extends Consumables {
    public Food(String name, String type, int health) {
        super(name, type, health);
    }

    public int consume(){
        System.out.print("You ate " + name + " for ");
        return health;
    }
}