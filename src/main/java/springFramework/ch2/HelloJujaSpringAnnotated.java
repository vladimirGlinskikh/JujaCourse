package springFramework.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springFramework.ch2.annotated.HelloJujaConfiguration;
import springFramework.ch2.decoupled.MessageRenderer;

public class HelloJujaSpringAnnotated {
    public static void main(String[] args) {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(HelloJujaConfiguration.class);
        MessageRenderer messageRenderer = context.getBean(
                "renderer", MessageRenderer.class);
        messageRenderer.render();
    }
}
