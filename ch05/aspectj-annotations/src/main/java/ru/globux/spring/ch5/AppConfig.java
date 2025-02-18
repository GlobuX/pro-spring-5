package ru.globux.spring.ch5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"ru.globux.spring.ch5"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {

}
