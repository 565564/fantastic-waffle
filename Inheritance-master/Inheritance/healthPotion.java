
/**
 * Write a description of class healthPotion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class healthPotion extends Potion
{
    public healthPotion(String name, String type, int health){
        super(name, type, health);
    }

    public healthPotion(){
        super("Health Potion", "Consumable", 10);
    }
}
