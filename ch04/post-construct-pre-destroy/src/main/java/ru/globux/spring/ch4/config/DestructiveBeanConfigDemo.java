package ru.globux.spring.ch4.config;

import ru.globux.spring.ch4.DestructiveBeanWithJSR250;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;

import java.nio.file.FileSystems;

public class DestructiveBeanConfigDemo {

	@Configuration
	static class DestructiveBeanConfig {

		@Lazy
		@Bean(initMethod = "afterPropertiesSet", destroyMethod = "destroy")
		DestructiveBeanWithJSR250 destructiveBean() {
			DestructiveBeanWithJSR250 destructiveBean = new DestructiveBeanWithJSR250();
			destructiveBean.setFilePath(System.getProperty("java.io.tmpdir") +
                    FileSystems.getDefault().getSeparator() + "test.txt");
			return destructiveBean;
		}

	}

	public static void main(String... args) {
		GenericApplicationContext ctx =
				   new AnnotationConfigApplicationContext(DestructiveBeanConfig.class);

		ctx.getBean(DestructiveBeanWithJSR250.class);
		ctx.registerShutdownHook();
	}

}
