package hyperskill.string.comparingStringIgnoringWhitespaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String word1 = scanner.nextLine();

        String replace = word.replaceAll(" ", "");
        String replace1 = word1.replaceAll(" ", "");

        if (replace.equals(replace1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
