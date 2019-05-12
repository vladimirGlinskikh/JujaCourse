package anotherExperiments.thread.steak;

public class Consumer implements Runnable {
    SyncStack theStack;
    private int num;

    public Consumer(SyncStack syncStack) {
        theStack = syncStack;
        num = 1;
    }

    @Override
    public void run() {
        char c;
        for (int i = 0; i < 200; i++) {
            c = theStack.pop();
            System.out.println("Consumer" + num + ": " + c);
            try {
                Thread.sleep((int) (Math.random() * 300));
            } catch (InterruptedException e) {

            }
        }
    }
}
