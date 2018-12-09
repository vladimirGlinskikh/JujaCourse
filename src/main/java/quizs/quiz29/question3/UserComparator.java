package quizs.quiz29.question3;

import quizs.quiz28.treeMap.question8.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User userA, User userB) {
        return userA.name.compareTo(userB.name);
    }
}
