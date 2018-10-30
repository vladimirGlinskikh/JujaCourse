package quizs.quiz23.try_finally;

public class App12 {
    public static void main(String[] args) {
        System.err.println(f());// first step
    }

    public static int f() {// two step
        try {// three step
            return 0;// four step
        } finally {// five step
            throw new Error();// six step and finish
        }
    }
}
