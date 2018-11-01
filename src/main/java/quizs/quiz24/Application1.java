package quizs.quiz24;

public class Application1 {
    public static void main(String[] args) throws Throwable {
        try {
            throw new Exception();
        } catch (RuntimeException t) {
            // nothing
        }
    }
}
