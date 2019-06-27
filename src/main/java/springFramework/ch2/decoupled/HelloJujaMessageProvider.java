package springFramework.ch2.decoupled;

public class HelloJujaMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello Juja!";
    }
}
