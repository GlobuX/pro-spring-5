package ru.globux.spring.ch4.multiple;

import ru.globux.spring.ch2.decoupled.MessageProvider;
import ru.globux.spring.ch2.decoupled.MessageRenderer;
import ru.globux.spring.ch2.decoupled.StandardOutMessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConfigFour.class)
public class AppConfigThree {
	@Autowired
	MessageProvider provider;


	@Bean(name = "messageRenderer")
	public MessageRenderer messageRenderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider);
		return renderer;
	}
}
