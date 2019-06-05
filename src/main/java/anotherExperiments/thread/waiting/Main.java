package anotherExperiments.thread.waiting;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        Producer producer = new Producer(product, 7);
        Consumer consumer = new Consumer(product, 4);

        producer.start();
        consumer.start();
    }
}

class Product {
    int id;
    boolean isProducer;

    synchronized void getIdProduct() {
        if (!isProducer) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Get: " + this.id);
        isProducer = false;
        notify();
    }

    synchronized void setIdProduct(int id) {
        if (isProducer) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.id = id;
        System.out.println("Set: " + this.id);
        isProducer = true;
        notify();
    }
}

class Producer extends Thread {
    Product product;
    int count;

    Producer(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            product.setIdProduct(i);
        }
    }
}

class Consumer extends Thread {
    Product product;
    int count;

    Consumer(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            product.getIdProduct();
        }
    }
}
