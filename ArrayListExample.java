import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Declare an ArrayList of Strings
        ArrayList<String> myArrayList = new ArrayList<>();

        // Add elements to the ArrayList
        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Orange");

        // Access elements of the ArrayList
        System.out.println("First element: " + myArrayList.get(0));
        System.out.println("Second element: " + myArrayList.get(1));
        System.out.println("Third element: " + myArrayList.get(2));

        // Iterate over the ArrayList
        System.out.print("Elements in the ArrayList: ");
        for (String item : myArrayList) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
