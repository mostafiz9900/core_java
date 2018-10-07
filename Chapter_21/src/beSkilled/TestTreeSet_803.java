package beSkilled;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet_803 {

    public static void main(String[] args) {
        Set<String> set2 = new HashSet<>();
        set2.add("London");
        set2.add("New York");
        set2.add("Bangladesh");
        set2.add("Paris");
        set2.add("New York");
        System.out.println(set2);

        TreeSet<String> treeSet = new TreeSet<>(set2);
        System.out.println("Sorted tree set : " + treeSet);
        // use the methods in sortedset interface
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());

        System.out.println("headSet(\"New York\"): " + treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York\"): " + treeSet.tailSet("New York"));

        System.out.println("Lower(\"p\"):" + treeSet.lower("P"));
        System.out.println("high(\"p\"):" + treeSet.higher("P"));
        System.out.println("floor(\"p\"):" + treeSet.floor("P"));
        System.out.println("ceiling(\"p\"):" + treeSet.ceiling("B"));
        System.out.println("pollFirst(\"p\"):" + treeSet.pollFirst());
        System.out.println("pollLast(\"p\"):" + treeSet.pollLast());

        System.out.println("New tree set : " + treeSet);
    }
}
