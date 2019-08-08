package springFramework.ch3;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;
import springFramework.ch3.annotated.Singer;

@Component("abstractLookupBean")
public class AbstractLookupDemoBean implements DemoBean {

    @Lookup("singer")
    public Singer getMySinger() {
        return null;
    }

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
