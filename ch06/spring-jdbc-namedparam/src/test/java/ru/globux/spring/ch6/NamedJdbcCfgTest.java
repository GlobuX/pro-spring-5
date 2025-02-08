package ru.globux.spring.ch6;

import ru.globux.spring.ch6.config.NamedJdbcCfg;
import ru.globux.spring.ch6.dao.SingerDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NamedJdbcCfgTest {

	@Test
	public void testCfg(){
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(NamedJdbcCfg.class);

		SingerDao singerDao = ctx.getBean(SingerDao.class);
		assertNotNull(singerDao);
		String singerName = singerDao.findNameById(1l);
		assertTrue("John Mayer".equals(singerName));

		ctx.close();
	}

}
