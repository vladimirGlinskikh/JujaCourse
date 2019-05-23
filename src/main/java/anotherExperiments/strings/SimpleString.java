package anotherExperiments.strings;

public class SimpleString {
    public static void main(String[] args) {
        String string = "Hello Juja!";
        String string1 = new String("Hello!");

        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        String string2 = new String(arr, 0, 2);
        System.out.println(string2);
    }
}
