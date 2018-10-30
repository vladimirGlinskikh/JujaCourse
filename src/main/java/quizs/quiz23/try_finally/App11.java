package quizs.quiz23.try_finally;

public class App11 {
    public static void main(String[] args) {
        System.err.println(f());// first step and nine step
    }// ten step and finish

    public static int f() {// two step
        try {// three step
            System.err.println(0);// four step
        } finally {// five step
            System.err.println(1);// six step
        }// seven step
        return 0;// eight step
    }
}
