package hyperskill.doWhileLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        int number = scanner.nextInt();

        while (number != 0) {
            number = scanner.nextInt();
            value++;
        }
        System.out.println(value);
    }
}
