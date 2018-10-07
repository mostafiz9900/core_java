package beSkilled;

import java.util.HashSet;
import java.util.Set;

public class TestMethodsInCollection {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        //Add strings to set1
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing ");
        System.out.println("Set1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        //Delete a string from set1
        set1.remove("London");
        System.out.println("\nset1 id " + set1);
        System.out.println(set1.size() + " Elements in set1");

        //Create set2
        Set<String> set2 = new HashSet<>();

        //Add string to set2
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        System.out.println("Set2 is " + set2);
        System.out.println(set2.size() + " elements in set2");
        System.out.println("\nIs Taipei in seet2?" + set2.contains("Taipei"));

        set1.addAll(set2);
        System.out.println("After removing seet2 from set1 , set1 is" + set1);

        set1.removeAll(set2);
        System.out.println("After removing seet2 from set1 , set1 is" + set1);

        set1.retainAll(set2);
        System.out.println("Atter removing common clement s in set2 " + "from set1 , set1 is" + set1);

    }
}
