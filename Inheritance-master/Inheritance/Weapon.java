
/**
 * Abstract class Weapon - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Weapon extends Item
{
    protected int damage;
    public Weapon(int damage){
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }
    public void attack(){
        System.out.println("You attack blank for" + damage + "damage");
    }
}
