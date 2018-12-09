package quizs.quiz29.question1;

import quizs.quiz28.treeMap.question8.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    public int compare(User userA, User userB){
        return userA.age - userB.age;
    }
}
