package springFramework.ch3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springFramework.ch2.decoupled.MessageRenderer;

public class DependencyPull {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring/app-context.xml");
        MessageRenderer messageRenderer = context.getBean(
                "renderer", MessageRenderer.class);
        messageRenderer.render();
    }
}
