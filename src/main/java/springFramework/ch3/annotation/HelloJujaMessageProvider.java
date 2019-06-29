package springFramework.ch3.annotation;

import org.springframework.stereotype.Component;
import springFramework.ch2.decoupled.MessageProvider;

@Component("provider")
public class HelloJujaMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello Juja with annotations!";
    }
}
