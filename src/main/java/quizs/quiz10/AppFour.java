package quizs.quiz10;

public class AppFour {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int n) {
        if (n < 7) {
            f(2 * n);
            System.out.print(n);
        }
    }
}
