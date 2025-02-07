package ru.globux.spring.ch4;

import ru.globux.spring.ch2.decoupled.MessageRenderer;
import ru.globux.spring.ch4.mixed.AppConfigFive;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigExampleTwo {
    public static void main(String... args) {
        ApplicationContext ctx = new 
            //AnnotationConfigApplicationContext(AppConfigTwo.class);
            //AnnotationConfigApplicationContext(AppConfigThree.class);
            AnnotationConfigApplicationContext(AppConfigFive.class);

        MessageRenderer renderer =
            ctx.getBean("messageRenderer", MessageRenderer.class);

        renderer.render();
    }
}
