package anotherExperiments.equalsAndHashCode;

import java.util.HashMap;
import java.util.Map;

public class HashingTest {
    public static void main(String[] args) {
        Map<DataKey, Integer> hm = getAllData();

        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Vladimir Glinskikh");
        System.out.println(dk.hashCode());

        Integer value = hm.get(dk);
        System.out.println(value);
    }

    private static Map<DataKey, Integer> getAllData() {
        Map<DataKey, Integer> hm = new HashMap<>();

        DataKey dataKey = new DataKey();
        dataKey.setId(1);
        dataKey.setName("Vladimir Glinskikh");
        System.out.println(dataKey.hashCode());

        hm.put(dataKey, 10);
        return hm;
    }
}
