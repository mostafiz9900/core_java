package beSkilled;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("London ");
        set.add("Bangladesh ");
        set.add("London ");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s.toUpperCase());

        }

    }

}
