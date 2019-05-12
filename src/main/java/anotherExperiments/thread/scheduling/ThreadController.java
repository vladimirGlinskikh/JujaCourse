package anotherExperiments.thread.scheduling;

public class ThreadController {
    private Runner runner = new Runner();
    private Thread thread = new Thread(runner);

    public void startThread() {
        System.out.println("call from startThread");
        thread.start();
    }

    public void stopThread() {
        System.out.println("call from stopThread");
        runner.stopRunning();
    }
}
