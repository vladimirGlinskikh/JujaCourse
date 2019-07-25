package anotherExperiments.regex;

public class Test {
    public static void main(String[] args) {
        /*
        \\d - одна цифра
        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до

        ( | | ) - одна строка из множества строк
        [a-zA-Z] - все английские буквы
        [0-9] - все цифры
        [^abc] - мы хотим все символы кроме [abc]
        . - абсолютно любой символ
        {3} - 3 символа до
        {3, 7} - от 3 до 7 символов
        \\w - одна буква
         */
        String string = "43";
        System.out.println(string.matches("\\d+"));
    }
}
