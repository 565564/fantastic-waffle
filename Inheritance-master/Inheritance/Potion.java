
/**
 * Write a description of class Potion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Potion extends Consumables
{
    public Potion(String name, String type, int health){
        super(name, type, health);
    }

    public int consume(){
        System.out.println("You drank your " + name + " for ");
        return health;
    }
}
