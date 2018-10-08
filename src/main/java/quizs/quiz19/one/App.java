package quizs.quiz19.one;

public class App {
    public static void main(String[] args) {
        int x = 10;
        int[] arr = {20};
        f(x, arr);
        System.out.print(" " + x + " " + arr[0]);
        g(x, arr);
        System.out.print(" " + x + " " + arr[0]);
    }

    private static void f(int x, int[] arr) {
        x += 30;
        arr[0] = 40;
    }

    public static void g(int x, int[] arr) {
        x = 50;
        arr = new int[]{60};
    }
}
