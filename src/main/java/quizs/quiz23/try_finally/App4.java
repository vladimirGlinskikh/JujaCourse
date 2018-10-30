package quizs.quiz23.try_finally;

public class App4 {
    public static void main(String[] args) {
        System.err.println(f());//first step and seven step
    }// eight step and finish

    public static int f() {// two step
        try {// three step
            throw new Error();// four step
        } finally {// five step
            return 0;// six step
        }
    }
}
