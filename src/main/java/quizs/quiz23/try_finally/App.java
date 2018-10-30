package quizs.quiz23.try_finally;

public class App {
    public static void main(String[] args) {
        System.err.println(f());// first step
    }

    public static int f() {
        try {
            System.err.println(0);// two step
            throw new Error();// three step
        } finally {
            System.err.println(1);// four step
            throw new RuntimeException();// five step and finish
        }
    }
}
