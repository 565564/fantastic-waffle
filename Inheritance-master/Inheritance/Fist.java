
/**
 * Write a description of class Fist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class Fist extends Body
{
    public Fist(String name, String type, int health){
        super(name, type, health);
        this.name = "Fist";
        this.health = -10;
    }

    public Fist(){
        super("Fist", "Weapon", -10);
    }

    public int attack(){
        System.out.print("You punched for " + health + " but took ");
        return 2;
    }
}
