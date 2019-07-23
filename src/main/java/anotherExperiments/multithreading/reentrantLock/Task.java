package anotherExperiments.multithreading.reentrantLock;

public class Task {
    private int counter;

    private void increment() {
        for (int i = 0; i < 10_000; i++) {
            counter++;
        }
    }

    public void firstThread() {
        increment();
    }

    public void secondThread() {
        increment();
    }

    public void showCounter() {
        System.out.println(counter);
    }
}
