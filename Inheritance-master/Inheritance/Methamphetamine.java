public final class Methamphetamine extends Drugs{
    public Methamphetamine(String name, String type, int health){
        super(name, type, health);
        this.name = "Methamphetamine";
        this.health = 100;
    }

    public Methamphetamine(){
        super("Methamphetamine", "Consumable", -100);
    }

    public String took(){
        System.out.println("\u001B31;1mjoe");
        return "You took " + name + "but took " + health  + " health";
    }
}