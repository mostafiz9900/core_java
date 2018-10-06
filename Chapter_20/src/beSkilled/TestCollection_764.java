package beSkilled;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection_764 {

    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");
        System.out.println("A list of citics in collection1");
        System.out.println(collection1);

        System.out.println("\nIs Dallas in collectin1 ? " + collection1.contains("Dallas"));
        collection1.remove("Dalls");
        System.out.println("\n" + collection1.size() + "citises  are i collection1 now");
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("\nA list of cities in collection2");;
        System.out.println(collection2);

    }

}
