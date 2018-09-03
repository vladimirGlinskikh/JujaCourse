package quizs.quiz10.recursion;

public class AppTwo {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int n) {
        if (n < 7) {
            System.out.print(n);
            f(2 * n);
        }
    }
}
