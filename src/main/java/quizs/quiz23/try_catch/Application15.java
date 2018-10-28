package quizs.quiz23.try_catch;

public class Application15 {
    public static void main(String[] args) throws Throwable {
        try {
            System.err.print("0 ");// first step
            throw new Throwable();// two step
        } catch (Throwable e) {// three step
            System.err.print("1 ");// four step
        }
        System.err.print("2 ");// five step
    }// finish step
}
