package quizs.quiz12;

public class AppOne {
    public static void main(String[] args) {
        func((ChildA)(Object) new ChildB());
    }

    private static void func(ChildA ref) {
    }
}
