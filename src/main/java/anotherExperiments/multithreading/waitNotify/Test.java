package anotherExperiments.multithreading.waitNotify;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer ps = new ProducerConsumer();

        Thread thread1 = new Thread(() -> {
            try {
                ps.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                ps.consume();
            } catch (InterruptedException e) {

            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
