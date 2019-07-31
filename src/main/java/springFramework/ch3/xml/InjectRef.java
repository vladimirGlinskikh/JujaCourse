package springFramework.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;
import springFramework.ch3.Oracle;

public class InjectRef {
    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-xml.xml");
        context.refresh();

        InjectRef injectRef = (InjectRef) context.getBean("injectRef");
        System.out.println(injectRef);
        context.close();
    }

    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
