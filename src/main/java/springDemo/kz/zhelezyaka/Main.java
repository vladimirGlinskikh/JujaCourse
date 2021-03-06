package springDemo.kz.zhelezyaka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("kz.zhelezyaka/context.xml");
        MessageRenderer renderer = (MessageRenderer) context.getBean("messageRenderer");
        renderer.printMessage();
    }
}
