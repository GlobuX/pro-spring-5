package ru.globux.spring.ch6;

import ru.globux.spring.ch6.config.EmbeddedJdbcConfig;
import ru.globux.spring.ch6.config.PopulatorJdbcConfig;
import ru.globux.spring.ch6.dao.SingerDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class JdbcCfgTest {

	@Test
	public void testH2DB() {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/embedded-h2-cfg.xml");
		ctx.refresh();
		testDao(ctx.getBean(SingerDao.class));
		ctx.close();
	}

	@Test
	public void testDerby() {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/embedded-derby-cfg.xml");
		ctx.refresh();
		testDao(ctx.getBean(SingerDao.class));
		ctx.close();
	}

	@Test
	public void testEmbeddedJavaConfig() {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(EmbeddedJdbcConfig.class);
		testDao(ctx.getBean(SingerDao.class));
		ctx.close();
	}

	@Test
	public void testPopulatorJavaConfig() {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(PopulatorJdbcConfig.class);
		testDao(ctx.getBean(SingerDao.class));
		ctx.close();
	}

	private void testDao(SingerDao singerDao) {
		assertNotNull(singerDao);
		String singerName = singerDao.findNameById(1l);
		assertTrue("John Mayer".equals(singerName));

	}
}
