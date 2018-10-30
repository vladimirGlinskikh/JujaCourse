package quizs.quiz23.try_finally;

public class App2 {
    public static void main(String[] args) {
        System.err.println(f());// first step and five step
    }// six step and finish

    public static int f() {// two step
        try {
            return 0;// three step
        } finally {
            return 1; // four step
        }
    }
}
