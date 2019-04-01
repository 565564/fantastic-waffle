public abstract class Item implements ItemInterface{
    //Implemented in your own way
    protected String name;
    protected String type;
    protected int health;
    public Item(String name, String type, int health){
        this.name = name;
        this.type = type;
        this.health = health;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String info(){
        return("Name: " + name + "\nType: " + type + "\nHealth: " + health);
    }
}