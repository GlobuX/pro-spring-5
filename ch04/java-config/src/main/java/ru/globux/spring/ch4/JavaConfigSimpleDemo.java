package ru.globux.spring.ch4;

import ru.globux.spring.ch2.decoupled.MessageProvider;
import ru.globux.spring.ch2.decoupled.MessageRenderer;
import ru.globux.spring.ch2.decoupled.StandardOutMessageRenderer;
import ru.globux.spring.ch3.xml.ConfigurableMessageProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class JavaConfigSimpleDemo {

    @Configuration
    static class AppConfig {
        @Bean
        public MessageProvider messageProvider() {
            System.out.println("Load bean: ConfigurableMessageProvider");
            return new ConfigurableMessageProvider();
        }

        @Bean
        public MessageRenderer messageRenderer() {
            MessageRenderer renderer = new StandardOutMessageRenderer();
            renderer.setMessageProvider(messageProvider());
            System.out.println("Load bean: StandardOutMessageRenderer");
            return renderer;
        }
    }


    public static void main(String... args) {
        ApplicationContext ctx = new 
            AnnotationConfigApplicationContext(AppConfig.class);

        MessageRenderer renderer =
            ctx.getBean("messageRenderer", MessageRenderer.class);

        renderer.render();
    }
}
