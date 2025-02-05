package ru.globux.spring.ch3.annotated;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"ru.globux.spring.ch3.annotated"})
@Configuration
public class HelloWorldConfiguration {

}
