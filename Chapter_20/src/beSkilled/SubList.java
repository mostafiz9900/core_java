package beSkilled;

import java.util.ArrayList;
import java.util.List;

public class SubList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mhabub");
        list.add("Sofiqul");
        list.add("Rojina");
        list.add("Mortuja");
        list.add("Mostafizur");
        list.add("Mrhedi");
        list.add("Abbas");
        System.out.println(list);
        List<String> sublist = new ArrayList<>();
        sublist = list.subList(2, 6);
        System.out.println(sublist);

    }
}
