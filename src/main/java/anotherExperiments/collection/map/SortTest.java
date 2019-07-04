package anotherExperiments.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortTest {
    public static void main(String[] args) {
        // не гарантируется никакого порядка
        Map<Integer, String> hashMap = new HashMap<>();

        // в каком порядке пары (ключ, значение) были добавлены, в таком они и вернуться
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // сортируются по ключу
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(hashMap);
        System.out.println("---------------------------------");
        testMap(linkedHashMap);
        System.out.println("-----------------------------------");
        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map) {
        map.put(23, "Vlad");
        map.put(232, "Gleb");
        map.put(22343, "Sveta");
        map.put(84, "Andry");
        map.put(24, "Voland");
        map.put(7, "Vladimir");
        map.put(1, "Maric");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
