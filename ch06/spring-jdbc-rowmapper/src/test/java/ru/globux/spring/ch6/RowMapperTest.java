package ru.globux.spring.ch6;

import ru.globux.spring.ch6.config.NamedJdbcCfg;
import ru.globux.spring.ch6.dao.SingerDao;
import ru.globux.spring.ch6.entities.Album;
import ru.globux.spring.ch6.entities.Singer;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RowMapperTest {

	@Test
	public void testRowMapper() {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(NamedJdbcCfg.class);
		SingerDao singerDao = ctx.getBean(SingerDao.class);
		assertNotNull(singerDao);
		List<Singer> singers = singerDao.findAll();
		assertTrue(singers.size() == 3);

		singers.forEach(singer -> {
			System.out.println(singer);
			if (singer.getAlbums() != null) {
				for (Album album : singer.getAlbums()) {
					System.out.println("---" + album);
				}
			}
		});

		ctx.close();
	}
}
