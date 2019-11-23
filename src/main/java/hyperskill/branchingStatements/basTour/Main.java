package hyperskill.branchingStatements.basTour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int bridgeNumber = scanner.nextInt();
        int bridgeHeight = 0;

        boolean crash = false;
        int i;
        for (i = 1; i < bridgeNumber; i++) {
            bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                bridgeHeight = i;
                crash = true;
                break;
            }
        }
        if (crash) {
            System.out.println("Will crash on bridge " + bridgeHeight);
        } else {
            System.out.println("Will not crash");
        }
    }
}
