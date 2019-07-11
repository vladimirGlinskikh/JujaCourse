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
        list.add("an");

        Collections.sort(list, new StringLengthComparator());
        System.out.println(list);

//        List<Integer> numbers = new ArrayList<>();
//
//        numbers.add(1);
//        numbers.add(4);
//        numbers.add(3);
//        numbers.add(9);
//        numbers.add(2);
//
//        Collections.sort(numbers);
//        System.out.println(numbers);
    }
}
