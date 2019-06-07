package anotherExperiments.thread.runnable;

public class Main extends Thread {
    private String word;
    private int delay;

    private Main(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (; ; ) {
            System.out.println(word + " ");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Main ping = new Main("ping", 19);
        Main pong = new Main("pong", 35);

        Thread thread = new Thread(ping);
        Thread thread1 = new Thread(pong);

        thread.start();
        thread1.start();
    }
}
