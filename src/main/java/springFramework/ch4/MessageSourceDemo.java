package springFramework.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Locale;

public class MessageSourceDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-xml.xml");
        context.refresh();

        Locale english = Locale.ENGLISH;
        Locale german = new Locale("de", "DE");

        System.out.println(context.getMessage("msg", null, english));
        System.out.println(context.getMessage("msg", null, german));
        System.out.println(context.getMessage("nameMsg", new Object[]{"John", "Mayer"}, german));
        System.out.println(context.getMessage("nameMsg", new Object[]{"John", "Mayer"}, english));
        context.close();
    }
}
