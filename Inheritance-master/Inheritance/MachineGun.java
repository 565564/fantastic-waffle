
/**
 * Write a description of class MachineGun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MachineGun extends Gun
{
    public MachineGun(String name, String type, int health){
        super(name, type, health);
        this.name = name;
        this.type = type;
        this.health = health;
    }
}
