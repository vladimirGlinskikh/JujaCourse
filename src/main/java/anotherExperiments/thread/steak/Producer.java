package anotherExperiments.thread.steak;

import java.util.Stack;

public class Producer implements Runnable {
    SyncStack theStack;
    private int num;

    public Producer(SyncStack syncStack) {
        theStack = syncStack;
        num = 0;
    }

    @Override
    public void run() {
        char c;
        for (int i = 0; i < 200; i++) {
            c = (char) (Math.random() * 26 + 'A');
            theStack.push(c);
            System.out.println("Producer" + num + ": " + c);
            try {
                Thread.sleep((int) (Math.random() * 300));
            } catch (InterruptedException e) {

            }
        }
    }
}
