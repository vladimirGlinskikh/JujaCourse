package springFramework.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.security.MessageDigest;

public class AccessingFactoryBeans {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-xml.xml");
        context.refresh();
        context.getBean("shaDigest", MessageDigest.class);

        MessageDigestFactoryBean factoryBean = (MessageDigestFactoryBean) context.getBean("&shaDigest");
        try {
            MessageDigest shaDigest = factoryBean.getObject();
            System.out.println(shaDigest.digest("Hello Juja".getBytes()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        context.close();
    }
}
