package anotherExperiments.collection.JDK10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JDK10CollectionFunctions {
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>();
        actors.add("Jack Nicholson");
        actors.add("Bruce Lee");
        System.out.println(actors);

        List<String> copyOfActors = List.copyOf(actors);
        System.out.println(copyOfActors);

        actors.add("Robert De Niro");
        System.out.println(actors);
        System.out.println(copyOfActors);

        List<String> collect = actors.stream()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(collect);
    }
}
