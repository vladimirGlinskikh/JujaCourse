package quizs.quiz29.treeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
//        NavigableSet<String> set = new TreeSet<>();
//        set.add("A");
//        set.add("AB");
//        set.add("B");
//        set.add("A");
//        set.add("BA");
//        set.add("B");
//
//        System.out.println(set.iterator().next());
//        //A

//        NavigableSet<String> set = new TreeSet<>();
//        set.add("A");
//        set.add("AB");
//        set.add("B");
//        set.add("A");
//        set.add("BA");
//        set.add("B");
//        System.out.println(set.descendingIterator().next());
//        //BA

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.ceiling("BB"));
        //null*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.ceiling("B"));
        //B*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.ceiling(" A"));
        //A*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.floor("BB"));
        //BA*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.floor("B"));
        //B*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.floor(" A"));
        //null*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.lower("BB"));
        //BA*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.lower("B"));
        //AB*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.lower("A"));
        //null*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.higher("AA"));
        //AB*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.higher("B"));
        //BA*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.higher("BA"));
        //null*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.tailSet("AB", true).size());
        //3*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.tailSet("AB", false).size());
        //2*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.headSet("ABC", true).size());
        //2*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.headSet("ABC", false).size());
        //2*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.subSet("AB", true, "BCA", true).size());
        //3*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.subSet("AB", true, "BCA", false).size());
        //3*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.subSet("AB", false, "BCA", true).size());
        //2*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.subSet("AB", false, "BCA", false).size());
        //2*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.first());
        //A*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.last());
        //BA*/

        /*NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.pollFirst());
        //A*/

        NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");
        System.out.println(set.pollLast());
        //BA
    }
}
