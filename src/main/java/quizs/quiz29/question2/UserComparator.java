package quizs.quiz29.question2;

import quizs.quiz28.treeMap.question8.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User userA, User userB) {
        return userB.age - userA.age;
    }
}

