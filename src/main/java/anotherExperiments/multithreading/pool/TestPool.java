package anotherExperiments.multithreading.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++)
            executorService.submit(new Work(i));
        executorService.shutdown();
        System.out.println("All tasks submitted.");

        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}
