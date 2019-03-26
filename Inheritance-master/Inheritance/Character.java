import java.util.*;
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public abstract class Character implements CharacterInterface
{
    protected String name;
    public Character(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
