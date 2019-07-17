package anotherExperiments.multithreading;

public class TestSynchronized {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}
