package springFramework.ch3.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("injectSimpleConfig")
public class InjectSimpleConfig {
    private String name = "Vladimir Glinskikh";
    private int age = 43;
    private float height = 1.70f;
    private boolean programmer = true;
    private Long ageInSeconds = 1_234_563_123L;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }

    @Override
    public String toString() {
        return "Name= " + name + "\n" +
                "Age=" + age + "\n" +
                "Height=" + height + "\n" +
                "Programmer=" + programmer + "\n" +
                "AgeInSeconds=" + ageInSeconds;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-xml.xml");
        context.refresh();

        InjectSimpleConfig simple = (InjectSimpleConfig) context.getBean("injectSimpleConfig");
        System.out.println(simple);
        context.close();
    }
}
