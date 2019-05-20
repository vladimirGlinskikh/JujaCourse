package anotherExperiments.map;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class SimpleEnumMap {
    public static void main(String[] args) {
        Map<Animal, String> enumMap = new EnumMap<>(Animal.class);
        enumMap.put(Animal.Cat, "black");
        enumMap.put(Animal.Dog, "spaniel");
        enumMap.put(Animal.Bird, "parrot");

        Set set = enumMap.entrySet();
        for (Object o : set) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

enum Animal {
    Cat, Dog, Bird
}
