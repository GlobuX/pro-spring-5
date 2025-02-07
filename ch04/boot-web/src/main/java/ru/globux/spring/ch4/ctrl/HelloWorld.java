package ru.globux.spring.ch4.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping("/")
	public String sayHi() {
		return "Hello World!";
	}
}
