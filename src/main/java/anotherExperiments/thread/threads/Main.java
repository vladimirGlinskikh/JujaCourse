package anotherExperiments.thread.threads;

public class Main {
}

class EggVoice extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("яйцо!");
        }
    }
}
