package anotherExperiments.multithreading;

import java.util.Scanner;

public class TestVolatile {
    public static void main(String[] args) {
        MyThread tread = new MyThread();
        tread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        tread.shutdown();

    }
}

class MyThread extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello Juja!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
