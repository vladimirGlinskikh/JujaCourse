package anotherExperiments.regex.mather;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String text = "Hello Guys! I send you my email: vladimir.v.glinskikh@gmail.com and " +
                " support@zhelezyaka.kz";
        Pattern email = Pattern.compile("(\\w+)@(gmail|zhelezyaka)\\.(com|kz)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(3));
        }
    }
}
