package hyperskill.printingData.encrypted;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int seconds = scanner.nextInt();

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        int sum = (hour * 3600) + (minute * 60) + seconds;
        int summ = (h * 3600) + (m * 60) + s;
        System.out.println(summ - sum);
    }
}
