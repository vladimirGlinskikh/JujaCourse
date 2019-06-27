package springFramework.ch2.annotated;

import org.springframework.context.annotation.Bean;
import springFramework.ch2.decoupled.HelloJujaMessageProvider;
import springFramework.ch2.decoupled.MessageProvider;
import springFramework.ch2.decoupled.MessageRenderer;
import springFramework.ch2.decoupled.StandardOutMessageRenderer;

public class HelloJujaConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloJujaMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
