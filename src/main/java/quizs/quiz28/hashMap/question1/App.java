package quizs.quiz28.hashMap.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        /*Map<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("B", map.put("A", 0));
        map.put("C", map.put("B", 1));
        System.out.println(map.keySet().size());
        //3*/

        /*Map<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("B", map.put("A", 0));
        map.put("C", map.put("B", 1));
        System.out.println(new HashSet<>(map.values()).size());
        //2*/

        /*Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", map.get("A"));
        map.put("A", map.get("B"));
        System.out.println(map.keySet().size());
        //2*/

        /*Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", map.get("A"));
        map.put("A", map.get("B"));
        System.out.println(new HashSet<>(map.values()).size());
        //1*/

        /*Map<String, Boolean> map = new HashMap<>();
        map.put("A", map.containsValue(true));
        map.put("B", map.containsValue(false));
        map.put("A", map.containsValue(true));
        System.out.println(map.keySet().size());
        //2*/

        /*Map<String, Boolean> map = new HashMap<>();
        map.put("A", map.containsValue(true));
        map.put("B", map.containsValue(false));
        map.put("A", map.containsValue(true));
        System.out.println(new HashSet<>(map.values()).size());
        //1*/

        /*Map<String, Boolean> map = new HashMap<>();
        map.put("A", map.containsValue(true));
        map.put("B", map.containsValue(true));
        map.put("A", map.containsValue(false));
        System.out.println(new HashSet<>(map.values()).size());
        //2*/

        /*Map<String, Boolean> map = new HashMap<>();
        map.put("A", map.entrySet().iterator().hasNext());
        map.put("", map.entrySet().iterator().hasNext());
        map.put("" + map.containsValue(false), map.values().size() == 1);
        System.out.println(map.containsKey("" + map.entrySet().iterator().hasNext()));
        //true*/

        /*Map<String, Boolean> map = new HashMap<>();
        map.put("A", map.entrySet().iterator().hasNext());
        map.put("", map.entrySet().iterator().hasNext());
        map.put("" + map.containsValue(false), map.values().size() == 1);
        System.out.println(new HashSet<>(map.values()).size());
        //2*/

        /*Map<Integer, Integer> map = new HashMap<>();
        map.put(map.size(), map.size());
        map.put(map.size(), map.size());
        map.put(map.size(), map.size());
        System.out.println(map.entrySet().iterator().hasNext());
        //true*/

        /*Map<Integer, Integer> map = new HashMap<>();
        map.put(map.size(), map.size());
        map.put(map.size(), map.size());
        map.put(map.size(), map.size());
        System.out.println(new HashSet<>(map.values()).size());
        //3*/

        /*Map<Integer, Integer> map = new HashMap<>();
        map.put(map.size(), map.get(map.size()));
        map.put(map.size(), map.get(map.get(map.size())));
        System.out.println(map.entrySet().size());
        //2*/

        /*Map<Integer, Integer> map = new HashMap<>();
        map.put(map.size(), map.get(map.size()));
        map.put(map.size(), map.get(map.get(map.size())));
        System.out.println(map.entrySet().iterator().next().getValue());
        //null*/

        /*Map<Boolean, Integer> map = new HashMap<>();
        map.put(map.isEmpty(), map.get(map.containsKey(map.isEmpty())));
        map.put(map.isEmpty(), map.get(map.containsKey(map.isEmpty())));
        map.put(map.isEmpty(), map.get(map.containsKey(map.isEmpty())));
        System.out.println(map.entrySet().size());
        //2*/

        /*Map<Boolean, Integer> map = new HashMap<>();
        map.put(map.isEmpty(), map.get(map.containsKey(map.isEmpty())));
        map.put(map.isEmpty(), map.get(map.containsKey(map.isEmpty())));
        map.put(map.isEmpty(), map.get(map.containsKey(map.isEmpty())));
        System.out.println(map.entrySet().iterator().next().getValue());
        //null*/

        /*Map<String, String> map = new HashMap<>();
        map.put("" + map.isEmpty(), "" + map.get("true"));
        map.put("" + map.isEmpty(), "" + map.containsKey("true"));
        System.out.println(new HashSet<>(map.values()).size());
        //2*/

        /*Map<String, String> map = new HashMap<>();
        map.put("" + map.isEmpty(), "" + map.get("true"));
        map.put("" + map.isEmpty(), "" + map.containsKey("true"));
        System.out.println(map.get("" + map.containsKey("" + null)));
        //true*/

        /*Map<String, String> map = new HashMap<>();
        map.put("A", "A");
        map.putAll(map);
        map.put("" + map.entrySet().toString(), "A");
        map.put("A", "" + map.entrySet().toString());
        System.out.println(map.containsKey("" + map.entrySet().toString()));
        //false*/

        /*Map<String, String> mapA = new HashMap<>();
        mapA.put("A", "A");
        Map<String, String> mapB = new HashMap<>();
        mapB.put("B", "B");
        mapA.putAll(mapB);
        mapB.put("C", "C");
        mapB.putAll(mapA);
        System.out.println(mapA.size() + mapB.size());
        //5*/
    }
}
