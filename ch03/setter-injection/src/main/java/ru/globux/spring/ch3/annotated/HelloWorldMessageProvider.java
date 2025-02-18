package ru.globux.spring.ch3.annotated;

import ru.globux.spring.ch2.decoupled.MessageProvider;
import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World!";
	}
}
