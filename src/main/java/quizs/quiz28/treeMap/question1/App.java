package quizs.quiz28.treeMap.question1;

import java.util.NavigableSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        NavigableSet<User> users = new TreeSet<>();
        users.add(new User(25, "Mike"));
        users.add(new User(27, "Sara"));
        users.add(new User(26, "Sara"));
        System.out.println(users.iterator().next());
    }
}
