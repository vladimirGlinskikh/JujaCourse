package hyperskill.doWhileLoops.sequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int start = 0;
        int goal = 0;
        int end = 0;

        while (start < number) {
            goal = scanner.nextInt();
            start++;

            if (goal % 4 == 0 && goal > end) {
                end = goal;
            }
        }
        System.out.println(end);
    }
}
