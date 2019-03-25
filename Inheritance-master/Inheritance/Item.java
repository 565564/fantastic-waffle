import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    //Implemented in your own way
    protected String name;
    protected String type;
    public Item(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String info(){
        System.out.println("Name: " + name + "\nType: " + type);
        return null;
    }
}