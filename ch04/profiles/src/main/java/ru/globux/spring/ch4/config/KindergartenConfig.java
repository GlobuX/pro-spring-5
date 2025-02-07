package ru.globux.spring.ch4.config;

import ru.globux.spring.ch4.FoodProviderService;
import ru.globux.spring.ch4.kindergarten.FoodProviderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("kindergarten")
public class KindergartenConfig {

	@Bean
	public FoodProviderService foodProviderService(){
		return new FoodProviderServiceImpl();
	}
}