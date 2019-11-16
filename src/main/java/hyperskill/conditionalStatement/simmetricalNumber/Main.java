package hyperskill.conditionalStatement.simmetricalNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println(((num / 1000) ^ (num % 10)) + ((num / 100 % 10) ^ (num % 100 / 10)) + 1);
    }
}

