package anotherExperiments.multithreading.waitNotify;

import java.util.Scanner;

public class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started...");
            wait();// 1. отдает intrinsic lock 2. ждем пока будет вызван notify()
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);

        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify();
        }
    }
}
