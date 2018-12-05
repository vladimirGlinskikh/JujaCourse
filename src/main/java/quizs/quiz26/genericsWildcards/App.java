package quizs.quiz26.genericsWildcards;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<? extends Integer> list0 = null;
        List<? super Number> list1 = null;
        //list1 = list0;
        System.out.println(list0);
    }
}
