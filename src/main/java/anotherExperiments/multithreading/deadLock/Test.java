package anotherExperiments.multithreading.deadLock;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();
        Thread thread1 = new Thread(() -> runner.firstThread());

        Thread thread2 = new Thread(() -> runner.secondThread());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finished();
    }
}
