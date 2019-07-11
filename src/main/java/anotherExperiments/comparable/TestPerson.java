package anotherExperiments.comparable;

import java.util.*;

public class TestPerson {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();

        addElements(peopleList);
        addElements(personSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(personSet);
    }

    private static void addElements(Collection collection) {
        collection.add(new Person(1, "Vladimir"));
        collection.add(new Person(3, "Vlad"));
        collection.add(new Person(2, "Gen"));

    }
}
