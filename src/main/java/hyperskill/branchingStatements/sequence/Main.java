package hyperskill.branchingStatements.sequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        long old;

        boolean rordered = true;
        boolean lordered = true;

        while (true) {
            old = num;
            num = scanner.nextLong();

            if (num == 0) {
                break;
            }

            if (rordered && num < old) {
                rordered = false;
                continue;
            }

            if (lordered && num > old) {
                lordered = false;
                continue;
            }

            if (!rordered && !lordered) {
                break;
            }
        }
        System.out.println(lordered || rordered);
    }
}
