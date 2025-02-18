package ru.globux.spring.ch4;

import ru.globux.spring.ch3.xml.Singer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class GroovyBeansFromJava {

	public static void main(String... args) {
		ApplicationContext context = new GenericGroovyApplicationContext("classpath:beans.groovy");
		Singer singer = context.getBean("singer", Singer.class);
		System.out.println(singer);
	}
}
