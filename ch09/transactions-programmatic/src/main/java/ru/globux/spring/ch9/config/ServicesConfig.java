package ru.globux.spring.ch9.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@ComponentScan(basePackages = "ru.globux.spring.ch9")
public class ServicesConfig {

	@Autowired EntityManagerFactory entityManagerFactory;

	@Bean
	public TransactionTemplate transactionTemplate() {
		TransactionTemplate tt = new TransactionTemplate();
		tt.setPropagationBehavior(TransactionDefinition.PROPAGATION_NEVER);
		tt.setTimeout(30);
		tt.setTransactionManager(transactionManager());
		return tt;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new JpaTransactionManager(entityManagerFactory);
	}
}
