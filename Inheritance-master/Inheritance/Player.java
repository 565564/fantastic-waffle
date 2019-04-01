import java.util.Scanner;

public final class Player extends Character {

    public Player(String name, int HP) {
        super(name, HP);
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a name: ");
        name = reader.next();
        this.name = name;
        this.HP = 100;
    }

    public Player() {
        this("Player", 100);
    }
}