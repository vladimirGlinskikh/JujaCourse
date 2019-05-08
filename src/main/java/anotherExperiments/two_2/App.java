package anotherExperiments.two_2;

public class App {
    public static void main(String[] args) {
        try {
            int result = Factorial.getFactorial(0);
            System.out.println(result);
        } catch (FactorialException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getNumber());
        }
    }
}
