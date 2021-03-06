import java.util.ArrayList;
import java.util.Arrays;

public class Backpack implements BackpackInterface{
    // instance variables - replace the example below with your own
    private ArrayList<Item> backpack;

    /**
     * Constructor for objects of class Backpack
     */
    public Backpack() {
        // initialise instance variables
        backpack = new ArrayList<>();
    }

    /**
     * Adds an item to the backpack
     *
     * @param item The item of which to add
     * @return true if added
     */
    public void storeItem(Item item) {
        backpack.add(item);
        //System.out.println(Character.getName() + " picked up " + item.getName() + ".");
        item.info();
    }

    /**
     * Consumes an item in the backpack, removing it.
     *
     * @param item The item of which to delete
     * @return true if deleted
     */
    public boolean useItem(Item item) {
        for (int i = 0; i < backpack.size(); i++) {
            if (backpack.get(i).equals(item) && item.getType().equals("Consumable")) {
                backpack.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the contents of the backpack
     *
     * @return An arraylist of Items in the backpack.
     */
    public ArrayList<Item> getInventory() {
        return backpack;
    }

    public int countItems() {
        int count = 0;
        for (Item item : backpack) {
            count++;
        }
        return count;
    }
}