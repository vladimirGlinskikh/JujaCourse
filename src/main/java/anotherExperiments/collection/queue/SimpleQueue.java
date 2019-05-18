package anotherExperiments.collection.queue;

public class SimpleQueue {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public SimpleQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new long[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(long element) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = element;
        nItems++;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public long remove() {
        long tmp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return tmp;
    }
}

class QueueMain {
    public static void main(String[] args) {
        SimpleQueue simpleQueue = new SimpleQueue(10);

        simpleQueue.insert(10);
        simpleQueue.insert(20);
        simpleQueue.insert(30);
        simpleQueue.insert(40);
        simpleQueue.remove();
        simpleQueue.remove();

        while (!simpleQueue.isEmpty()) {
            long n = simpleQueue.remove();
            System.out.print(n + " ");
        }
    }
}
