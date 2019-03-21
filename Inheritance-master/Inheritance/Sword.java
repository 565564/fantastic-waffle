public class Sword extends Weapon
{
    protected int attack;
    public Sword(String name, String type){
        super(name, type);
        this.name = "Sword";
        attack = 25;
    }
}