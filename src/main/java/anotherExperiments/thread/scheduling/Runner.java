package anotherExperiments.thread.scheduling;

public class Runner implements Runnable {
    private boolean timeToQuit = false;

    @Override
    public void run() {
        while (!timeToQuit) {
            System.out.println("call from method run()");
        }
    }

    public void stopRunning() {
        System.out.println("call from stopRunning()");
        timeToQuit = true;
    }
}
