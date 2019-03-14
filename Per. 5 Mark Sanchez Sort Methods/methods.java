import java.util.Scanner;

public class methods {
    private void bubble(int[] num) {
        for(int i = 0; i < num.length; i++){
            for(int j = 1; j < (num.length-i); j++){
                if(num[j-1] > num[j]){
                    int middleMan = num[j-1];
                    num[j-1] = num[j];
                    num[j] = middleMan;
                }
            }
        }
    }

    private void selection(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[index]) {
                    index = j;
                }
            }
            int smallerNum = num[index];
            num[index] = num[i];
            num[i] = smallerNum;
        }
    }

    private void insertion(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int middleMan = num[i];
            int j = i-1;
            while ((j > -1) && ( num [j] > middleMan)) {
                num [j+1] = num [j];
                j--;
            }
            num[j+1] = middleMan;
        }
    }

    public void main(String[] args) {
        int[] num = new int[10]; //Creates the array
        for (int i = 0; i < 10; i++) {
            int rand = (int) Math.round(Math.random() * 99 +1);
            num[i] = rand;
        }
        Scanner reader = new Scanner(System.in);
        System.out.println("ENTER YOUR SORT\n" + // Where you choose your selection
            "1. BUBBLE\n" +
            "2. SELECTION\n" +
            "3. INSERTION");
        String n = reader.next();
        System.out.println("BEFORE");
        for (int i1 : num) {
            System.out.print(i1 + " ");
        }
        System.out.println();
        if (n.equals("1")){
            bubble(num);
        }
        else if (n.equals("2")){
            selection(num);
        }
        else if (n.equals("3")){
            insertion(num);
        }
        System.out.println("AFTER");
        for (int i1 : num) {
            System.out.print(i1 + " ");
        }
        System.out.println();
    }
}