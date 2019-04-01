public final class Excalibur extends Sword {
    public Excalibur(String name, String type, int health) {
        super(name, type, health);
        this.name = "Excalibur";
        this.health = 75;
    }

    public Excalibur(){
        this("Excalibur", "Weapon", 75);
    }

    public String pickExc(){
        return "You tried to pick up the Excalibur you are too weak!";
    }
}