package ru.globux.spring.ch3.sandbox;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//Decomment the following annotation and comment the @Qualifier in the TrickyTarget class to test this annotation
//@Primary
public class FooImplOne implements Foo {

}
