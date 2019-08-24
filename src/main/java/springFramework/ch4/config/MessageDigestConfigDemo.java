package springFramework.ch4.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import springFramework.ch4.MessageDigestFactoryBean;
import springFramework.ch4.MessageDigester;

public class MessageDigestConfigDemo {

    @Configuration
    static class MessageDigesterConfig {

        @Bean
        public MessageDigestFactoryBean shaDigest() {
            MessageDigestFactoryBean factoryOne = new MessageDigestFactoryBean();
            factoryOne.setAlgorithmName("SHA1");
            return factoryOne;
        }

        @Bean
        public MessageDigestFactoryBean defaultDigest() {
            return new MessageDigestFactoryBean();
        }

        @Bean
        MessageDigester digester() throws Exception {
            MessageDigester messageDigester = new MessageDigester();

            messageDigester.setDigest1(shaDigest().getObject());
            messageDigester.setDigest2(defaultDigest().getObject());
            return messageDigester;
        }
    }

    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(
                MessageDigesterConfig.class
        );
        MessageDigester digester = (MessageDigester) context.getBean("digester");
        digester.digest("Hello Juja!");
        context.close();
    }
}
