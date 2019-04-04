
/**
 * Write a description of class Head here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class Head extends Body
{
    public Head(String name, String type, int health){
        super(name, type, health);
    }
    public int attack(){
        System.out.print("You punched with " + name + " for " + health + " but took ");
        return health/3;
    }
}
