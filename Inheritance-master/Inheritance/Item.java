
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    //Implemented in your own way
    protected String type;
    public Item(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
