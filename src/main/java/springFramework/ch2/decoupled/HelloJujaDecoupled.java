package springFramework.ch2.decoupled;

public class HelloJujaDecoupled {
    public static void main(String[] args) {
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        MessageProvider messageProvider = new HelloJujaMessageProvider();

        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
