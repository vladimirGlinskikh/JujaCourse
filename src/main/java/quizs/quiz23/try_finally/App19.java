package quizs.quiz23.try_finally;

public class App19 {
    public static void main(String[] args) {
        System.err.println(f());// first step
    }

    public static int f() {// two step
        try {// three step
            throw new Error();// four step
        } finally {// five step
            System.err.println(0);// six step
            throw new RuntimeException();// seven step and finish
        }
    }
}
