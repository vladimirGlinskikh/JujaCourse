package springFramework.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class NameSingerDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-xml.xml");
        context.refresh();

        NameSinger bean = (NameSinger) context.getBean("johnMayer");
        bean.sing();
        context.close();
    }
}
