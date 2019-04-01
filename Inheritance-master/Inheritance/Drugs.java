public abstract class Drugs extends Consumables {
    public Drugs(String name, String type, int health) {
        super(name, type, health);
    }

    public int consume(){
        System.out.print("You took " + name + " for ");
        return health;
    }
}