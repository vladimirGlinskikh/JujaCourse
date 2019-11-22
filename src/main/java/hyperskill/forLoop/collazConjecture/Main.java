package hyperskill.forLoop.collazConjecture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        while (number != 1) {
            System.out.print(number + " ");
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }
        }
        System.out.print(number);
    }
}
