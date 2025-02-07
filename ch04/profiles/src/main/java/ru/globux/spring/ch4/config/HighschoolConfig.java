package ru.globux.spring.ch4.config;

import ru.globux.spring.ch4.FoodProviderService;
import ru.globux.spring.ch4.highschool.FoodProviderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("highschool")
public class HighschoolConfig {

	@Bean
	public FoodProviderService foodProviderService(){
		return new FoodProviderServiceImpl();
	}
}
