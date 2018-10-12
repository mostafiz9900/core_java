package beSkilled;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator_766 {

    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("New Yoek");
        c1.add("Altanta");
        c1.add("Dallas");
        c1.add("Madison");

        Iterator<String> iterator = c1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        System.out.println();

    }
}
