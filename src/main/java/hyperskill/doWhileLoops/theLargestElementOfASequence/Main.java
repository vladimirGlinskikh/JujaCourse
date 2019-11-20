package hyperskill.doWhileLoops.theLargestElementOfASequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int value = num;

        while (num != 0) {
            if (value < num) {
                value = num;
            }
            num = scanner.nextInt();
        }
        System.out.println(value);
    }
}
