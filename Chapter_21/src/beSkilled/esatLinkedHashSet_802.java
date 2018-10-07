package beSkilled;

import java.util.LinkedHashSet;
import java.util.Set;

public class esatLinkedHashSet_802 {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("London");
        set.add("New York");
        set.add("Bangladesh");
        set.add("Paris");
        set.add("New York");
        System.out.println(set);
        for (String i : set) {
            System.out.print(i.toUpperCase() + " ");

        }

    }
}
