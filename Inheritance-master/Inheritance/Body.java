
/**
 * Abstract class Body - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Body extends Weapon
{
    int self_damage = 2;
    public Body(String name, String type, int health){
        super(name, type, health);
    }

    public int attack(){
        System.out.print("You attacked " + name + " for " + health + " but took ");
        return self_damage;
    }
}
