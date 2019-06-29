package springFramework.ch2.decoupled;

import org.springframework.stereotype.Component;

@Component("provider")
public class HelloJujaMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello Juja!";
    }
}
