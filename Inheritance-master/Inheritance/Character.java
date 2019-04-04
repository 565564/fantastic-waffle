public abstract class Character
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

    public String info(){
        return "Name: " + name + "\nHP" + HP;
    }
}