package quizs.quiz23.try_finally;

public class App16 {
    public static void main(String[] args) {
        System.err.println(f());// first step
    }

    public static int f() {// two step
        try {// three step
            throw new Error();// four step
        } finally {// five step
            throw new RuntimeException();// six step and finish
        }
    }
}
