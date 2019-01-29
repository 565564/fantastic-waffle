
/**
 * Write a description of class ArrayListPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class colors
{
    ArrayList<String> colors;
    public colors(){ // 1
        colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        for (String str: colors){
            System.out.println(str);
        }
    }

    public void printColors(){ // 2
        for (String str: colors){
            System.out.println(str);
        }
    }

    public void add(String newColor){  // 3
        colors.add(0, newColor);
    }

    public void get(int pos){ // 4
        System.out.println (colors.get(pos));
    }

    public void replace(int pos, String newColor){ // 5
        colors.set(pos, newColor);
    }

    public void removeThird(){ // 6
        colors.remove(2);
    }

    public void find(String search){
        colors.indexOf(search);
    }

    public void copyArrayList(){ // 9
        ArrayList<String> newColors = new ArrayList<String>(colors);
    }

    public void extract (int start, int end){
        //colors.remove(start,end);
    }

}