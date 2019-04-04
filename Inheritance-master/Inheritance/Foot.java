
/**
 * Write a description of class Foot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Foot extends Body
{
    public Foot(String name, String type, int health){
        super(name, type, health);
    }

    public int attack(){
        System.out.print("You kicked for " + health + " but took ");
        return health/5;
    }
}
