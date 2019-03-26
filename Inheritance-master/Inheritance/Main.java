import java.util.Scanner;

public abstract class Main implements CharacterInterface{
    public void main(String[] args) {
        boolean game = true;
        while (game) {
            Character.getName();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            //if (input.equals("attack")){

            //}
            game = false;
        }
    }
}