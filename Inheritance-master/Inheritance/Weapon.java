import java.util.*;
import java.lang.*;
public abstract class Weapon extends Item
{
    protected int damage;
    protected boolean parry;
    public Weapon(String name, String type){
        super(name, type);
        this.type = "Weapon";
    }

    public int attack(){
        System.out.println("You attack blank with " + name + " for " + damage);
        return damage;
    }

    public boolean parry(){
        return parry;
    }
}