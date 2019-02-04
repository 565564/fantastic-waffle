
/**
 * Write a description of class ArrayListPractice here.
 *
 * @author Mark Sanchez
 * @version 1..30.19
 */
import java.util.*;
public class colors{
    ArrayList<String> colors;
    ArrayList<String> colors2;
    public colors(){ // 1
        System.out.println("New arrayList");
        colors = new ArrayList<String>();
        colors2 = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors2.add("Green");
        colors2.add("Blue");
        colors2.add("Purple");
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
        System.out.println(colors.get(pos));
    }

    public void update(int pos, String newColor){ // 5
        colors.set(pos, newColor);
    }

    public void removeThird(){ // 6
        colors.remove(2);
    }

    public void find(String search){ // 7
        int pos = colors.indexOf(search);
        System.out.println(pos);
    }

    public void copyArrayList(){ // 9
        ArrayList<String> newColors = new ArrayList<String>(colors);
    }

    public void reverse(){ // 11
        Collections.reverse(colors);
        for (String str: colors){
            System.out.println(str);
        }
    }

    public void extract (int start, int end){ // 12
        ArrayList<String> extracted = new ArrayList<String>(colors.subList(start,end));
        System.out.println("Newly exctracted arrayList");
        for (String str: extracted){
            System.out.println(str);
        }
    }

    public void compare(){
        for (int i = 0; i < colors.size() || i < colors2.size(); i++){
            if (colors.get(i) == colors2.get(1)){
                System.out.println(colors.get(i));
            }
        }
    }

    public void swap(int first, int second){ // 14
        Collections.swap(colors, first, second);
    }

    public void merge(){ // 15
        ArrayList<String> copy = new ArrayList<String>(colors);
        colors.addAll(copy);
    }

    public void cloneArrayList(){ // 16
        ArrayList<String> newColors = new ArrayList<String>(colors);
    }

    public void empty(){ // 17
        for (int i = 0; i > colors.size(); i++){
            colors.remove(i);
        }
    }

    public void emptyTest(){ // 18
        if (colors.isEmpty()){
            System.out.println("Your arrayList is empty");
        } else{
            System.out.println("Your arrayList is not empty");
        }
    }

    public void increaseSize(int inc){ // 20
        for (int i = 0; i < inc; i++){
            colors.add("");
        }
        for (String str: colors){
            System.out.println(str);
        }
    }

    public void replaceSecond(String replacer){ // 21
        colors.set(1, replacer);
    }

}