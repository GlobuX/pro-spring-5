package ru.globux.spring.ch4;

import ru.globux.spring.ch2.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigXMLDemo {

	public static void main(String... args) {
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext("classpath:spring/app-context-xml.xml");

			MessageRenderer renderer =
				ctx.getBean("messageRenderer", MessageRenderer.class);
		renderer.render();
	}
}
