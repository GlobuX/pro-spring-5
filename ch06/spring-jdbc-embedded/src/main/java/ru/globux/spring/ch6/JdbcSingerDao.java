package ru.globux.spring.ch6;

import ru.globux.spring.ch6.dao.SingerDao;
import ru.globux.spring.ch6.entities.Singer;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcSingerDao implements SingerDao, InitializingBean {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override public String findNameById(Long id) {
		return jdbcTemplate.queryForObject(
				"select first_name || ' ' || last_name from singer where id = ?",
				new Object[]{id}, String.class);
	}

	@Override
	public String findFirstNameById(Long id) {
		return jdbcTemplate.queryForObject(
				"select first_name from singer where id = ?",
				new Object[]{id}, String.class);
	}

	@Override public List<Singer> findAll() {
		throw new NotImplementedException("findAll");
	}

	@Override public List<Singer> findByFirstName(String firstName) {
		throw new NotImplementedException("findByFirstName");
	}



	@Override public String findLastNameById(Long id) {
		throw new NotImplementedException("findLastNameById");
	}

	@Override public void insert(Singer singer) {
		throw new NotImplementedException("insert");
	}

	@Override public void update(Singer singer) {
		throw new NotImplementedException("update");
	}

	@Override public void delete(Long singerId) {
		throw new NotImplementedException("delete");
	}

	@Override public List<Singer> findAllWithAlbums() {
		throw new NotImplementedException("findAllWithAlbums");
	}

	@Override public void insertWithAlbum(Singer singer) {
		throw new NotImplementedException("insertWithAlbum");
	}

	@Override public void afterPropertiesSet() throws Exception {
		if (jdbcTemplate == null) {
			throw new BeanCreationException("Null JdbcTemplate on SingerDao");
		}
	}

}
