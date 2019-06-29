package springFramework.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import springFramework.ch2.decoupled.MessageRenderer;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext context =
                new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-xml.xml");
        context.refresh();
        MessageRenderer messageRenderer =
                context.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
        context.close();
    }
}
