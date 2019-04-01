import java.util.*;
public abstract class Character implements CharacterInterface
{
    protected String name;
    protected int HP;
    public Character(String name, int HP){
        this.name = name;
        this.HP = HP;
    }

    public String getName(){
        return name;
    }

    public int getHP(){
        return HP;
    }
}