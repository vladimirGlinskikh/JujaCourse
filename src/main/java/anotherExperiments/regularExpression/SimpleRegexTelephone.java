package anotherExperiments.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegexTelephone {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\+[1-9]\\(\\d{3}\\)(\\d{2}-){2}\\d{3}");
        Matcher matcher = pattern.matcher("+7(777)29-78-239");
        boolean b = matcher.matches();
        System.out.println(b);

    }
}
