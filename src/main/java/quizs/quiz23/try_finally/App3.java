package quizs.quiz23.try_finally;

public class App3 {
    public static void main(String[] args) {
        System.err.println(f());// first step and eight step
    }// nine step and finish

    public static int f() {// two step
        try {// three step
            return 0;// four step and seven step
        } finally {// five step
            System.err.println(1);// six step
        }
    }
}
