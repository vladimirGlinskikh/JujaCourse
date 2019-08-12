package springFramework.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class BeanNameAliasing {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-02.xml");
        ctx.refresh();

        String s1 = (String) ctx.getBean("Vladimir");
        String s2 = (String) ctx.getBean("Glinskikh");
        String s3 = (String) ctx.getBean("Jonahan");
        String s4 = (String) ctx.getBean("Vladimir");
        String s5 = (String) ctx.getBean("jim");
        String s6 = (String) ctx.getBean("s");

        System.out.println((s1 == s2));
        System.out.println((s2 == s3));
        System.out.println((s3 == s4));
        System.out.println((s4 == s5));
        System.out.println((s5 == s6));

        Map<String, String> beans = ctx.getBeansOfType(String.class);

        if (beans.size() == 1) {
            System.out.println("There is only one String bean.");
        }
        ctx.close();
    }
}
