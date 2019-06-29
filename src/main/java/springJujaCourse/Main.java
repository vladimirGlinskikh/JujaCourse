package springJujaCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"springJuja/config.xml"});
        MyBean beans = (MyBean) ac.getBean("beans");
        beans.sayHello();
        System.out.println(beans.getName());
    }
}
