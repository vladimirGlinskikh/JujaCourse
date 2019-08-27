package springFramework.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class ProfileXmlConfigExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/*-config.xml");
        context.refresh();

        FoodProviderService foodProviderService =
                context.getBean("foodProviderService", FoodProviderService.class);

        List<Food> lunchSet = foodProviderService.provideLunchSet();
        for (Food food : lunchSet) {
            System.out.println("Food: " + food.getName());
        }
        context.close();
    }
}
