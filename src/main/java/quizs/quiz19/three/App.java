package quizs.quiz19.three;

public class App {
    public static void main(String[] args) {
        int x = 10;
        int[] arr = {20};
        x = f(x, g(x, arr));
        System.out.println(x + " " + arr[0]);
    }

    public static int f(int x, int[] arr) {
        x += 30;
        arr[0] = 40;
        return 50;
    }

    public static int[] g(int x, int[] arr) {
        x = 60;
        arr = new int[]{70};
        return arr;
    }
}
