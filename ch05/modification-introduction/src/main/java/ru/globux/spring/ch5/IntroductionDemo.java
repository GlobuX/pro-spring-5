package ru.globux.spring.ch5;

import ru.globux.spring.ch2.common.Contact;
import ru.globux.spring.ch5.introduction.IsModified;
import ru.globux.spring.ch5.introduction.IsModifiedAdvisor;
import org.springframework.aop.IntroductionAdvisor;
import org.springframework.aop.framework.ProxyFactory;

public class IntroductionDemo {
    public static void main(String... args) {
        Contact target = new Contact();
        target.setName("John Mayer");

        IntroductionAdvisor advisor = new IsModifiedAdvisor();

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);
        pf.setOptimize(true);

        Contact proxy = (Contact) pf.getProxy();
        IsModified proxyInterface = (IsModified)proxy;

        System.out.println("Is Contact?: " + (proxy instanceof Contact));
        System.out.println("Is IsModified?: " + (proxy instanceof IsModified));

        System.out.println("Has been modified?: " + 
            proxyInterface.isModified());

        proxy.setName("John Mayer");

        System.out.println("Has been modified?: " + 
            proxyInterface.isModified());

        proxy.setName("Eric Clapton");

        System.out.println("Has been modified?: " + 
            proxyInterface.isModified());
    }
}
