package ru.globux.spring.ch5;

import ru.globux.spring.ch2.common.Guitar;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

public class NamePointcutUsingAdvisor {
	public static void main(String... args) {
		GrammyGuitarist johnMayer = new GrammyGuitarist();

		NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor(new SimpleAdvice());
		advisor.setMappedNames("sing", "rest");		

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(johnMayer);
		pf.addAdvisor(advisor);

		GrammyGuitarist proxy = (GrammyGuitarist) pf.getProxy();
		proxy.sing();
		proxy.sing(new Guitar());
		proxy.rest();
		proxy.talk();
	}
}
