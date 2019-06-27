package springFramework.ch2.decoupled;

import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    static {
        instance = new MessageSupportFactory();
    }

    private Properties properties;
    private MessageRenderer renderer;
    private MessageProvider provider;

    private MessageSupportFactory() {
        properties = new Properties();

        try {
            properties.load(this.getClass().getResourceAsStream(
                    "/spring/msf.properties"));
            String rendererClass = properties.getProperty(
                    "renderer.class");
            String providerClass = properties.getProperty(
                    "provider.class");

            renderer = (MessageRenderer)
                    Class.forName(rendererClass).newInstance();
            provider = (MessageProvider)
                    Class.forName(providerClass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
