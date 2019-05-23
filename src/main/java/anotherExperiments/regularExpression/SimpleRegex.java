package anotherExperiments.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+\\s*+[a-zA-Z]+");
        Matcher matcher = pattern.matcher("Hello Juja");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
