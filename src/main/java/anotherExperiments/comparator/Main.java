package anotherExperiments.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("bird");
        list.add("fish");
        list.add("animals");

        Collections.sort(list);
        System.out.println(list);
    }
}
