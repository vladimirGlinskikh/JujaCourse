package springFramework.ch3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;
import springFramework.ch3.annotated.Singer;

public class LookupDemo {
    @Configuration
    @ComponentScan(basePackages = {"springFramework.ch3.annotated"})
    public static class LookupConfig {
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-annotated.xml");
        context.refresh();

        DemoBean abstractBean = context.getBean("abstractLookupBean", DemoBean.class);
        DemoBean standardBean = context.getBean("standardLookupBean", DemoBean.class);

        displayInfo("abstractLookupBean", abstractBean);
        displayInfo("standardLookupBean", standardBean);
    }

    public static void displayInfo(String beanName, DemoBean bean) {
        Singer singer1 = bean.getMySinger();
        Singer singer2 = bean.getMySinger();
        System.out.println("" + beanName + ": " + "Singer Instances the Same? "
                + (singer1 == singer2));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");
        for (int x = 0; x < 100_000; x++) {
            Singer singer = bean.getMySinger();
            singer.sing();
        }

        stopWatch.stop();
        System.out.println("100_000 gets took )" + stopWatch.getTotalTimeMillis() + " ms");
    }
}
