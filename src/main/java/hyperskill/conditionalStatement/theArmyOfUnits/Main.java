package hyperskill.conditionalStatement.theArmyOfUnits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberArmy = scanner.nextInt();

        if (numberArmy <= 0) {
            System.out.println("no army");
        } else if (numberArmy <= 4) {
            System.out.println("few");
        } else if (numberArmy <= 9) {
            System.out.println("several");
        } else if (numberArmy <= 19) {
            System.out.println("pack");
        } else if (numberArmy <= 49) {
            System.out.println("lots");
        } else if (numberArmy <= 99) {
            System.out.println("horde");
        } else if (numberArmy <= 249) {
            System.out.println("throng");
        } else if (numberArmy <= 499) {
            System.out.println("swarm");
        } else if (numberArmy <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
