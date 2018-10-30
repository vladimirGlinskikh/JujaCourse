package quizs.quiz23.try_finally;

public class App5 {
    public static void main(String[] args) {
        System.err.println(f());// first step and seven step
    }// eight step and finish

    public static int f() {// two step
        try {// three step
            System.err.println(0);// four step
        } finally {// five step
            return 1;// six step
        }
    }
}
