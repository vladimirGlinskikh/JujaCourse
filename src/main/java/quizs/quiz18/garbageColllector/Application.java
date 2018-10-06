package quizs.quiz18.garbageColllector;

public class Application {
    public static void main(String[] args) {
        Object[] ref = new Object[1];
        while (true) {
            System.out.println(ref = new Object[]{ref});
        }
    }
}
