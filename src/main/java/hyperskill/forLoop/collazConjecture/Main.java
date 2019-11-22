package hyperskill.forLoop.collazConjecture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.print(number + " ");
        while (number > 1) {
            if (number == 1) {
                System.out.println(number);
            } else if (number % 2 == 0) {
                System.out.print((number = number / 2) + " ");
            } else {
                System.out.print((number = (number * 3) + 1) + " ");
            }
        }
    }
}
