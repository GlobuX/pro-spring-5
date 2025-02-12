package ru.globux.spring.ch4.config;

import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.globux.spring.ch4.FoodProviderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes={KindergartenConfig.class, HighschoolConfig.class})
@ActiveProfiles("kindergarten")
public class ProfilesJavaConfigTest {

	@Autowired FoodProviderService foodProviderService;

	@Test
	public void testProvider(){
        assertNotNull(foodProviderService.provideLunchSet());
		assertFalse(foodProviderService.provideLunchSet().isEmpty());
		assertEquals(2, foodProviderService.provideLunchSet().size());
	}

}
