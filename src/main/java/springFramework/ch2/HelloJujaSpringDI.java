package springFramework.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springFramework.ch2.decoupled.MessageRenderer;

public class HelloJujaSpringDI {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring/app-context.xml");
        MessageRenderer messageRenderer =
                context.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
    }
}
