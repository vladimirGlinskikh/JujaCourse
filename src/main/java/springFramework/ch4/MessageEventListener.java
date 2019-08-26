package springFramework.ch4;

import org.springframework.context.ApplicationListener;

public class MessageEventListener implements ApplicationListener<MessageEvent> {

    @Override
    public void onApplicationEvent(MessageEvent messageEvent) {
        MessageEvent msgEvt = messageEvent;
        System.out.println("Received: " + msgEvt.getMessage());
    }
}
