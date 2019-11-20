package hyperskill.doWhileLoops.squaresOfNaturalNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int square = 0;
        int prev = 0;

        for (int i = 1; prev < n; i++) {
            square += i + prev;
            if (square <= n) {
                System.out.println(square);
            }
            prev = i;
        }
    }
}
