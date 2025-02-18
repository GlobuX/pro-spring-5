package ru.globux.spring.ch4;

import java.util.List;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProfileXmlConfigDemo {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.getEnvironment().setActiveProfiles("kindergarten");
        ctx.getEnvironment().setActiveProfiles("highschool");
        ctx.load("classpath:spring/*-config.xml");
        ctx.refresh();


        FoodProviderService foodProviderService =    
            ctx.getBean("foodProviderService", FoodProviderService.class);

        List<Food> lunchSet = foodProviderService.provideLunchSet();

        for (Food food: lunchSet) {
            System.out.println("Food: " + food.getName());
        }

        ctx.close();
    }
}
