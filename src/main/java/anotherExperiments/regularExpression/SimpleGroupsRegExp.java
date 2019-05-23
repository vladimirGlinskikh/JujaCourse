package anotherExperiments.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleGroupsRegExp {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(.(.(.(.))))");
        Matcher matcher = pattern.matcher("Juja");
        System.out.println(matcher.groupCount());
        while (matcher.find()) {
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println(i + " = " + matcher.group(i));
            }
        }
    }
}
