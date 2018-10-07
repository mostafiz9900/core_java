package beSkilled;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap_813 {

    public static void main(String[] args) {
        //Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 60);
        hashMap.put("Lewis", 50);
        hashMap.put("Cook", 20);
        System.out.println(hashMap + "\n");

        //Create a treemap from the jpreceding hashmap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap + "\n");

        //Create a LinkedHashMap
        Map<String, Integer> linkedHsdhMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHsdhMap.put("Smith", 30);
        linkedHsdhMap.put("Anderson", 60);
        linkedHsdhMap.put("Lewis", 50);
        linkedHsdhMap.put("Cook", 20);
       System.out.println("\nThe age for " + "Lewid\n is " + linkedHsdhMap.get("Lewis"));
        System.out.println(linkedHsdhMap);
    }
}
