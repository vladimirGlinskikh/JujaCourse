package hyperskill.relationalOperators.checkTheGivenNumbersAreDifferent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println(false);
        } else if (a != b && b != c && a != c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
