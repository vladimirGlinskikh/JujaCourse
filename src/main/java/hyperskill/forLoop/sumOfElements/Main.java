package hyperskill.forLoop.sumOfElements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;
        int sum = 0;
        do {
            value = scanner.nextInt();
            sum += value;
        } while (value != 0);
        System.out.println(sum);
    }
}
