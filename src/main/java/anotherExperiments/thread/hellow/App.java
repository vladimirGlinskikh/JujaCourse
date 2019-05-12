package anotherExperiments.thread.hellow;

public class App {
    public static void main(String[] args) {
        HelloRunner helloRunner = new HelloRunner();
        Thread thread = new Thread(helloRunner);
        thread.start();
    }
}
