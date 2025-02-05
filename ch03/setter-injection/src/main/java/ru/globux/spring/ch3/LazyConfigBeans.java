package ru.globux.spring.ch3;

import ru.globux.spring.ch2.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by iuliana.cosmina on 1/31/17.
 */
public class LazyConfigBeans {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-lazy-xml.xml");
		ctx.refresh();
		MessageRenderer messageRenderer = ctx.getBean("renderer",
				MessageRenderer.class);
		messageRenderer.render();
		ctx.close();
	}

}
