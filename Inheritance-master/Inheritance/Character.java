import java.util.*;
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public abstract class Character implements CharacterInterface
{
    public void name(){
        Scanner scanner = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a name for the character: ");
        String name = scanner.next(); // Scans the next token of the input as an int.
    }
}
