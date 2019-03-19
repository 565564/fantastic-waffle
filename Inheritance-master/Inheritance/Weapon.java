
/**
 * Abstract class Weapon - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Weapon extends Item
{
    protected int damage;
    public Weapon(String name, String type){
        super(name, type);
        this.type = "Weapon";
    }

    public void attack(){
        System.out.println("You attack blank for" + damage + "damage");
        this.damage = damage;
    }
}
