package quizs.quiz31.threadMethods;

public class ApplicationOne {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        }).run();
    }
}
