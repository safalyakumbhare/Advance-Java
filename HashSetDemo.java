import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate element, won't be added

        // Displaying the elements of the HashSet
        System.out.println("HashSet elements: " + hashSet);
        // Removing an element from the HashSet
        hashSet.remove("Orange");

        // Displaying the elements of the HashSet after removal
        System.out.println("HashSet elements after removing 'Orange': " + hashSet);

        // Size of the HashSet
        System.out.println("Size of the HashSet: " + hashSet.size());
    }
}