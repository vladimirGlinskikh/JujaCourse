package hyperskill.branchingStatements.evenOrOdd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            } else {
                System.out.println(number % 2 == 0 ? "even" : "odd");
            }
        }
    }
}
