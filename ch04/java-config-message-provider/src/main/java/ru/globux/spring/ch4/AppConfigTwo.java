package ru.globux.spring.ch4;

import ru.globux.spring.ch2.decoupled.MessageProvider;
import ru.globux.spring.ch2.decoupled.MessageRenderer;
import ru.globux.spring.ch2.decoupled.StandardOutMessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages={"ru.globux.spring.ch4.annotated"})
public class AppConfigTwo {

	@Autowired
	MessageProvider provider;


	@Bean(name = "messageRenderer")
	public MessageRenderer messageRenderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider);
		return renderer;
	}
}
