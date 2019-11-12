package hyperskill.relationalOperators.isBetween;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean sum = (a >= b && a <= c || a >= c && a <= b);
        System.out.println(sum);
    }
}
