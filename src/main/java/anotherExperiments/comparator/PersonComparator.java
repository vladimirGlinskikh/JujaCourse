package anotherExperiments.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparator {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person(5, "Vladimir"));
        people.add(new Person(3, "Vasiliy"));
        people.add(new Person(2, "Sveta"));
        people.add(new Person(4, "Oly"));
        people.add(new Person(1, "Olesy"));

        Collections.sort(people, (o1, o2) -> {
            if (o1.getId() > o2.getId()) {
                return 1;
            } else if (o1.getId() < o2.getId()) {
                return -1;
            } else {
                return 0;
            }
        });

        System.out.println(people);
    }
}
