package ru.globux.spring.ch7.dao;

import ru.globux.spring.ch7.entities.Singer;

import java.util.List;


public interface SingerDao {

	List<Singer> findAll();

	List<Singer> findAllWithAlbum();

	Singer findById(Long id);

	Singer save(Singer singer);

	void delete(Singer singer);
}
