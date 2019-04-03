public abstract class Consumables extends Item
{
    public Consumables(String name, String type, int health){
        super(name, type, health);
        this.type = "Consumable";
    }

    public int consume(){
        System.out.print("You consumed " + name + " for ");
        return health;
    }
}