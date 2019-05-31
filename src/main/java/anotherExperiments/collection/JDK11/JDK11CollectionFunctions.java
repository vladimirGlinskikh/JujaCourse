package anotherExperiments.collection.JDK11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JDK11CollectionFunctions {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("RubyOnRails");

        String[] strArray = list.toArray(size -> new String[size]);
        System.out.println(Arrays.toString(strArray));

        strArray = list.toArray(size -> new String[size + 7]);
        System.out.println(Arrays.toString(strArray));

        strArray = list.toArray(size -> new String[size * 5]);
        System.out.println(Arrays.toString(strArray));

        strArray = list.toArray(size -> new String[size / 3]);
        System.out.println(Arrays.toString(strArray));
    }
}
