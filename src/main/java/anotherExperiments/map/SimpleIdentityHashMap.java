package anotherExperiments.map;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleIdentityHashMap {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(new Integer(1), "one");
        identityHashMap.put(new Integer(34), "two");
        identityHashMap.put(new Integer(19), "one");
        identityHashMap.put(new Integer(23), "four");
        identityHashMap.put(new Integer(56), "five");

        Set set = identityHashMap.entrySet();
        for (Object o : set) {
            Map.Entry<Integer, String> map = (Map.Entry<Integer, String>) o;
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
