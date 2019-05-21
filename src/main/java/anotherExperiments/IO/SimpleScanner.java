package anotherExperiments.IO;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        String string = scanner.next();
        String string1 = scanner.nextLine();

        System.out.println("|Number: " + i + "|" + " |Float: " + f + "|" + " |Word: "
                + string + "|" + " |Line: " + string1 + "|");
    }
}
