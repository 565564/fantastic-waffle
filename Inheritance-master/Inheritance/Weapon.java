public abstract class Weapon extends Item implements WeaponInterface
{
    protected int health;
    protected boolean parry;
    public Weapon(String name, String type, int health){
        super(name, type, health);
    }

    public int attack(){
        System.out.print("You attack blank with " + name + " for ");
        return health;
    }

    public boolean parry(){
        return parry;
    }

    public String info(){
        return("Name: " + name + "\nType: " + type + "\nDamage: " + health);
    }
}