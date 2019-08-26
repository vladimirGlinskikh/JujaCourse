package springFramework.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;


import java.io.File;

public class ResourceDemo {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext();

        File file = File.createTempFile("test", "txt");
        file.deleteOnExit();

        Resource resource1 = context.getResource("file://" + file.getPath());
        displeyInfo(resource1);
        Resource resource2 = context.getResource("classpath:test.txt");
        displeyInfo(resource2);
        Resource resource3 = context.getResource("http://www.zhelezyaka.kz");
        displeyInfo(resource3);
    }

    private static void displeyInfo(Resource resource) throws Exception {
        System.out.println(resource.getClass());
        System.out.println(resource.getURL().getContent());
        System.out.println("");
    }
}
