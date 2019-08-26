package springFramework.ch4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Publisher implements ApplicationContextAware {
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public void publish(String message) {
        context.publishEvent(new MessageEvent(this, message));
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/app-context-xml.xml");

        Publisher publisher = (Publisher) context.getBean("publisher");
        publisher.publish("I send an SOS to the world... ");
        publisher.publish("... I hope that someone gets my...");
        publisher.publish("... Message in a bottle");
    }
}
