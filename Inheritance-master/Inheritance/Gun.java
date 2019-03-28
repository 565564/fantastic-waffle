public abstract class Gun extends Weapon
{
    public Gun(String name, String type){
        super("Gun", type);
        this.name = "Gun";
        damage = 100;
    }
}
