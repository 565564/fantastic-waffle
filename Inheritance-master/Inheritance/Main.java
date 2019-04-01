import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Backpack backpack = new Backpack();
        Excalibur excalibur = new Excalibur();
        boolean game = true;
        System.out.println("Hello " + player.getName() + ", type in HELP to get information on how to play.");
        backpack.storeItem(excalibur);
        Methamphetamine methamphetamine = new Methamphetamine();
        backpack.storeItem(methamphetamine);
        Apple apple = new Apple();
        backpack.storeItem(apple);
        excalibur.info();
        while (game) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (input.toLowerCase().equals("quit") || input.toLowerCase().equals("q")) {
                game = false;
            }
            switch (input.toLowerCase()) {
                case "attack":
                System.out.print(excalibur.attack());
                break;
                case "count":
                System.out.println(backpack.countItems());
                break;
                case "info":
                System.out.println(excalibur.info());
                break;
                case "inventory":
                System.out.println(backpack.getInventory());
                break;
                case "eat":
                System.out.println();
                break;
                case "use":
                System.out.println("Which item would you like to use?\n" + backpack.getInventory() + " ");
                //int intInput = scanner.nextInt();
                //while(!scanner.hasNextInt()) {
                //    scanner.nextInt();
                //    System.out.println("Please enter an integer");
                //}
                //backpack.useItem(intInput);
                break;
            }
        }
        System.out.println("Goodbye");
    }
}