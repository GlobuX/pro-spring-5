package ru.globux.spring.ch3.xml.complicated;

import ru.globux.spring.ch3.xml.Bar;
import org.springframework.context.support.GenericXmlApplicationContext;


public class CTarget {

	private Foo fooOne;
	private Foo fooTwo;
	private Bar bar;

	public CTarget() {
	}

	public CTarget(Foo foo) {
		System.out.println("Target(Foo) called");
	}

	public CTarget(com.apress.prospring5.ch3.xml.Foo foo, Bar bar) {
		System.out.println("Target(Foo, Bar) called");
	}

	public void setFooOne(Foo fooOne) {
		this.fooOne = fooOne;
		System.out.println("Property fooOne set");
	}

	public void setFooTwo(Foo foo) {
		this.fooTwo = foo;
		System.out.println("Property fooTwo set");
	}

	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("Property bar set");
	}

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		//using primary
		//ctx.load("classpath:spring/app-context-04.xml");

		//using qualifier
		ctx.load("classpath:spring/app-context-05.xml");
		ctx.refresh();
		System.out.println("\nUsing byType:\n");
		CTarget t = (CTarget) ctx.getBean("targetByType");
		ctx.close();
	}
}