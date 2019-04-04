
/**
 * Write a description of class AK_47 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class AK_47 extends MachineGun
{
    public AK_47(String name, String type, int health){
        super(name, type, health);
        this.name = "AK_47";
        this.health = -100;
    }

    public AK_47(){
        super("AK-47", "Weapon", -100);
    }
}
