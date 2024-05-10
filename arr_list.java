
import java.util.*;

class arr_list
 {
    public static void main(String args[]) {
        ArrayList al = new ArrayList(); // creating array list
        al.add("Jack");
        al.add("Praju");
        al.add("Tyler");
        // adding elements
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
