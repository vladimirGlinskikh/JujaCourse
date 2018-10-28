package quizs.quiz23;

public class Application10 {
    public static void main(String[] args) throws Throwable {
        try {
            System.err.print("0 ");// first step
            throw new RuntimeException();// two step
        } catch (RuntimeException e) {// three step
            System.err.print("1 ");// four step
        }
        System.err.print("2 ");// five step
    }// finish step
}
