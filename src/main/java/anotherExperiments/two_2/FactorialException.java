package anotherExperiments.two_2;

public class FactorialException extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }

    public FactorialException(String message, int number) {
        super(message);
        this.number = number;
    }
}
