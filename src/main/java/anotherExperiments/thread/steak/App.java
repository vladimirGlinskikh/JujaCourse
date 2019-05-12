package anotherExperiments.thread.steak;

public class App {
    public static void main(String[] args) {
        SyncStack syncStack = new SyncStack();
        Producer producer = new Producer(syncStack);
        Thread threadProducer = new Thread(producer);
        System.out.println("call from producer");
        threadProducer.start();

        Producer producer1 = new Producer(syncStack);
        Thread threadProducer1 = new Thread(producer1);
        System.out.println("call from producer1");
        threadProducer1.start();

        Consumer consumer = new Consumer(syncStack);
        Thread threadConsumer = new Thread(consumer);
        System.out.println("call from consumer");
        threadConsumer.start();

        Consumer consumer1 = new Consumer(syncStack);
        Thread threadConsumer1 = new Thread(consumer1);
        System.out.println("call from consumer1");
        threadConsumer1.start();
    }
}
