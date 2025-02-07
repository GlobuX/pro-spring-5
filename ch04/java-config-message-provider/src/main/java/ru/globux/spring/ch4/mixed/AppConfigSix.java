package ru.globux.spring.ch4.mixed;

import ru.globux.spring.ch2.decoupled.MessageProvider;
import ru.globux.spring.ch4.annotated.ConfigurableMessageProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigSix {

	@Bean
	public MessageProvider provider() {
		return new ConfigurableMessageProvider("Love on the weekend");
	}
}
