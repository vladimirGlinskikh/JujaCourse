package quizs.quiz10.fibonacci;

public class AppTwo {
    public static void main(String[] args) {
        f(3);
    }

    private static int f(int n) {
        System.out.print(n);
        if (n == 0 || n == 1) {
            return n;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
