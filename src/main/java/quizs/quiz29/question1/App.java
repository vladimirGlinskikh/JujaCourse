package quizs.quiz29.question1;

import quizs.quiz28.treeMap.question8.User;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>(new UserComparator());
        users.add(new User(10, "Mike"));
        users.add(new User(99, "Mike"));
        users.add(new User(99, "Sara"));
        users.add(new User(99, "Sara"));
        users.add(new User(99, "Anna"));
        System.out.println(users.size());
        //2
    }
}
