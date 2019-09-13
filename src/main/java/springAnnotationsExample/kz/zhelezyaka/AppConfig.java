package springAnnotationsExample.kz.zhelezyaka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springAnnotationsExample.kz.zhelezyaka")
public class AppConfig {

    @Bean
    public MessageRenderer renderer() {
        return new MessageRenderer(message());
    }

    @Bean
    public Message message() {
        return new HelloMessage("Hello annotation!");
    }
}
