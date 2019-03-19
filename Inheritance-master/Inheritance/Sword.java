
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sword extends Weapon
{
    protected int damage;
    public Sword(String name, String type){
        super(name, type);
        this.name = "Sword";
        this.type = "Weapon";
        damage = 25;
    }

    public Sword(){
        this("Sword", "Weapon");
    }

    @ Override
    public void attack(){
        System.out.println("You attack blank with " + name + " for " + damage + " damage.");
    }
}
