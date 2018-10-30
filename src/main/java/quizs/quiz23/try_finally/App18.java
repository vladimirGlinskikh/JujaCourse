package quizs.quiz23.try_finally;

public class App18 {
    public static void main(String[] args) {
        System.err.println(f());// first step
    }

    public static int f() {// two step
        try {// three step
            System.err.println(0);// four step
            throw new Error();// five step
        } finally {// six step
            throw new RuntimeException();// seven step and finish
        }
    }
}
