package springFramework.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestFactoryDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-xml.xml");
        context.refresh();

        MessageDigester digester = context.getBean("digester", MessageDigester.class);
        digester.digest("Hello Juja!");
        context.close();
    }
}
