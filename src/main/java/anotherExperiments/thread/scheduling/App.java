package anotherExperiments.thread.scheduling;

public class App {
    public static void main(String[] args) {
        ThreadController threadController = new ThreadController();
        threadController.startThread();
        System.out.println("запустили поток");

        threadController.stopThread();
        System.out.println("остановили поток");
    }
}
