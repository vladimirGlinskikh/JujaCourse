package anotherExperiments.multithreading.callableAndFuture;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Starting...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished!");
            Random random = new Random();
            int randomValue = random.nextInt();
            if (randomValue < 5) {
                throw new Exception("Something will bad happened.");
            }
            return random.nextInt(10);
        });

        executorService.shutdown();

        try {
            int result = future.get();// ожидается окончание выполнения потока
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.err.println(ex.getMessage());
        }
    }
}
