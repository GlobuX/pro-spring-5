package ru.globux.spring.ch3;

import ru.globux.spring.ch2.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml.xml");
		ctx.refresh();
		MessageRenderer messageRenderer = ctx.getBean("renderer",
				MessageRenderer.class);
		messageRenderer.render();
		ctx.close();
	}
}
