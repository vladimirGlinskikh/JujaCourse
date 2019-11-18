package hyperskill.forLoop.maximumElementDivideBy4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int maxNumber = 0;
        int nextNumber;

        for (int i = 0; i < number; i++) {
            nextNumber = scanner.nextInt();
            if (nextNumber % 4 == 0) {
                if (maxNumber < nextNumber) {
                    maxNumber = nextNumber;
                }
            }
        }
        System.out.println(maxNumber);
    }
}
