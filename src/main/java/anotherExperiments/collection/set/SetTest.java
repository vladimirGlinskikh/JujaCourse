package anotherExperiments.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        // беспорядочный
        Set<String> hashSet = new HashSet<>();
        // отсортирован как ввели так и получили
        Set<String> linkedList = new LinkedHashSet<>();
        // лексикографическая сортировка
        Set<String> treeSet = new TreeSet<>();

        testSet(hashSet);
        System.out.println("-----------------------------");
        testSet(linkedList);
        System.out.println("--------------------------------");
        testSet(treeSet);
    }

    public static void testSet(Set<String> set) {
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("six");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
