package anotherExperiments.regularExpression;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        String string = "1Juja 2 Juja 3 Juja";
        Scanner scanner = new Scanner(string).useDelimiter("\\s*Juja\\s*");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
