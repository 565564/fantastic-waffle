
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sword extends Weapon
{
    private int damage;
    final String name = "Sword";
    public Sword(String name, String type){
        super(name, type);
        this.type = "Weapon";
        damage = 25;
    }
}
