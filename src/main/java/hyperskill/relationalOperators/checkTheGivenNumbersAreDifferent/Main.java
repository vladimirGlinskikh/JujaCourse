package hyperskill.relationalOperators.checkTheGivenNumbersAreDifferent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int a1 = --a;
        int b1 = --b;
        int c1 = --c;
        int d1 = --d;
        System.out.println(a1 + " " + b1 + " " + c1 + " " + d1);
    }
}
