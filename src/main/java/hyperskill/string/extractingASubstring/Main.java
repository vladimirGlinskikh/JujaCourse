package hyperskill.string.extractingASubstring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int one = scanner.nextInt();
        int two = scanner.nextInt();

        System.out.println(word.substring(one, two + 1));
    }
}
