package ru.globux.spring.ch9;

import java.util.List;

import ru.globux.spring.ch9.config.DataJpaConfig;
import ru.globux.spring.ch9.config.ServicesConfig;
import ru.globux.spring.ch9.entities.Singer;
import ru.globux.spring.ch9.services.SingerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TxAnnotationDemo {

    public static void main(String... args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(ServicesConfig.class,
                DataJpaConfig.class);

        SingerService singerService = ctx.getBean(SingerService.class);

        List<Singer> singers = singerService.findAll();
        singers.forEach(s -> System.out.println(s));

        Singer singer = singerService.findById(1L);
        singer.setFirstName("John Clayton");
        singer.setLastName("Mayer");
        singerService.save(singer);
        System.out.println("Singer saved successfully: " + singer);
        System.out.println("Singer count: " + singerService.countAll());

        ctx.close();
    }
}

